package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.FlashCard;
import com.revature.beans.FlashCardErrorResponse;
import com.revature.exceptions.FlashCardNotFoundException;
import com.revature.services.FlashCardService;

@RestController
@RequestMapping(value="/flashcards")
public class FlashCardController {

	@Autowired
	FlashCardService flashCardService;

	static {
		System.out.println("[DEBUG] - FlashCardController instantiated...");
	}

	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public FlashCard getById(@PathVariable int id) {
		System.out.println("[DEBUG] - In FlashCardController.getById(int id)..." + id);
		FlashCard card = flashCardService.getById(id);

		if(card == null) {
			throw new FlashCardNotFoundException("Flash card with id " + id + " not found");
		}

		return card;
	}

	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<FlashCard> getAll(){
		System.out.println("[DEBUG] - In FlashCardController.getAll()...");
		return flashCardService.getAll();
	}

	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FlashCard> addFlashCard(@RequestBody FlashCard fc){
		System.out.println("[DEBUG] - In FlashCardController.addFlashCard(FlashCard fc)...");
		FlashCard card = flashCardService.addCard(fc);
		return new ResponseEntity<FlashCard>(card, HttpStatus.CREATED); // HTTP status code = 201
	}

	@PutMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FlashCard> updateFlashCard(@RequestBody FlashCard fc) {
		System.out.println("[DEBUG] - In FlashCardController.getById(int id)...");

		FlashCard card = flashCardService.update(fc);

		if(card==null) {
			throw new FlashCardNotFoundException("Flash card with id " + fc.getId() + " not found");
		}
		
		return new ResponseEntity<FlashCard>(HttpStatus.OK); // HTTP status code = 200 (204, No Content, would be acceptable as well)
	}

	@DeleteMapping(value="/{id}")
	public ResponseEntity<FlashCard> deleteFlashCard(@PathVariable int id){
		System.out.println("[DEBUG] - In FlashCardController.deleteFlashCard(int id)...");
		int deleted = flashCardService.delete(id);

		if(deleted == -1) {
			throw new FlashCardNotFoundException("Flash card with id " + id + " not found");
		}

		return new ResponseEntity<FlashCard>(HttpStatus.OK); // HTTP status code = 200
	}

	// Add an exception handler using @ExceptionHandler
	@ExceptionHandler
	public ResponseEntity<FlashCardErrorResponse> handleException(FlashCardNotFoundException e) {

		// Create a FlashCardErrorResponse object
		FlashCardErrorResponse error = new FlashCardErrorResponse();

		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimestamp(System.currentTimeMillis());

		// Return ResponseEntity
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

}
