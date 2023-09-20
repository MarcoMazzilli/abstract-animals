package org.java.animali;

import org.java.abs.Animale;

public class Delfino extends Animale {

	public Delfino(String nome) {
		
		super(nome);
	}

	@Override
	public String verso() {
		
		return "Verso delfino";
	}

	@Override
	public String mangia() {

		return "Mangio i pesciolini";
	}

}
