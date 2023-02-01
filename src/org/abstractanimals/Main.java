package org.abstractanimals;

import org.movimento.Movimento;



public class Main {


	public static void main(String[] args) {

		Cane c = new Cane("Rex");
		Delfino d = new Delfino("Flipper");
		Aquila a = new Aquila("Anacleto");
		Passerotto p = new Passerotto("Titti");
		Movimento m=new Movimento();

		System.out.println(c.getNome());
		c.faiVerso();
		c.dormi();
		c.mangia();

		System.out.println(d.getNome());
		d.faiVerso();
		d.dormi();
		d.mangia();

		System.out.println(a.getNome());
		a.faiVerso();
		a.dormi();
		a.mangia();

		System.out.println(p.getNome());
		p.faiVerso();
		p.dormi();
		p.mangia();

		m.faiVolare(p);
		m.faiNuotare(d);
		m.faiVolare(a);

	}

}
