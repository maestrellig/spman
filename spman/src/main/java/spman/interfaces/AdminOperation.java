package spman.interfaces;


import java.util.List;

import spman.model.Match;
import spman.model.Squadra;

public interface AdminOperation {
	
	Esito inserisciSquadra(String nomeAdmin,String pwd,String timeStamp,Squadra squadra);
	
	Esito creaCampionato(String nomeCampionato,int nSquadrePerMatch);
	
	Esito updateMatch(List<Match> match);

}
