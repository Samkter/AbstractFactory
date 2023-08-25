package model.productions.Marvel;

import model.productions.Heroe;
import model.productions.Hombre;


public class Spiderman implements Heroe, Hombre{

	@Override
	public String golpeH() {
		return "swish swish";
	}

	@Override
	public String darFrase() {
		return "Soy tu amigable vecino el hombre araña "+ golpeH();
	}
}

