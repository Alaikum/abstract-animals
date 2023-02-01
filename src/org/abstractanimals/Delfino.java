package org.abstractanimals;

import org.interfaceanimals.INuotante;

public class Delfino extends Animale implements INuotante {

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

	@Override
	public void nuota() {
		System.out.println("Sto nuotando, disse "+getNome()+".");
	}

}
