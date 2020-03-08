package fr.nicolasgdj.iut.s3.coo.td2.exo3;

public class AppliDomotique {

	public static void main(String[] args) {
		Imprimante imprimante = new Scanner(new Fax(new Photocopier(new ImprimanteLocale())));
		imprimante.imprimer();
	}
	
}
