package com.bibliothequeBatch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.bibliothequeBatch.model.Utilisateur;
import com.bibliothequeBatch.model.Pret;
import com.bibliothequeBatch.repository.PretProxy;

// CETTE CLASSE SERT A ECRIRE LE CODE

@Component
public class RelancePretTask {

	@Autowired
	private PretProxy pretProxy;

	@Scheduled(cron = "0 12 * * * *", zone = "Europe/Paris")
	public void execute() {
		Iterable<Pret> prets = pretProxy.getPretDateDeFin();
		for (Pret pret : prets) {
			Utilisateur utilisateur = pret.getUtilisateur();
			String email = utilisateur.getEmail();

		}
	}

}

