package com.revature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.revature.beans.FlashCard;

public class ClientDriver {

	private static final Logger log = LoggerFactory.getLogger(ClientDriver.class);
	private static String API_URL = "http://localhost:9999/spring-hibernate/flashcards/";

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();


		// Get all flash cards
		try {
			System.out.println("GET ALL FLASH CARDS");
			ResponseEntity<FlashCard[]> response = restTemplate.getForEntity(API_URL, FlashCard[].class);
			log.info("Resource consumption successful");
			log.info(response.toString());

			System.out.println("Status Code: [" + response.getStatusCodeValue() + "] - " + response.getStatusCode());
			System.out.println("Response Headers: " + response.getHeaders());

			System.out.println("Payload:");
			FlashCard[] cards = response.getBody();
			
			for(FlashCard card : cards) {
				System.out.println("\t" + card);
			}
			
			System.out.println("\n");

		} catch(Exception e) {
			log.error("Resource consumption unsuccessful");
		}

		// Get flash card by id
		try {
			System.out.println("GET FLASH CARD BY ID");
			ResponseEntity<FlashCard> response = restTemplate.getForEntity(API_URL + "1", FlashCard.class);
			log.info(response.toString());

			System.out.println("Status Code: [" + response.getStatusCodeValue() + "] - " + response.getStatusCode());
			System.out.println("Response Headers: " + response.getHeaders());

			FlashCard card = response.getBody();
			System.out.println("Payload:\n\t" + card + "\n");
			
		} catch(Exception e) {
			log.error("Resource consumption unsuccessful");
		}

		// Add new flash card
		try {
			System.out.println("ADD NEW FLASH CARD");
			FlashCard card = new FlashCard("What is the minimum number of beans required to configure Hibernate with Spring?", "3");
			ResponseEntity<FlashCard> response = restTemplate.postForEntity(API_URL, card, FlashCard.class);
			log.info(response.toString());

			System.out.println("Status Code: [" + response.getStatusCodeValue() + "] - " + response.getStatusCode());
			System.out.println("Response Headers: " + response.getHeaders());

			card = response.getBody();
			System.out.println("Payload:\n\t" + card + "\n");
			
		} catch(Exception e) {
			log.error("Resource post unsuccessful");
		}

		// Update a flash card
		try {
			System.out.println("UPDATE FLASH CARD");
			FlashCard card = new FlashCard(6, "What does AOP stand for?", "Aspect-Oriented Programming");
			//restTemplate.put(API_URL + card.getId(), card, FlashCard.class); // works, but does not give us an object back (not the most helpful)

			// A bit more verbose, but gives us complete access to the request/response data
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<FlashCard> request = new HttpEntity<>(card, headers);
			ResponseEntity<FlashCard> response = restTemplate.exchange(API_URL, HttpMethod.PUT, request, FlashCard.class);

			log.info(response.toString());

			System.out.println("Status Code: [" + response.getStatusCodeValue() + "] - " + response.getStatusCode());
			System.out.println("Response Headers: " + response.getHeaders() + "\n");

		} catch (Exception e) {
			log.error("Resource update unsuccessful");
		}
		
		// Delete a flash card
		try {
			System.out.println("DELETE FLASH CARD");
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<FlashCard> request = new HttpEntity<>(headers);
			ResponseEntity<FlashCard> response = restTemplate.exchange(API_URL + "6", HttpMethod.DELETE, request, FlashCard.class);

			log.info(response.toString());

			System.out.println("Status Code: [" + response.getStatusCodeValue() + "] - " + response.getStatusCode());
			System.out.println("Response Headers: " + response.getHeaders());
			
		} catch (Exception e) {
			log.error("Resource delete unsuccessful");
		}

	}

}
