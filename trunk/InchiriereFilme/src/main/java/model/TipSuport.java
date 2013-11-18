package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Aceasta clasa retine informatii in legatura cu fiecare tip de suport pe care ar putea fi stocat si distribuit un film.
 */
@Entity
@Table(name="tipsuport")
@NamedQuery(name=TipSuport.getTipSuport,query = "SELECT ts FROM TipSuport ts")
public class TipSuport {
	public static final String getTipSuport="getTipSuport";
	
	/**
	 * Identificator unic pentru un tip de suport.
	 */
	@Id
	@Column(name="idTipSuport")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTipSuport;
	/**
	 * Numele unui tip de suport.
	 */
	@Column(name="TipSuport")
	private String tipSuport;

	public TipSuport() {
		
	}

	public Integer getIdTipSuport() {
		return idTipSuport;
	}

	public void setIdTipSuport(Integer idTipSuport) {
		this.idTipSuport = idTipSuport;
	}

	public String getTipSuport() {
		return tipSuport;
	}

	public void setTipSuport(String tipSuport) {
		this.tipSuport = tipSuport;
	}
}