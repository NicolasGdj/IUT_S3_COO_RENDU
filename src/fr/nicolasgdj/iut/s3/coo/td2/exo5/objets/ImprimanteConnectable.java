package fr.nicolasgdj.iut.s3.coo.td2.exo5.objets;

import fr.nicolasgdj.iut.s3.coo.td2.exo4.Connectable;
import fr.nicolasgdj.iut.s3.coo.td2.exo3.Imprimante;
import fr.nicolasgdj.iut.s3.coo.td2.exo5.objets.adaptator.AdapatatorImprimante;

public class ImprimanteConnectable implements Connectable, AdapatatorImprimante{

	private Imprimante imprimante;
	
	public ImprimanteConnectable(Imprimante im) {
		this.imprimante = im;
	}
	
	@Override
	public void imprimer() {
		imprimante.imprimer();
	}

	@Override
	public void equiper(String gadget) {
		System.out.println("L'imprimante est équiper avec " + gadget);
	}

	@Override
	public void demarrer() {
		System.out.println("L'imprimante démarre");
	}
	
	@Override
	public String toString() {
		return imprimante.toString();
	}

}
