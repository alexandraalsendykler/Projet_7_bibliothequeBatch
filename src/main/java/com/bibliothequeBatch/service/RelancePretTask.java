package com.bibliothequeBatch.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bibliothequeBatch.model.Pret;
import com.bibliothequeBatch.repository.PretProxy;

// CETTE CLASSE SERT A ECRIRE LE CODE

@Component
public class RelancePretTask {

	@Autowired
	private PretProxy pretProxy;

	@Scheduled(cron = "0 12 * * * *", zone = "Europe/Paris")
	public void execute() {
		Iterable<Pret> pret = pretProxy.getPretDateDeFin();

	}

}

//System.out.println("text");
