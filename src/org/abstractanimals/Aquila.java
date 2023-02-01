package org.abstractanimals;

public class Aquila extends Animale {

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

}
