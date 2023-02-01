package org.abstractanimals;

public class Cane extends Animale {

	public Cane(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void faiVerso() {
		System.out.println("Bau Bau");
		
	}

	@Override
	public void mangia() {
		System.out.println("Il cane è onnivoro.");
		
	}

}
