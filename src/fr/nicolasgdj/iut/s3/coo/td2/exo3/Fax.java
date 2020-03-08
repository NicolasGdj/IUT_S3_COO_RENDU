package fr.nicolasgdj.iut.s3.coo.td2.exo3;

public class Fax extends Imprimante implements IFaxable{

	Imprimante imprimante;
	
	public Fax(Imprimante imprimante) {
		this.imprimante = imprimante;
	}
	
	@Override
	public void imprimer() {
		imprimante.imprimer();
		fax();
	}
	
	@Override
	public void fax() {
		System.out.println("La fonction fax est activé.");
	}

}
