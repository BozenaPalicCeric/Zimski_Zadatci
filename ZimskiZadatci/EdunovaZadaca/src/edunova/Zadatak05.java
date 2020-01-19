package edunova;



import javax.swing.JOptionPane;

public class Zadatak05 {

	public static void main(String[] args) {
		// Kreirati program koji ispisuje cikliènu matricu (predložak u prilogu)
		//- ulaz su dva cijela broja

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		
		
		int [][] matrica =new int [a][b];
		int value = 1;
	    int minCol = 0;
	    int maxCol = b-1;
	    int minRow = 0;
	    int maxRow = a-1;
	    while (value <= a*b) {
	    	for (int i=(maxCol);i>=minCol;i--) {
	    		matrica[maxRow][i]=value;
	    		value++;		
	    }
	    	for (int i=(maxRow-1);i>=minRow;i--) {
	    		matrica[i][minCol]=value;
	    		value++;
	    	}
	    	for (int i=(minCol+1);i<=maxCol;i++) {
	    		matrica[minRow][i]=value;
	    		value++;
	    	}
	    	for(int i=(minRow+1);i<=(maxRow-1);i++) {
	    		matrica[i][maxCol]=value;
	    		value++;
	    	}
	    	
	    	minCol++;
            minRow++;
            maxCol--;
            maxRow--;
	}
	    for (int i = 0; i <= a-1; i++)
        {
            for (int j = 0; j <= b-1 ; j++)
            {
                System.out.print(matrica[i][j]+ "\t");
            }
             
            System.out.println();
        }
}
}



