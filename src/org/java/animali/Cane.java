package org.java.animali;

import org.java.abs.Animale;

public class Cane extends Animale {
	
	


	public Cane(String nome) {
		super(nome);

	}

	@Override
	public String verso() {
		
		return "Bau Bau";
	}

	@Override
	public String mangia() {
		return "Sto mangiando croccantini!";
		
	}

}
