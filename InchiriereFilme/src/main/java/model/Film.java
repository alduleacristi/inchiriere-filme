package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Aceasta clasa retine informatii in legatura cu fiecare film.
 */
@Entity
@Table(name="filme")
@NamedQuery(name=Film.getFilme,query = "SELECT f FROM Film f")
public class Film {
	public static final String getFilme="getFilme";
	
	/**
	 * Identificator unic pentru un film.
	 */
	@Id
	@Column(name="idFilm")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idFilm;
	/**
	 * Retine numele unui film.
	 */
	@Column(name="Nume")
	private String nume;
	/**
	 * Retine anul in care a fost lansat un film.
	 */
	@Column(name="AnAparitie")
	private Integer anAparitie;
	/**
	 * Retine bugetul alocat filmului.
	 */
	@Column(name="Buget")
	private Double buget;
	/**
	 * Retine un obiect de tip GenFilm si reprezinta genul caruia ii apartine filmul.
	 */
	@JoinColumn(name="idGen")
	@OneToOne
	private GenFilm genFilm;
	/**
	 * Este un obiect de tip regizor si retine datele referitoare la cel ce a regizat filmul.
	 */
	@JoinColumn(name="idRegizor")
	@OneToOne
	private Regizor regizor;
	/**
	 * Este un obiect de tip Producator si retine datele referitoare la cel ce a produs filmul.
	 */
	@JoinColumn(name="idProducator")
	@OneToOne
	private Producator producator;
	
	@OneToMany(mappedBy="film")
	private List<ActorFilm> actors;

	public Integer getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(Integer idFilm) {
		this.idFilm = idFilm;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Integer getAnAparitie() {
		return anAparitie;
	}

	public void setAnAparitie(Integer anAparitie) {
		this.anAparitie = anAparitie;
	}

	public Double getBuget() {
		return buget;
	}

	public void setBuget(Double buget) {
		this.buget = buget;
	}

	public GenFilm getGenFilm() {
		return genFilm;
	}

	public void setGenFilm(GenFilm genFilm) {
		this.genFilm = genFilm;
	}

	public Regizor getRegizor() {
		return regizor;
	}

	public void setRegizor(Regizor regizor) {
		this.regizor = regizor;
	}

	public Producator getProducator() {
		return producator;
	}

	public void setProducator(Producator producator) {
		this.producator = producator;
	}

	public List<ActorFilm> getActors() {
		return actors;
	}

	public void setActors(List<ActorFilm> actors) {
		this.actors = actors;
	}

	public Film() {
		
	}
}