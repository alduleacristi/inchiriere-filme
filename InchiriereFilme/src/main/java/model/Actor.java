package model;

import javax.persistence.*;

@Entity
@Table(name="Actori")
@NamedQuery(name=Actor.getActors,query = "SELECT a FROM Actor a")
public class Actor {
	public static final String getActors = "getActors";
	
	/**
	 * Identificator unic pentru un actor.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idActor;
	/**
	 * Retine numele unui actor.
	 */
	@Column(name = "Nume")
	private String nume;
	/**
	 * Retine prenumele unui actor.
	 */
	@Column(name="Prenume")
	private String prenume;
	/**
	 * Retine data nasterii unui actor.
	 */
	@Column(name="DataNasterii")
	private String dataNastere;
	/**
	 * Retine sexul unui actor.
	 */
	@Column(name="Sex")
	private String sex;
	/**
	 * Retine inaltimea unui actor.
	 */
	@Column(name="Inaltime")
	private Integer inaltime;
	/**
	 * Retine tara de origine a unui actor.
	 */
	@Column(name="Tara")
	private String tara;

	public Actor() {
		
	}

	public Integer getIdActor() {
		return idActor;
		
		
	}

	public void setIdActor(Integer idActor) {
		this.idActor = idActor;
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

	public String getSex() {
		return sex;
		
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getInaltime() {
		return inaltime;
		
	}

	public void setInaltime(Integer inaltime) {
		this.inaltime = inaltime;
	}

	public String getTara() {
		return tara;
		
	}

	public void setTara(Object aTara) {
		
	}
}