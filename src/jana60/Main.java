package jana60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Effettuato dalla Sessione 3

		Scanner scan = new Scanner(System.in);

		ArrayList<String> listaDesideri = new ArrayList<String>();

		boolean flag = true;
		do {
			System.out.println("Benvenuto nella lista dei tuoi desideri, ricorda hai un massimo di 3 desideri!");
			String scelta;
			boolean flag2 = true;
			do {
				System.out.println("Cosa vuoi fare? Inserisci 1 per inserire un nuovo desiderio 2 per uscire");
				scelta = scan.nextLine();
				if (scelta.equalsIgnoreCase("1") || scelta.equalsIgnoreCase("2")) {
					flag2 = false;

				}

			} while (flag2);
			switch (scelta) {
			case "1":

				if (listaDesideri.size() < 3) {
					System.out.println("Inserisci il tuo desiderio: ");
					listaDesideri.add(scan.nextLine());
					System.out.println("Hai espresso " + listaDesideri.size() + " desideri,"
							+ " ecco la lista dei desideri espressi finora: " + listaDesideri);
				} else {
					System.out.println("Hai già espresso tutti i tuoi desideri!");
					flag = false;
				}
				break;

			default:
				flag = false;

				break;
			}

		} while (flag);
		Collections.sort(listaDesideri);
		System.out.println("Ecco la tua lista finale ordinata: " + listaDesideri);
		System.out.println("Torna a trovarci per altri desideri!");

		scan.close();

	}

}
