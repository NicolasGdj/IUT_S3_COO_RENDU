package fr.nicolasgdj.iut.s3.coo.td2.exo2.objets.factory;

import fr.nicolasgdj.iut.s3.coo.td2.exo2.Connectable;

public interface ConnectableFactory {
	
	public Connectable create();

	public static Connectable create(String name) throws ClassNotFoundException {
		Connectable c = null;
		switch (name) {
		case "Radio":
			c = new RadioFactory().create();
			break;
		case "Radiateur":
			c = new RadiateurFactory().create();
			break;
		case "Cafetiere":
			c = new CafetiereFactory().create();
			break;
		default:
			throw new ClassNotFoundException();
		}
		return c;
	}
	
}
