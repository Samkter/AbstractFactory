package model.productions.DC;

import model.productions.Heroe;
import model.productions.Mujer;

public class BatGirl implements Heroe, Mujer{

	@Override
	public String golpeM() {
		return "*Patada* *Puño* *Patada*";
	}

	@Override
	public String darFrase() {
		return " Tus dias de fechorias acaban aqui Guason "+ golpeM();
	}
}
