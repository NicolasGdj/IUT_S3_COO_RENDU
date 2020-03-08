package fr.nicolasgdj.iut.s3.coo.td2.exo1;

import java.util.ArrayList;
import java.util.Scanner;

import fr.nicolasgdj.iut.s3.coo.td2.exo1.objets.Cafetiere;
import fr.nicolasgdj.iut.s3.coo.td2.exo1.objets.Radio;

public class AppliDomotique {

	public static ArrayList<Connectable> objetsConnectee = new ArrayList<Connectable>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int action = -1;
		String application = "Google Home";

		do {
			System.out.println("Entrer le numéro de l'objet à connecter : (0=quitter)");
			try {
				action = scanner.nextInt();
				Connectable c = null;

				if(action == 0)
					break;
				
				switch (action) {
				case 1:
					c = new Cafetiere();
					break;
				case 2:
					c = new Radio();
					break;
				default:
					break;
				}
				if(c != null) {
					c.equiper(application);
					objetsConnectee.add(c);
				}else if(action != 0){
					System.out.println("Objet inconnu.");
				}
			}catch(Exception e) {
				System.out.println("Objet inconnu.");
			}

		}
		while(scanner.hasNext() && action != 0);
		System.out.println("GoodBye");
	}



}
