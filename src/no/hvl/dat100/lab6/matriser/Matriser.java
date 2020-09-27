package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int i = 0; i < matrise.length;i++) {
			for(int j = 0; j < matrise[i].length;j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String resultat = "";

		for(int i = 0; i < matrise.length;i++) {
			for(int j = 0; j < matrise[i].length;j++) {
				resultat = resultat + (matrise[i][j] + " ");
			}
			resultat = resultat + "\n";
		}
		return resultat;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int nymatrise[][] = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i < matrise.length;i++) {
			for(int j = 0; j < matrise[i].length;j++) {
				nymatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nymatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		boolean lik = true;

		for(int i = 0; i < a.length;i++) {
			for(int j = 0; j< a[i].length;j++) {
				if(a[i][j] != b[i][j]) {
					lik = false;
				}
			}
		}
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int nymatrise[][] = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i < matrise.length;i++) {
			for(int j = 0; j < matrise[i].length;j++) {
				nymatrise[j][i] = matrise[i][j];
			}
		}
		return nymatrise;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int nymatrise[][] = new int[a.length][b[0].length];
		
		for(int i = 0;i < nymatrise.length;i++) {
			for(int j = 0; j< nymatrise[i].length;j++) {
				int temp = 0;
				for(int k = 0; k<a[i].length;k++) {
					temp += a[i][k] * b[k][j];
				}
				nymatrise[i][j]=temp;
			}
		}
		return nymatrise;
	}
}
