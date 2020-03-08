package fr.nicolasgdj.iut.s3.coo.td2.exo5;

import java.util.ArrayList;
import java.util.Scanner;

import fr.nicolasgdj.iut.s3.coo.td2.exo4.Connectable;
import fr.nicolasgdj.iut.s3.coo.td2.exo4.Demarreur;
import fr.nicolasgdj.iut.s3.coo.td2.exo5.objets.factory.ConnectableFactory;


public class AppliDomotique {

	public static ArrayList<Connectable> objetsConnectee = new ArrayList<Connectable>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String action = "";
		String application = "Google Home";
		do {
			System.out.println("Entrer le nom de l'objet à connecter : (quit pour quitter)");

			action = scanner.nextLine();
			Connectable c = null;

			if(action.isEmpty()) continue;

			if(action.equals("quit")) break;
			try {
				c = ConnectableFactory.create(action);
			} catch (ClassNotFoundException e) {
			
			}

			if(c != null) {
				c.equiper(application);
				objetsConnectee.add(c);
			}else {
				System.out.println("Objet introuvable.");
			}
			
		}while(scanner.hasNext());
		

		attacher();
		dettacher();
		
		demarreur.toutDemarrer();
		
		System.out.println("GoodBye");
		
	}	
	
	private static Demarreur demarreur = new Demarreur();
	
	public static void attacher() {

		for(Connectable c : objetsConnectee) {
			System.out.println("Faut-il attacher " + c + " ?");
			if(scanner.hasNext() && scanner.nextBoolean()) {
				demarreur.attacher(c);
				System.out.println(c + " attacher !");
			}
		}
	}
	
	
	public static void dettacher() {

		for(Connectable c : objetsConnectee) {
			System.out.println("Faut-il déttacher " + c + " ?");
			if(scanner.hasNext() && scanner.nextBoolean()) {
				demarreur.dettacher(c);
				System.out.println(c + " déttacher !");
			}
		}
	}
	


}
