import java.util.Scanner;

	public class ekavalikko {
			
		public static void main(String[] args) {
			
			alku();
		}
			
			public static void alku() {
				
			int luku = 0;
			
			Scanner lukija = new Scanner(System.in);
			
			System.out.println(" RESEPTIKIRJANPITO");
			System.out.println("* " + "1 - Lihareseptit");
			System.out.println("* " + "2 - Kalareseptit");
			System.out.println("* " + "3 - Kasvisreseptit");
			System.out.println("* " + "4 - Hae reseptiä");
			System.out.println(" \n");
			
			
			System.out.println("Mitä resepteja haluat katsoa? ");
			System.out.println("Syötä haluamasi luku: ");
			luku = lukija.nextInt();
			
			if (luku < 1 || luku > 4) {
				System.out.println("Väärä luku!"); 
				System.out.println("Mitä resepteja haluat katsoa? ");
				System.out.println("Syötä haluamasi luku: ");
				luku = lukija.nextInt();
			}	
			
			
			switch (luku) {
			case 1:
				lihaReseptit();
				break;
			case 2:
				//kalaReseptit();
				break;
			case 3:
				//kasvisReseptit();
				break;
			case 4:
				System.out.println("Anna hakusana: ");		
				String haku = lukija.nextLine();
				//haetaan?
				break;
			}
		}
	

		private static void lihaReseptit() {
			
			int luku = 0;
			
			Scanner lukija = new Scanner(System.in);
			
			System.out.println(" LIHARESEPTIT");
			System.out.println("* " + "1 - resepti");
			System.out.println("* " + "2 - resepti");
			System.out.println("* " + "3 - resepti");
			System.out.println("* " + "4 - palaa edelliseen valikkoon");
			System.out.println(" \n");
			
			
			System.out.println("Mitä lihareseptejä haluat katsoa? ");
			System.out.println("Syötä haluamasi luku: ");
			luku = lukija.nextInt();
			
			if (luku < 1 || luku > 4) {
				System.out.println("Väärä luku"); 
				System.out.println("Mitä lihareseptejä haluat katsoa? ");
				System.out.println("Syötä haluamasi luku: ");
				luku = lukija.nextInt();
			}	
			
			
			switch (luku) {
			case 1:
				System.out.println("Eka resepti"); 
				break;
			case 2:
				System.out.println("Toka resepti"); 
				break;
			case 3:
				System.out.println("Kolmas resepti"); 
				break;
			case 4:
				alku();
				break;
			}
			 
		 
			
		}
	} 