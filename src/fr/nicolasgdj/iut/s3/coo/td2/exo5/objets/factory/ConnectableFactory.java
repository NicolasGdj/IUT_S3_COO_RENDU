package fr.nicolasgdj.iut.s3.coo.td2.exo5.objets.factory;

import fr.nicolasgdj.iut.s3.coo.td2.exo3.Fax;
import fr.nicolasgdj.iut.s3.coo.td2.exo3.ImprimanteLocale;
import fr.nicolasgdj.iut.s3.coo.td2.exo3.ImprimanteReseau;
import fr.nicolasgdj.iut.s3.coo.td2.exo4.Connectable;
import fr.nicolasgdj.iut.s3.coo.td2.exo4.objets.factory.CafetiereFactory;
import fr.nicolasgdj.iut.s3.coo.td2.exo4.objets.factory.RadiateurFactory;
import fr.nicolasgdj.iut.s3.coo.td2.exo4.objets.factory.RadioFactory;
import fr.nicolasgdj.iut.s3.coo.td2.exo5.objets.ImprimanteConnectable;

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
		case "ImprimanteReseau":
			c = new ImprimanteConnectable(new ImprimanteReseau());
			break;
		case "ImprimanteLocale":
			c = new ImprimanteConnectable(new ImprimanteLocale());
			break;
		case "FaxLocal":
			c = new ImprimanteConnectable(new Fax(new ImprimanteLocale()));
			break;
		case "FaxReseau":
			c = new ImprimanteConnectable(new Fax(new ImprimanteReseau()));
			break;
		default:
			throw new ClassNotFoundException();
		}
		return c;
	}
	
}
