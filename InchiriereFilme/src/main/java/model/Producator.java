package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Aceasta clasa retine informatii legate de un producator de filme.
 */
@Entity
@Table(name="producatori")
@NamedQuery(name=Producator.getProducatori,query = "SELECT p FROM Producator p")
public class Producator {
	public static final String getProducatori = "getProducatori";
	
	/**
	 * Identificator unic pentru un producator.
	 */
	@Id
	@Column(name="idProducator")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idProducator;
	/**
	 * Retine numele unui producator.
	 */
	@Column(name="Nume")
	private String nume;
	/**
	 * Retine tara din care provine un producator.
	 */
	@Column(name="Tara")
	private String tara;
	/**
	 * Retine anul de infiintare al unui producator.
	 */
	@Column(name="anInfiintare")
	private Integer anInfiintare;

	public Producator() {
		
	}

	public Integer getIdProducator() {
		return idProducator;
	}

	public void setIdProducator(Integer idProducator) {
		this.idProducator = idProducator;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getTara() {
		return tara;
	}

	public void setTara(String tara) {
		this.tara = tara;
	}

	public Integer getAnInfiintare() {
		return anInfiintare;
	}

	public void setAnInfiintare(Integer anInfiintare) {
		this.anInfiintare = anInfiintare;
	}
}