package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.FlashCard;
import com.revature.repositories.FlashCardRepository;

@Service
@Transactional
public class FlashCardService {

	static {
		System.out.println("[DEBUG] - FlashCardService instantiated...");
	}
	
	@Autowired
	FlashCardRepository repo;
	
	public List<FlashCard> getAll() {
		System.out.println("[DEBUG] - In FlashCardService.getAll()...");
		return repo.getAll();
	}
	
	public FlashCard getById(int id) {
		System.out.println("[DEBUG] - In FlashCardService.getById(int id)..." + id);
		return repo.getById(id);
	}
	
	public FlashCard addCard(FlashCard fc) {
		System.out.println("[DEBUG] - In FlashCardService.addCard(FlashCard fc)...");
		return repo.addFlashCard(fc);
	}
	
	public FlashCard update(FlashCard fc) {
		System.out.println("[DEBUG] - In FlashCardService.update(FlashCard fc)...");
		return repo.updateFlashCard(fc);
	}
	
	public int delete(int id) {
		System.out.println("[DEBUG] - In FlashCardService.delete(int id)...");
		return repo.deleteFlashCard(id);
	}

}
