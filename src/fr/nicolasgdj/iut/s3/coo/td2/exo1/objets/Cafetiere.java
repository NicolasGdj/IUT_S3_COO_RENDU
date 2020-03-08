package fr.nicolasgdj.iut.s3.coo.td2.exo1.objets;

import fr.nicolasgdj.iut.s3.coo.td2.exo1.Connectable;

public class Cafetiere implements Connectable{
	
	@Override
	public void equiper(String gadget) {
		System.out.println("Cafetiere équipé avec " + gadget + ".");
	}

}
