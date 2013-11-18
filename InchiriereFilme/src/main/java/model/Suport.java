package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="suport")
@NamedQuery(name=Suport.getSuport,query = "SELECT s FROM Suport s")
public class Suport {
	public static final String getSuport = "getSuport";
	
	/**
	 * Identificator unic pentru un suport de film.
	 */
	@Id
	@Column(name = "idSuport")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSuport;
	/**
	 * Codul pe baza caruia se identifica un suport de film.
	 */
	@Column(name = "Cod")
	private Long cod;
	/**
	 * Este un obiect instanta al clasei TipSuport si retine tipul suportului.
	 */
	@OneToOne
	@JoinColumn(name = "idTipSuport")
	private TipSuport tipSuport;
	/**
	 * Este un obiect de tip Film si retine filmul ce se afla pe suport.
	 */
	@OneToOne
	@JoinColumn(name = "idFilm")
	private Film film;

	public Suport() {
		
	}

	public Integer getIdSuport() {
		return idSuport;
	}

	public void setIdSuport(Integer idSuport) {
		this.idSuport = idSuport;
	}

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public TipSuport getTipSuport() {
		return tipSuport;
	}

	public void setTipSuport(TipSuport tipSuport) {
		this.tipSuport = tipSuport;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}
}