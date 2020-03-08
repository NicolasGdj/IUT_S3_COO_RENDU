package fr.nicolasgdj.iut.s3.coo.td2.exo2.objets;

import fr.nicolasgdj.iut.s3.coo.td2.exo2.Connectable;

public class Radiateur implements Connectable{

	@Override
	public void equiper(String gadget) {
		System.out.println("Radiateur équipé avec " + gadget + ".");
	}

}
