package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Aceasta clasa retine informatii in legatura cu fiecare gen de filme.
 */
@Entity
@Table(name="genfilme")
@NamedQuery(name=GenFilm.getGenFilm,query = "SELECT gf FROM GenFilm gf")
public class GenFilm {
	public static final String getGenFilm = "getGenFilm";
	
	/**
	 * Identificator unic pentru un gen de film.
	 */
	@Id
	@Column(name="idGenFilm")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idGenFilm;
	/**
	 * Numele unui gen de film.
	 */
	@Column(name="Nume")
	private String nume;

	public Integer getIdGenFilm() {
		return idGenFilm;
	}

	public void setIdGenFilm(Integer idGenFilm) {
		this.idGenFilm = idGenFilm;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public GenFilm() {
		
	}
}