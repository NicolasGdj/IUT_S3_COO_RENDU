package fr.nicolasgdj.iut.s3.coo.td2.exo4;

import java.util.HashSet;
import java.util.Set;

public class Demarreur {

	private Set<Connectable> objets = new HashSet<Connectable>();
	
	public void toutDemarrer() {
		for(Connectable c : objets) {
			if(c != null)
				c.demarrer();
		}
	}
	
	public void attacher(Connectable c) {
		objets.add(c);
	}
	
	public void dettacher(Connectable c) {
		if(objets.contains(c))
			objets.remove(c);
	}
	
	
	
}
