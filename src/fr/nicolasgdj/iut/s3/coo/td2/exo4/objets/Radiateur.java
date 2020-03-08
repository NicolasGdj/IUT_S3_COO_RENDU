package fr.nicolasgdj.iut.s3.coo.td2.exo4.objets;

import fr.nicolasgdj.iut.s3.coo.td2.exo4.Connectable;

public class Radiateur implements Connectable{

	@Override
	public void equiper(String gadget) {
		System.out.println("Radiateur équipé avec " + gadget + ".");
	}

	@Override
	public void demarrer() {
		System.out.println("Le radiateur démarre.");
	}
	
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
