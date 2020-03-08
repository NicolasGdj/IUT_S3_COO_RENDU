package fr.nicolasgdj.iut.s3.coo.td2.exo2;

import java.util.ArrayList;
import java.util.Scanner;

import fr.nicolasgdj.iut.s3.coo.td2.exo2.objets.factory.ConnectableFactory;

public class AppliDomotique {

	public static ArrayList<Connectable> objetsConnectee = new ArrayList<Connectable>();

	//	public static void main(String[] args) {
	//		Scanner scanner = new Scanner(System.in);
	//		String action = "";
	//		String application = "Google Home";
	//		while(scanner.hasNext() && !action.equalsIgnoreCase("quit")) {
	//			action = scanner.nextLine();
	//			Connectable c = null;
	//
	//			if(action.isEmpty()) continue;
	//
	//			try {
	//				Class<?> clazz = Class.forName("fr.nicolasgdj.iut.s3.coo.td2.exo2.objets."+action);
	//				if(Connectable.class.isAssignableFrom(clazz)) {
	//					c = (Connectable) clazz.getConstructors()[0].newInstance();
	//				}else {
	//					throw new ClassNotFoundException();
	//				}
	//			
	//			}catch(Exception e) {
	//				System.out.println("Objet introuvable.");
	//			}
	//			if(c != null) {
	//				c.equiper(application);
	//				objetsConnectee.add(c);
	//			}
	//		}
	//		System.out.println("GoodBye");
	//	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
			}else {
				System.out.println("Objet introuvable.");
			}
			
		}while(scanner.hasNext());
		System.out.println("GoodBye");
	}	


}
