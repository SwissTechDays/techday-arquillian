package ch.sopra.techday.arquillian.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Phase 4 : création du modèle.
 * 
 * @author pescobar
 */
@Entity
// Renommage de la table pour Derby.
@Table(name = "T_USER")
public class User {

	@Id
	@GeneratedValue
	private Long id;

	private String lastname;

	private String firstname;

	/**
	 * Constructeur JPA.
	 */
	protected User() {

	}

	public User(String lastname, String firstname) {
		this.lastname = lastname;
		this.firstname = firstname;
	}

	public Long getId() {
		return id;
	}

	public String getLastname() {
		return lastname;
	}

	public String getFirstname() {
		return firstname;
	}

}
