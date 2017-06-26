package spman.interfaces;

import spman.model.Squadra;

public class SquadraDecorator<E> extends Squadra{

	private E prm;
	
	private Squadra sqd;
	
	SquadraDecorator (Squadra squadra,E parameter)
	{
		prm = parameter;
		sqd = squadra;
	}

	public E getPrm() {
		return prm;
	}

	public Squadra getSqd() {
		return sqd;
	}
	
	
	
}
