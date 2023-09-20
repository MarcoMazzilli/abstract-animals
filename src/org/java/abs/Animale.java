package org.java.abs;

public abstract class Animale {
	
	private String nomeAnimale;
	
	public abstract String verso();
	public abstract String mangia();
	
	public Animale(String nome) {
		this.nomeAnimale = nome;
	}
	
	//GETTER SETTER
	public String getNomeAnimale() {
		return nomeAnimale;
	}

	public void setNomeAnimale(String nomeAnimale) {
		this.nomeAnimale = nomeAnimale;
	}
	//GETTER SETTER /
	
	public void dormi() {
		System.out.println("ZzzzZzzzZzzz");
	}
	
	@Override
	public String toString() {
		
		return "Nome Animale :" + getNomeAnimale() + "\n"
			  + "Verso animale : " + verso() + "\n" 
			  + "Cosa stai mangiando? " + mangia()
			  
		;
	}

}
