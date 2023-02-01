package org.abstractanimals;

import org.interfaceanimals.IVolante;

public class Passerotto extends Animale implements IVolante{

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

	@Override
	public void faiVolare() {
		System.out.println("Sto volando, disse "+getNome()+".");
		
	}

}
