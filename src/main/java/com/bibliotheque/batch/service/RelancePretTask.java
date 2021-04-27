package com.bibliotheque.batch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bibliotheque.batch.model.Exemplaire;
import com.bibliotheque.batch.model.Livre;
import com.bibliotheque.batch.model.Pret;
import com.bibliotheque.batch.model.Utilisateur;
import com.bibliotheque.batch.repository.PretProxy;

// CETTE CLASSE SERT A ECRIRE LE CODE

@Component
public class RelancePretTask {

	@Autowired
	private PretProxy pretProxy;
	@Autowired
	public JavaMailSender emailSender;

	@Scheduled(cron = "0 12 * * * *", zone = "Europe/Paris")
	// @Scheduled(fixedRate = 10000)
	public void execute() {
		Iterable<Pret> prets = pretProxy.getPretDateDeFin();
		for (Pret pret : prets) {
			Utilisateur utilisateur = pret.getUtilisateur();
			Exemplaire exemplaire = pret.getExemplaire();
			Livre livre = exemplaire.getLivre();
			String email = utilisateur.getEmail();
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(email);
			message.setSubject("N'oubliez pas de rendre le livre "+ livre.getTitre() +" que vous avez emprunté !");
			message.setText(
					"Bonjour, ceci est un message de rappel ! N'oubliez pas de rendre votre emprunt ("+ livre.getTitre() +") à la bibliothèque OpenClassrooms ! Merci ! PS : ceci est un message automatique, merci de ne pas y répondre !");
			emailSender.send(message);

		}
	}

}
