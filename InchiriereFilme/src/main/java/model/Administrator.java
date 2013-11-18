package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity()
@Table(name="gestionar")
@NamedQuery(name=Administrator.getAdmins,query = "SELECT a FROM Administrator a")
public class Administrator {
	public static final String getAdmins = "getAdmins";
	
	/**
	 * Identificator de unicitate pentru Administrator.
	 */
	@Id
	@Column(name = "idGestionar")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idAdministrator;
	/**
	 * Numele administratorului.
	 */
	@Column(name="Nume")
	private String nume;
	/**
	 * Prenumele administratorului.
	 */
	@Column(name="Prenume")
	private String prenume;
	/**
	 * Numele de utilizator al administratorului.
	 */
	@Column(name="Utilizator")
	private String utilizator;
	/**
	 * Parola administratorului.
	 */
	@Column(name="Parola")
	private String parola;

	public Administrator() {
	
	}

	public Integer getIdAdministrator() {
		return idAdministrator;
	}

	public void setIdAdministrator(Integer idAdministrator) {
		this.idAdministrator = idAdministrator;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getUtilizator() {
		return utilizator;
	}

	public void setUtilizator(String utilizator) {
		this.utilizator = utilizator;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

}