package edunova;

import javax.swing.JOptionPane;

public class Zadatak04DrugiNacin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kreirati program koji unosi dvije matrice 4x4 te ispisuje njihov zbroj

		int[][] matrica_1 = new int[4][4];
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				matrica_1[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Unesi broj na mjesto: " + (i + 1) + "," + (j + 1)));
			}
		}
		int[][] matrica_2 = new int[4][4];
		for (int a = 0; a <= 3; a++) {
			for (int b = 0; b <= 3; b++) {
				matrica_2[a][b] = Integer
						.parseInt(JOptionPane.showInputDialog("Unesi broj na mjesto: " + (a + 1) + "," + (b + 1)));

			}
		}

		int[][] matrica_3 = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrica_3[i][j] = matrica_1[i][j] + matrica_2[i][j];
				System.out.print(matrica_3[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
