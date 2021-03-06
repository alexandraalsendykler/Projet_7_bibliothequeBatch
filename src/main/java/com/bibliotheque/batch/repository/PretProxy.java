package com.bibliotheque.batch.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.bibliotheque.batch.model.Pret;

@Component
public class PretProxy {

	@Autowired
	private CustomProperties props;

	public Iterable<Pret> getPretDateDeFin() {
		String baseApiUrl = props.getApiUrl();
		String getPretsUrl = baseApiUrl + "/DateDeFin";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Iterable<Pret>> response = restTemplate.exchange(getPretsUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<Iterable<Pret>>() {
				});
		return response.getBody();
	}

}
