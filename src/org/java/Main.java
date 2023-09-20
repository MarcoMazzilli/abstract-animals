package org.java;

import org.java.abs.Animale;
import org.java.animali.Cane;
import org.java.animali.Passerotto;

public class Main {
	public static void main(String[] args) {
		
		Animale c1 = new Cane("Ettore");
		System.out.println(c1);
		c1.dormi();

		
		System.out.println("\n---------\n");
		
		Animale p1 = new Passerotto("Cippi");
		System.out.println(p1);
		p1.dormi();
		if(p1 instanceof Passerotto) {
			Passerotto p = (Passerotto) p1;
			p.vola();
		}
		
		
	}
}
