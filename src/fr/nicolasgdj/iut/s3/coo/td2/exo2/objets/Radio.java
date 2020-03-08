package fr.nicolasgdj.iut.s3.coo.td2.exo2.objets;

import fr.nicolasgdj.iut.s3.coo.td2.exo2.Connectable;

public class Radio implements Connectable{

	@Override
	public void equiper(String gadget) {
		System.out.println("Radio équipé avec " + gadget + ".");
	}

}
