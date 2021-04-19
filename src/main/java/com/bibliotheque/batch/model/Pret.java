package com.bibliotheque.batch.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//CETTE CLASSE MANIPULE LES DONNEES

public class Pret {

	private Integer id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateReservation;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateDeFin;
	private String statut;
	private Utilisateur utilisateur;

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Date getDateDeFin() {
		return dateDeFin;
	}

	public void setDateDeFin(Date dateDeFin) {
		this.dateDeFin = dateDeFin;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

}
