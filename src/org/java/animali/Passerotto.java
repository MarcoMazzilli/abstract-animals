package org.java.animali;

import org.java.abs.Animale;
import org.java.interf.Volante;

public class Passerotto extends Animale implements Volante {

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
	@Override
	public void vola() {
		System.out.println("Sto volando!");
	}

}
