package org.abstractanimals;

import org.interfaceanimals.IVolante;

public class Aquila extends Animale implements IVolante {

	public Aquila(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void faiVerso() {
		System.out.println("Gwiiiiiiii");
		
	}

	@Override
	public void mangia() {
		System.out.println("L'aquila preda marmotte,"
				+ " lepri, fagianidi, corvidi, tartarughe,"
				+ " piccioni, conigli, giovani cerbiatti.");
		
	}

	@Override
	public void vola() {
		System.out.println("Sto volando, disse "+getNome()+".");
		
	}

}
