package org.abstractanimals;

public abstract class Animale {

	// void dormi() (mostra a video “Zzz”)
	// void verso() (mostra a video il verso fatto dall'animale specifico)
	// - void mangia() (mostra a video quello che mangia : erba, carne, ...?)
	private String nome;
		
	public Animale(String nome) {
		super();
		this.nome = nome;
	}
	
	

	public String getNome() {
		return nome;
	}



	public void dormi() {
		System.out.println("ZZZ-zzz");
	}

	public abstract void faiVerso();
	
	public abstract void mangia();
}
