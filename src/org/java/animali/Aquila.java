package org.java.animali;

import org.java.abs.Animale;

public class Aquila  extends Animale{

	public Aquila(String nome) {
		
		super(nome);
	}

	@Override
	public String verso() {
		
		return "Verso Aquila";
	}

	@Override
	public String mangia() {
		
		return "Mangio di tutto sono un aquila";
	}

}
