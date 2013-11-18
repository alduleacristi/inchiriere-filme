package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Aceasta clasa retine informatii referitoare la un regizor.
 */
@Entity
@Table(name="regizor")
@NamedQuery(name=Regizor.getRegizori,query = "SELECT r FROM Regizor r")
public class Regizor {
	public static final String getRegizori="getRegizori";
	
	/**
	 * Identificator unic pentru un regizor.
	 */
	@Id
	@Column(name="idRegizor")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRegizor;
	/**
	 * Retine numele unui regizor.
	 */
	@Column(name="Nume")
	private String nume;
	/**
	 * Retine prenumele unui regizor.
	 */
	@Column(name="Prenume")
	private String prenume;
	/**
	 * Retine data nasterii pentru un regizor.
	 */
	@Column(name="DataNasterii")
	private String dataNastere;
	
	/**
	 * Retine tara de origine a regizorului.
	 */
	@Column(name="Tara")
	private String tara;

	public Regizor() {
		
	}

	public int getIdRegizor() {
		return idRegizor;
	}

	public void setIdRegizor(int idRegizor) {
		this.idRegizor = idRegizor;
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

	public String getDataNastere() {
		return dataNastere;
	}

	public void setDataNastere(String dataNastere) {
		this.dataNastere = dataNastere;
	}

	public String getTara() {
		return tara;
	}

	public void setTara(String tara) {
		this.tara = tara;
	}
}