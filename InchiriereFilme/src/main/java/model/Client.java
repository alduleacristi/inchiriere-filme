package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="clienti")
@NamedQuery(name=Client.getClients,query = "Select c from Client c")
public class Client {
	public static final String getClients = "getClients";
	
	/**
	 * Identificator unic pentru client.
	 */
	@Id
	@Column(name="idClient")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idClient;
	/**
	 * Numele clientului.
	 */
	@Column(name="Nume")
	private String nume;
	/**
	 * Prenumele clientului.
	 */
	@Column(name="Prenume")
	private String prenume;
	/**
	 * Cnp-ul clientului.
	 */
	@Column(name="Cnp")
	private String cnp;
	/**
	 * Judetul in care locuieste clientul.
	 */
	@Column(name="Judet")
	private String judet;
	/**
	 * Orasul in care locuieste clientul.
	 */
	@Column(name="Oras")
	private String oras;
	/**
	 * Strada pe care locuieste clientul.
	 */
	@Column(name="Strada")
	private String strada;
	/**
	 * Numarul la care locuieste clientul.
	 */
	@Column(name="Nr")
	private String nr;
	/**
	 * Numarul de telefon al clientului.
	 */
	@Column(name="NumarTelefon")
	private String nrTelefon;

	public Client() {
		
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
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

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public String getJudet() {
		return judet;
	}

	public void setJudet(String judet) {
		this.judet = judet;
	}

	public String getOras() {
		return oras;
	}

	public void setOras(String oras) {
		this.oras = oras;
	}

	public String getStrada() {
		return strada;
	}

	public void setStrada(String strada) {
		this.strada = strada;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}

}