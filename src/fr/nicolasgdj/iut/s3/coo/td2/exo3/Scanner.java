package fr.nicolasgdj.iut.s3.coo.td2.exo3;

public class Scanner extends Imprimante implements IScannable{

	Imprimante imprimante;
	
	public Scanner(Imprimante imprimante) {
		this.imprimante = imprimante;
	}
	
	@Override
	public void imprimer() {
		imprimante.imprimer();
		scanner();
	}

	@Override
	public void scanner() {
		System.out.println("La fonction scanner est activé.");
	}

}
