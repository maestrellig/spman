package spman.interfaces;

import java.util.List;

import spman.model.Match;
import spman.model.Squadra;

public interface UserOperation {

	List<Match> getCalendario(String nomeCampionato);
	
	List<Match> getCalendario(String nomeCampionato,Squadra squadra);
	
	List<SquadraDecorator<Integer>> getClassifica(String nomeCampionato);
	
	Squadra getSquadra(long id);
	
	List<Squadra> findSquadra(String nomeSquadra);
	
	Squadra updateFotoSquadra(Squadra squadra,String pwd,String timeStamp);
	
	List<Match> getProssimaPartita(String nomeCampionato,Squadra squadra);
	
	Esito offriDataMatch(java.util.Date dataMatch,List<Match> nextMatch);
	
	Esito accettaOffertaMatch(java.util.Date dataMatch,List<Match> nextMatch);
	
	Esito iniziaIncontro(List<Match> currentMatch);
	
	Esito fineIncontro(List<Match> currentMatch);
	
	Esito accettaFineIncontro(List<Match> currentMatch);
	
}
