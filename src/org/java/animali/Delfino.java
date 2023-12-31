package org.java.animali;

import org.java.abs.Animale;
import org.java.interf.Nuotante;

public class Delfino extends Animale implements Nuotante{

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

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!");
	}

}
