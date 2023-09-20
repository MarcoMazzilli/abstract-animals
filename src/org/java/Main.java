package org.java;

import org.java.abs.Animale;
import org.java.animali.Aquila;
import org.java.animali.Cane;
import org.java.animali.Delfino;
import org.java.animali.Passerotto;
import org.java.interf.Nuotante;
import org.java.interf.Volante;

public class Main {
	
	public static void faiVolare (Volante item) {
		item.vola();
	}
	public static void faiNuotare (Nuotante item) {
		item.nuota();
	}
	
	
	public static void main(String[] args) {
		
		Animale[] arrayAnimali = new Animale[4];
		
		arrayAnimali[0] = new Cane("Ettore");
		arrayAnimali[1]  = new Passerotto("Cippi");
		arrayAnimali[2]  = new Delfino("Dolfy");
		arrayAnimali[3]  = new Aquila("Aquilotto");
		
//		for (int i = 0; i < arrayAnimali.length; i++) {
//			System.out.println(arrayAnimali[i]);
//			System.out.println("\n-----------\n");
//		}
		
		for (int i = 0; i < arrayAnimali.length; i++) {
			
			System.out.println(arrayAnimali[i].verso());
			
			if(arrayAnimali[i] instanceof Volante) {
				
				Volante v = (Volante) arrayAnimali[i];
				v.vola();
				
			}else if (arrayAnimali[i] instanceof Nuotante) {
				
				Nuotante n = (Nuotante) arrayAnimali[i];
				n.nuota();
				
			}else {
				
				System.out.println("Io ne nuoto ne volo...cammino!");
				
			}
			
			System.out.println("\n-----------\n");
		}

		
	}
}
