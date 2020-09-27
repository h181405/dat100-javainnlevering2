package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		System.out.print("[");
		
		for(int tall : tabell) {
			System.out.print(tall + " ");
		}
		
		System.out.println("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String rekke = "[";
		
		for(int i = 0;i<tabell.length;i++) {
			rekke = rekke + tabell[i];
			if(i < tabell.length - 1 ) {
				rekke = rekke + ",";
			}
		}
		
		rekke = rekke + "]";
		
		return rekke;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		
		for(int tall : tabell) {
			sum += tall;
		}
		/*
		for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		
		int i = 0;
		while(i<tabell.length) {
			sum += tabell[i];
			
			i++;
		}
		*/
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean eksisterer = false;
		
		for(int verdi : tabell) {
			if(verdi==tall) {
				eksisterer = true;
			}
		}
		
		return eksisterer;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int index = -1;
		
		for(int i = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
				index = i;
				break;
			}
		}
		
		return index;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int nytabell[] = new int[tabell.length];
		
		int index = tabell.length - 1;
		
		for (int i = index; i >= 0; i--) {
			nytabell[i] = tabell[index-i];
		}
		
		return nytabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		
		for(int i = 0; i < tabell.length - 1; i++) {
			if(tabell[i] > tabell[i+1]) {
				sortert = false;
			}
		}
		
		return sortert;
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nytabell[] = new int[tabell1.length + tabell2.length];
		
		for(int i = 0; i < tabell1.length;i++) {
			nytabell[i] = tabell1[i];
		}
		
		for(int i = 0; i < tabell2.length;i++) {
			nytabell[i + tabell1.length] = tabell2[i];
		}
		
		return nytabell;
	}
}
