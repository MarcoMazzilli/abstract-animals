package org.java.animali;

import org.java.abs.Animale;

public class Passerotto extends Animale {

	public Passerotto(String nome) {
		super(nome);

	}

	@Override
	public String verso() {
		return "Cip Cip";
		
	}

	@Override
	public String mangia() {
		return "Sto mangiando vermetti";
		
	}

}
