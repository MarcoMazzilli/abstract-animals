package org.java.animali;

import org.java.abs.Animale;
import org.java.interf.Volante;

public class Aquila extends Animale implements Volante {

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

	@Override
	public void vola() {
		System.out.println("Sto volando!");		
	}

}
