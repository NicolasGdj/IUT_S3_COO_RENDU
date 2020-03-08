package fr.nicolasgdj.iut.s3.coo.td2.exo2.objets.factory;

import fr.nicolasgdj.iut.s3.coo.td2.exo2.Connectable;
import fr.nicolasgdj.iut.s3.coo.td2.exo2.objets.Radiateur;

public class RadiateurFactory implements ConnectableFactory{

	@Override
	public Connectable create() {
		return new Radiateur();
	}

}
