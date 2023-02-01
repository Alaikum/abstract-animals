package org.abstractanimals;

public class Delfino extends Animale {

	public Delfino(String nome) {
		super(nome);

	}

	@Override
	public void faiVerso() {
		System.out.println("Trrrrrr");

	}

	@Override
	public void mangia() {
		System.out.println("Il delfino si nutre di pesci e piccoli molluschi.");

	}

}
