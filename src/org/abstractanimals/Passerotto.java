package org.abstractanimals;

public class Passerotto extends Animale{

	public Passerotto(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void faiVerso() {
		System.out.println("Cip Cip");
		
	}

	@Override
	public void mangia() {
		System.out.println("Il passerotto si nutre di semi e frutta.");
		
	}

}
