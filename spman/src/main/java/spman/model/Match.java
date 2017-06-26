package spman.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Match {
	
	@Id
	@GeneratedValue
	long idMatch;
}
