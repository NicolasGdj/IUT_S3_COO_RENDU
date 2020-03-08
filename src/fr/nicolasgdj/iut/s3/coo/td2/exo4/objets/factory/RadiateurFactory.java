package fr.nicolasgdj.iut.s3.coo.td2.exo4.objets.factory;

import fr.nicolasgdj.iut.s3.coo.td2.exo4.Connectable;
import fr.nicolasgdj.iut.s3.coo.td2.exo4.objets.Radiateur;

public class RadiateurFactory implements ConnectableFactory{

	@Override
	public Connectable create() {
		return new Radiateur();
	}

}
