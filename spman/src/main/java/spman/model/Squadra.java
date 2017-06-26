package spman.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Squadra {
	@Id
	@GeneratedValue
	private long idSquadra;
	
	private String nomeSquadra;
	
	private byte[] fotoSquadra;

	public String getNomeSquadra() {
		return nomeSquadra;
	}

	public void setNomeSquadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
	}

	public byte[] getFotoSquadra() {
		return fotoSquadra;
	}

	public void setFotoSquadra(byte[] fotoSquadra) {
		this.fotoSquadra = fotoSquadra;
	}

}
