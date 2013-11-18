package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="actorifilme")
@NamedQuery(name=ActorFilm.getActorFilm,query = "SELECT af FROM ActorFilm af")
public class ActorFilm {
	public static final String getActorFilm="getActorFilm";
	
	@Id
	@Column(name="idActorFilm")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idActorFilm;
	
	@Column(name="Rol")
	private String rol;
	
	public Integer getIdActorFilm() {
		return idActorFilm;
	}

	public void setIdActorFilm(Integer idActorFilm) {
		this.idActorFilm = idActorFilm;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	@OneToOne
	@JoinColumn(name="idActor")
	private Actor actor;
	
	@ManyToOne
	@JoinColumn(name="idFilm")
	private Film film;

}
