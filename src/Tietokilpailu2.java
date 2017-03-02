import java.util.Scanner;

public class Tietokilpailu2 {
	public static void main(String[] args) {

		tietokilpailu();
	}

	public static void tietokilpailu() {
		Scanner lukija = new Scanner(System.in);

		int Syote[][] = new int[10][3];
		int tyyppi;
		String takaisin = "\rPaina enter palataksesi alkuun. ";
		String oikein = "Oikein!";
		String kaikkiOikein = "Sait kaikki kysymykset oikein!!!";
		String vaarin = "Väärin! Oikeita vastauksia: ";

		String[][] Kysymykset = new String[10][3];
		Kysymykset[0][1] = "Valitsit aihealueeksi matematiikan \rPaljonko on 2+3? \r1) 2 \r2) 4 \r3) 5 \r4) 10 \r\r";
		Kysymykset[1][1] = "Paljonko on 21*6 \r1) 72 \r2) 175 \r3) 123 \r4) 137 \r\r";
		Kysymykset[2][1] = "Paljonko on 32*3217+453*13/0*543+2-557? \r1) 753 \r2) 152636217 \r3) 4242764 \r4) Mahdoton laskutoimitus \r\r";
		Kysymykset[3][1] = "Paljonko on 6^4? \r1) 1296 \r2) 24 \r3) 126 \r4) 1330 \r\r";
		Kysymykset[4][1] = "Paljonko on 531-242/2? \r1) 290 \r2) 134.5 \r3) 144.5 \r4) 193.5 \r\r";
		Kysymykset[5][1] = "Miksi kutsutaan numeroa, jossa on 18 nollaa (1 000 000 000 000 000 000)? \r1) Biljoona \r2) Triljoona \r3) Kvadriljoona \r4) Trigintiljoona \r\r";
		Kysymykset[6][1] = "Paljonko on 2^2+4*6-2/2? \r1) 31 \r 2) 47 \r 3) 42 \r 4) 36 \r";
		Kysymykset[7][1] = "Kuinka monta metriä on yksi maili? \r1) 2104.32 \r2) 1000 \r3) 1609.344 \r4) 1467.6 \r\r";
		Kysymykset[8][1] = "Kuinka monta metriä on valovuodessa? \r1) 4 633 533 153 321 589 100 \r2) 9 460 730 472 580 800 \r3) 12 426 144 325 145 600 \r4) Valovuosi mittaa aikaa, ei matkaa \r\r";
		Kysymykset[9][1] = "Mikä seuraavista ei ole alkuluku? \r1) 7489 \r2) 4517 \r3) 6203 \r4) 5317 \r\r";
		Kysymykset[0][2] = "Valitsit aihealueeksi maantieteen \rMikä on puolan pääkaupunki? \r1) Tallinna \r2) Tukholma \r3) Helsinki \r4) Varsova \r\r";
		Kysymykset[1][2] = "Mikä on maailman pienin valtio? \r1) Hong Kong \r2) Vatikaanivaltio \r3) Lichenstein \r4) Nauru \r\r";
		Kysymykset[2][2] = "Mikä seuraavista valtioista ei sijaitse afrikassa? \r1) Madagaskar \r2) Egypt \r3) Israel \r4) Angola \r\r";
		Kysymykset[3][2] = "Montako jäsenvaltiota on Euroopan Unionissa? \r1) 24 \r2) 25 \r3) 26 \r4) 27 \r\r";
		Kysymykset[4][2] = "Mikä on maailman suurin meri? \r1) Atlantin valtameri \r2) Intian valtameri \r3) Itämeri \r4) Tyynimeri \r\r";
		Kysymykset[5][2] = "Mikä on Kuuban aikavyöhyke talviaikaan? \r1) UTC-4 \r2) UTC-5 \r3) UTC-6 \r4) UTC-7 \r\r";
		Kysymykset[6][2] = "Paljonko on Taiwanin väkiluku? \r1) Noin 23 miljoonaa \r2) Noin 15 miljoonaa \r3) Noin 9 miljoonaa \r4) Noin 31 miljoonaa \r\r";
		Kysymykset[7][2] = "Missä maassa on mitattu kaikkien aikojen lämpöennätys? \r1) Yhdysvallat \r2) Australia \r3) Meksiko \r4) Irak \r\r";
		Kysymykset[8][2] = "Mikä on yhdysvaltojen neljäskymmenesneljäs (44.) osvaltio? \r1) Wyoming \r2) Alaska \r3) Colorado \r4) Georgia \r\r";
		Kysymykset[9][2] = "Millä japanin saarella sijaitsee Sapporon kaupunki? \r1) Shikoku \r2) Kyunshu \r3) Hokkaido \r4) Honshu \r\r";

		int[][] Vastaukset = new int[10][3];
		Vastaukset[0][1] = 3;
		Vastaukset[1][1] = 3;
		Vastaukset[2][1] = 4;
		Vastaukset[3][1] = 1;
		Vastaukset[4][1] = 3;
		Vastaukset[5][1] = 2;
		Vastaukset[6][1] = 1;
		Vastaukset[7][1] = 3;
		Vastaukset[8][1] = 2;
		Vastaukset[9][1] = 4;
		Vastaukset[0][2] = 4;
		Vastaukset[1][2] = 2;
		Vastaukset[2][2] = 3;
		Vastaukset[3][2] = 4;
		Vastaukset[4][2] = 4;
		Vastaukset[5][2] = 2;
		Vastaukset[6][2] = 1;
		Vastaukset[7][2] = 1;
		Vastaukset[8][2] = 1;
		Vastaukset[9][2] = 3;

		System.out.println("Tervetuloa tietokilpailuun");
		System.out.println("Tämä ohjelma antaa sinulle kymmenen kysymystä haluamaltasi alueelta");
		System.out.println("Kysymykset ovat monivalinta tehtäviä, joihin sinun pitää vastata oikein edetäksesi");
		System.out.println("***************************");
		System.out.println("Mitkä kysymykset haluat?");
		System.out.println("1) Matematiikka, 2) Maantiede");
		System.out.println("Kirjoita sen alueen numero, mitä haluat suorittaa (esim: 2).");
		tyyppi = lukija.nextInt();

		if (0 > tyyppi || tyyppi < 3) {
			{
				for (int i = 0; i <= 9; i++) {
					System.out.print(Kysymykset[i][tyyppi]);
					Syote[i][tyyppi] = lukija.nextInt();
					if (Syote[i][tyyppi] == Vastaukset[i][tyyppi]) {
						System.out.println(oikein);
					} else {
						System.out.print(vaarin + i);
						System.out.println(takaisin);
						lukija.nextLine();
						lukija.nextLine();
						{
							tietokilpailu();
						}
						System.exit(0);
					}

				}
				System.out.print(kaikkiOikein);
				System.out.println(takaisin);
				lukija.nextLine();
				lukija.nextLine();
				{
					tietokilpailu();
				}
			}
		}

		else {
			System.out.println("Virheellinen valinta!");
		}

	}
}