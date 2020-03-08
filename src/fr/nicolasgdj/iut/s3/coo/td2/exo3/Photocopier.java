package fr.nicolasgdj.iut.s3.coo.td2.exo3;

public class Photocopier extends Imprimante implements IPhotocopiable{

	Imprimante imprimante;
	
	public Photocopier(Imprimante imprimante) {
		this.imprimante = imprimante;
	}
	
	@Override
	public void imprimer() {
		imprimante.imprimer();
		photocopie();
	}

	@Override
	public void photocopie() {
		System.out.println("La fonction photocopie est activé.");
	}
}
