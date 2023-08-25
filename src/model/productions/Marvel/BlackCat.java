package model.productions.Marvel;

import model.productions.Mujer;
import model.productions.Villano;

public class BlackCat implements Villano, Mujer{

	@Override
	public String darFrase() {
		return "*Arañazo* *Arañazo*" + golpeM();
	}

	@Override
	public String golpeM() {
		return " Te ves tan lindo arañita ";
	}
}
