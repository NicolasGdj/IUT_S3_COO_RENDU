package fr.nicolasgdj.iut.s3.coo.td2.exo4.objets;

import fr.nicolasgdj.iut.s3.coo.td2.exo4.Connectable;

public class Radio implements Connectable{

	@Override
	public void equiper(String gadget) {
		System.out.println("Radio équipé avec " + gadget + ".");
	}

	@Override
	public void demarrer() {
		System.out.println("La radio démarre.");
	}
	
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
