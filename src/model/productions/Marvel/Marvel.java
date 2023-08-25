package model.productions.Marvel;

import model.productions.Cine;
import model.productions.Heroe;
import model.productions.Hombre;
import model.productions.Mujer;
import model.productions.Villano;

public class Marvel implements Cine{

	@Override
	public Heroe getHeroe() {
		return new Spiderman();
	}

	@Override
	public Villano getVillano() {
		return new BlackCat();
	}

	@Override
	public Hombre getHombre() {
		return new Spiderman();
	}

	@Override
	public Mujer getMujer() {
		return new BlackCat();
	}
}
