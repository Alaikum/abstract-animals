package org.movimento;

import org.interfaceanimals.INuotante;
import org.interfaceanimals.IVolante;

public class Movimento {
	public void faiVolare(IVolante animale) {
		animale.vola();
	}

	public void faiNuotare(INuotante animale) {
		animale.nuota();
	}
}
