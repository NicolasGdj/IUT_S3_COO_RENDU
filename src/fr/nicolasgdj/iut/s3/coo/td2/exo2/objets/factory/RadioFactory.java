package fr.nicolasgdj.iut.s3.coo.td2.exo2.objets.factory;

import fr.nicolasgdj.iut.s3.coo.td2.exo2.Connectable;
import fr.nicolasgdj.iut.s3.coo.td2.exo2.objets.Radio;

public class RadioFactory implements ConnectableFactory{

	@Override
	public Connectable create() {
		return new Radio();
	}

}
