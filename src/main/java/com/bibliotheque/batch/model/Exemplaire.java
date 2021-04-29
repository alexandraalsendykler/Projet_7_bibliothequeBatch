package com.bibliotheque.batch.model;

public class Exemplaire {
	private Iterable<Pret> prets;
	private Livre livre;
	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	private Integer identifiant;

	public Iterable<Pret> getPrets() {
		return prets;
	}

	public void setPrets(Iterable<Pret> prets) {
		this.prets = prets;
	}

	public Integer getId() {
		return identifiant;
	}

	public void setId(Integer identifiant) {
		this.identifiant = identifiant;
	}

}
