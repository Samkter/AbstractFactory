package model.productions.Marvel;

import model.productions.Mujer;
import model.productions.Villano;

public class BlackCat implements Villano, Mujer{

	@Override
	public String darFrase() {
		return "*Ara�azo* *Ara�azo*" + golpeM();
	}

	@Override
	public String golpeM() {
		return " Te ves tan lindo ara�ita ";
	}
}
