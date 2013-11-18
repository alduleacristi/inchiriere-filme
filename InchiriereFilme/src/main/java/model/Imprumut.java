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
@Table(name = "imprumut")
@NamedQuery(name=Imprumut.getImprumuturi,query = "SELECT i FROM Imprumut i")
public class Imprumut {
	public static final String getImprumuturi = "getImprumuturi";
	
	/**
	 * Identificator unic pentru fiecare imprumut efectuat.
	 */
	@Id
	@Column(name = "idImprumut")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idImprumut;
	/**
	 * Data la care s-a facut imprumutul.
	 */
	@Column(name = "DataImprumut")
	private String dataImprumut;
	/**
	 * Data la care trebuie sa se faca returnarea.
	 */
	@Column(name = "DataReturnare")
	private String dataReturnare;
	/**
	 * Indica daca imprumutul a fost returnat sau nu.
	 */
	@Column(name = "Returnat")
	private boolean returnat;
	/**
	 * Retine clientul caruia i sa efectuat imprumutul.
	 */
	@OneToOne
	@JoinColumn(name = "idClient")
	private Client client;
	
	public Integer getIdImprumut() {
		return idImprumut;
	}

	public void setIdImprumut(Integer idImprumut) {
		this.idImprumut = idImprumut;
	}

	public String getDataImprumut() {
		return dataImprumut;
	}

	public void setDataImprumut(String dataImprumut) {
		this.dataImprumut = dataImprumut;
	}

	public String getDataReturnare() {
		return dataReturnare;
	}

	public void setDataReturnare(String dataReturnare) {
		this.dataReturnare = dataReturnare;
	}

	public boolean isReturnat() {
		return returnat;
	}

	public void setReturnat(boolean returnat) {
		this.returnat = returnat;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Suport getSuport() {
		return suport;
	}

	public void setSuport(Suport suport) {
		this.suport = suport;
	}

	@OneToOne
	@JoinColumn(name = "idSuport")
	private Suport suport;

	public Imprumut() {
		
	}
}