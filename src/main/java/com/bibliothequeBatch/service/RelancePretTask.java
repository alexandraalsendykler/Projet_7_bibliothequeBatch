package com.bibliothequeBatch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bibliothequeBatch.repository.PretProxy;

@Component
public class RelancePretTask {
	
	@Autowired
	private PretProxy pretProxy;
	
	@Scheduled(fixedRate = 5000)
	public void execute() {
		System.out.println("text");
	}

}
