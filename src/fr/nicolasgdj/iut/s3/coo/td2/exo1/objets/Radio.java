package fr.nicolasgdj.iut.s3.coo.td2.exo1.objets;

import fr.nicolasgdj.iut.s3.coo.td2.exo1.Connectable;

public class Radio implements Connectable{

	@Override
	public void equiper(String gadget) {
		System.out.println("Radio équipé avec " + gadget + ".");
	}

}
