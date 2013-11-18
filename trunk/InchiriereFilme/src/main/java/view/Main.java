package view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Actor;
import model.ActorFilm;
import model.Administrator;
import model.Client;
import model.Film;
import model.GenFilm;
import model.Imprumut;
import model.Producator;
import model.Regizor;
import model.Suport;
import model.TipSuport;

public class Main {
	EntityManagerFactory emf;
	EntityManager em;
	

	public Main() {
		emf = Persistence
				.createEntityManagerFactory("InchiriereFilme");
		em  = emf.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public List<Actor> getActors() {
		return (List<Actor>) em.createNamedQuery(Actor.getActors)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Administrator> getAdmins() {
		return (List<Administrator>) em.createNamedQuery(
				Administrator.getAdmins).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Client> getClients() {
		return (List<Client>) em.createNamedQuery(
				Client.getClients).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<GenFilm> getGenFilm() {
		return (List<GenFilm>) em.createNamedQuery(
				GenFilm.getGenFilm).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Producator> getProducator() {
		return (List<Producator>) em.createNamedQuery(
				Producator.getProducatori).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Regizor> getRegizori() {
		return (List<Regizor>) em.createNamedQuery(
				Regizor.getRegizori).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<TipSuport> getTipSuport() {
		return (List<TipSuport>) em.createNamedQuery(
				TipSuport.getTipSuport).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Film> getFilm() {
		return (List<Film>) em.createNamedQuery(
				Film.getFilme).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<ActorFilm> getActorFilm() {
		return (List<ActorFilm>) em.createNamedQuery(
				ActorFilm.getActorFilm).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Suport> getSuport() {
		return (List<Suport>) em.createNamedQuery(
				Suport.getSuport).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Imprumut> getImprumut() {
		return (List<Imprumut>) em.createNamedQuery(
				Imprumut.getImprumuturi).getResultList();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World.");

		Main object = new Main();
		List<Actor> list = object.getActors();
		for (Actor a : list)
			System.out.println(a.getNume() + " " + a.getPrenume());
		
		System.out.println("!!!!!!!!Administratori");

		List<Administrator> list2 = object.getAdmins();
		for (Administrator a : list2)
			System.out.println(a.getNume() + " " + a.getPrenume());

		
		System.out.println("!!!!!!!!Clienti");

		List<Client> list3 = object.getClients();
		for (Client a : list3)
			System.out.println(a.getNume() + " " + a.getPrenume());
		
		System.out.println("!!!!!!!Genuri");

		List<GenFilm> list4 = object.getGenFilm();
		for (GenFilm a : list4)
			System.out.println(a.getNume());
		
		System.out.println("!!!!!!!Producatori");

		List<Producator> list5 = object.getProducator();
		for (Producator a : list5)
			System.out.println(a.getNume());
		
		System.out.println("!!!!!!!Regizor");

		List<Regizor> list6 = object.getRegizori();
		for (Regizor a : list6)
			System.out.println(a.getNume() + " "+a.getPrenume());
		
		System.out.println("!!!!!!!Tip Suport");

		List<TipSuport> list7 = object.getTipSuport();
		for (TipSuport a : list7)
			System.out.println(a.getTipSuport());
		
		System.out.println("!!!!!!!Actor Film");

		List<ActorFilm> list8 = object.getActorFilm();
		for (ActorFilm a : list8){
			System.out.println("Role "+a.getRol());
			System.out.println("actor "+a.getActor().getNume());
		}
		
		System.out.println("!!!!!!!Filme");

		List<Film> list9 = object.getFilm();
		for (Film a : list9){
			System.out.println("Film: "+a.getNume());
			System.out.println();
			System.out.println("Regizor "+a.getRegizor().getNume());
			List<ActorFilm> actors = a.getActors();
			System.out.println(actors.size());
			for(ActorFilm act:actors)
				System.out.println("Actor"+act.getActor().getNume());
		}
		
		System.out.println("!!!!!!!Suport");

		List<Suport> list10 = object.getSuport();
		for (Suport a : list10){
			System.out.println("Tip suport "+a.getTipSuport().getTipSuport());
			System.out.println("Cod "+a.getCod());
			System.out.println("Film "+a.getFilm().getNume());
		}
		
		MainForm mainForm = new MainForm();
		mainForm.create();
	}
	
	
	
	

	

}
