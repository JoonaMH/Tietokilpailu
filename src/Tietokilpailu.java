import java.util.Scanner;

public class Tietokilpailu {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int vastaus1;
		int vastaus2;
		int vastaus3;
		int vastaus4;
		int vastaus5;
		int vastaus6;
		int vastaus7;
		int vastaus8;
		int vastaus9;
		int vastaus10;
		int tyyppi;
		{
			System.out.println("Tervetuloa tietokilpailuun");
			System.out.println("T‰m‰ ohjelma antaa sinulle kymmenen kysymyst‰ haluamaltasi alueelta");
			System.out.println("Kysymykset ovat monivalinta teht‰vi‰, joihin sinun pit‰‰ vastata oikein edet‰ksesi");
			System.out.println("***************************");
			System.out.println("Mitk‰ kysymykset haluat?");
			System.out
					.println("1) Matematiikka, 2) Maantiede");
			System.out
					.println("Kirjoita sen alueen numero, mit‰ haluat suorittaa (esim: 2).");
			tyyppi = lukija.nextInt();

			if (tyyppi == 1) {
				{
					System.out.println("Valitsit aihealueeksi matematiikan");
					MatK[0]
					vastaus1 = lukija.nextInt();
					if (vastaus1 == 3) {
						System.out.println("Oikein!");
						System.out.println("Paljonko on 21*6? ");
						System.out.println("1) 72");
						System.out.println("2) 175");
						System.out.println("3) 126");
						System.out.println("4) 137");
						vastaus2 = lukija.nextInt();
						if (vastaus2 == 3) {
							System.out.println("Oikein!");
							System.out.println("Paljonko on 32*3217+453*13/0*543+2-557? ");
							System.out.println("1) 753");
							System.out.println("2) 124312451965");
							System.out.println("3) 4265363");
							System.out.println("4) Mahdoton laskutoimitus");
							vastaus3 = lukija.nextInt();
							if (vastaus3 == 4) {
								System.out.println("Oikein!");
								System.out.println("Paljonko on 6^4? ");
								System.out.println("1) 1296");
								System.out.println("2) 24");
								System.out.println("3) 126");
								System.out.println("4) 1330");
								vastaus4 = lukija.nextInt();
								if (vastaus4 == 1) {
									System.out.println("Oikein!");
									System.out.println("Paljonko on 531-242/2? ");
									System.out.println("1) 290");
									System.out.println("2) 134.5");
									System.out.println("3) 144.5");
									System.out.println("4) 193.5");
									vastaus5 = lukija.nextInt();
									if (vastaus5 == 3) {
										System.out.println("Oikein!");
										System.out.println("Miksi kutsutaan numeroa, jossa on 18 nollaa (1 000 000 000 000 000 000)? ");
										System.out.println("1) Biljoona");
										System.out.println("2) Triljoona");
										System.out.println("3) Kvadriljoona");
										System.out.println("4) Trigintiljoona");
										vastaus6 = lukija.nextInt();
										if (vastaus6 == 2) {
											System.out.println("Oikein!");
											System.out.println("Paljonko on 2^2+4*6-2/2? ");
											System.out.println("1) 31");
											System.out.println("2) 47");
											System.out.println("3) 42");
											System.out.println("4) 36");
											vastaus7 = lukija.nextInt();
											if (vastaus7 == 1) {
												System.out.println("Oikein!");
												System.out
														.println("Kuinka monta metri‰ on yksi maili? ");
												System.out
														.println("1) 2104.32");
												System.out.println("2) 1000");
												System.out
														.println("3) 1609.344");
												System.out.println("4) 1467.6");
												vastaus8 = lukija.nextInt();
												if (vastaus8 == 3) {
													System.out
															.println("Oikein!");
													System.out
															.println("Kuinka monta metri‰ on valovuodessa? ");
													System.out
															.println("1) 4 633 533 153 321 589 100");
													System.out
															.println("2) 9 460 730 472 580 800");
													System.out
															.println("3) 12 426 144 325 145 600");
													System.out
															.println("4) Valovuosi mittaa aikaa, ei matkaa");
													vastaus9 = lukija.nextInt();
													if (vastaus9 == 2) {
														System.out
																.println("Oikein!");
														System.out
																.println("Mik‰ seuraavista ei ole alkuluku? ");
														System.out
																.println("1) 7489");
														System.out
																.println("2) 4517");
														System.out
																.println("3) 6203");
														System.out
																.println("4) 5317");
														vastaus10 = lukija
																.nextInt();
														if (vastaus10 == 4) {
															System.out
																	.println("Oikein!");
															System.out
																	.println("Vastasit kaikkiin kysymyksiin oikein.");

														} else {
															System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

														}

													} else {
														System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

													}

												} else {
													System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

												}

											} else {
												System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

											}

										} else {
											System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

										}

									} else {
										System.out
												.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

									}
								} else {
									System.out
											.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

								}

							} else {
								System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

							}

						} else {
							System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

						}
					} else {
						System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

					}
				}
			} else if (tyyppi == 2) {
				System.out.println("Valitsit aihealueeksi maantieteen");
				System.out.println("Mik‰ on puolan p‰‰kaupunki?");
				System.out.println("1) Tallinna");
				System.out.println("2) Tukholma");
				System.out.println("3) Helsinki");
				System.out.println("4) Varsova");
				vastaus1 = lukija.nextInt();
				if (vastaus1 == 4) {
					System.out.println("Mik‰ on maailman pienin valtio? ");
					System.out.println("1) Hong Kong");
					System.out.println("2) Vatikaanivaltio");
					System.out.println("3) Lichenstein");
					System.out.println("4) Nauru");
					vastaus2 = lukija.nextInt();
					if (vastaus2 == 2) {
						System.out.println("Oikein!");
						System.out.println("Mik‰ seuraavista valtioista ei sijaitse afrikassa? ");
						System.out.println("1) Madagaskar");
						System.out.println("2) Egypt");
						System.out.println("3) Israel");
						System.out.println("4) Angola");
						vastaus3 = lukija.nextInt();
						if (vastaus3 == 3) {
							System.out.println("Oikein!");
							System.out.println("Montako j‰senvaltiota on Euroopan Unionissa? ");
							System.out.println("1) 24");
							System.out.println("2) 25");
							System.out.println("3) 26");
							System.out.println("4) 27");
							vastaus4 = lukija.nextInt();
							if (vastaus4 == 4) {
								System.out.println("Oikein!");
								System.out.println("Mik‰ on maailman suurin meri? ");
								System.out.println("1) Atlantin valtameri");
								System.out.println("2) Intian valtameri");
								System.out.println("3) It‰meri");
								System.out.println("4) Tyynimeri");
								vastaus5 = lukija.nextInt();
								if (vastaus5 == 4) {
									System.out.println("Oikein!");
									System.out.println("Mik‰ on Kuuban aikavyˆhyke talviaikaan? ");
									System.out.println("1) UTC-4");
									System.out.println("2) UTC-5");
									System.out.println("3) UTC-6");
									System.out.println("4) UTC-7");
									vastaus6 = lukija.nextInt();
									if (vastaus6 == 2) {
										System.out.println("Oikein!");
										System.out.println("Paljonko on Taiwanin v‰kiluku? ");
										System.out.println("1) Noin 23 miljoonaa");
										System.out.println("2) Noin 15 miljoonaa");
										System.out.println("3) Noin 9 miljoonaa");
										System.out.println("4) Noin 31 miljoonaa ");
										vastaus7 = lukija.nextInt();
										if (vastaus7 == 1) {
											System.out.println("Oikein!");
											System.out
													.println("Miss‰ maassa on mitattu kaikkien aikojen l‰mpˆenn‰tys? ");
											System.out
													.println("1) Yhdysvallat");
											System.out.println("2) Australia");
											System.out
													.println("3) Meksiko");
											System.out.println("4) Irak");
											vastaus8 = lukija.nextInt();
											if (vastaus8 == 1) {
												System.out
														.println("Oikein!");
												System.out
														.println("Mik‰ on yhdysvaltojen nelj‰skymmenesnelj‰s (44) osvaltio? ");
												System.out
														.println("1) Wyoming");
												System.out
														.println("2) Alaska");
												System.out
														.println("3) Colorado");
												System.out
														.println("4) Georgia");
												vastaus9 = lukija.nextInt();
												if (vastaus9 == 1) {
													System.out
															.println("Oikein!");
													System.out
															.println("Mill‰ japanin saarella sijaitsee Sapporon kaupunki? ");
													System.out
															.println("1) Shikoku");
													System.out
															.println("2) Kyunshu");
													System.out
															.println("3) Hokkaido");
													System.out
															.println("4) Honshu");
													vastaus10 = lukija
															.nextInt();
													if (vastaus10 == 3) {
														System.out
																.println("Oikein!");
														System.out
																.println("Vastasit kaikkiin kysymyksiin oikein.");

													} else {
														System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

													}

												} else {
													System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

												}

											} else {
												System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

											}

										} else {
											System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

										}

									} else {
										System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

									}

								} else {
									System.out
											.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

								}
							} else {
								System.out
										.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

							}

						} else {
							System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

						}

					} else {
						System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

					}
				} else {
					System.out.println("V‰‰rin! Et saanut kaikkia kysymyksi‰ oikein.");

				}
			
		

			} else {
				System.out.println("Virheellinen valinta");
			}
			String[] MatK = new String[10];
			MatK[0] = "Paljonko on 2+3? \r 1) 2 \r 2) 4 \r 3) 5 \r 4) 10";
			MatK[1] = "Matti";
			MatK[2] = "Matti";
			MatK[3] = "Matti";
			MatK[4] = "Matti";
			MatK[5] = "Matti";
			MatK[6] = "Matti";
			MatK[7] = "Matti";
			MatK[8] = "Matti";
			MatK[9] = "Matti";
			MatK[10] = "Matti";

		}
	}
}