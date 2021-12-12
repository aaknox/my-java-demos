package bootdemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bootdemo.exceptions.InvalidCredentialsException;
import bootdemo.exceptions.UserNotFoundException;
import bootdemo.models.User;
import bootdemo.models.UserErrorResponse;
import bootdemo.services.UserService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> findAllUsers() {
		System.out.println("[DEBUG] - In UserController.findAllUsers()...");
		return userService.findAllUsers();
	}

	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public User findUserById(@PathVariable("id") int id) {
		System.out.println("[DEBUG] - In UserController.findUserById()...");
		
		User user;
		
		try {
			user = userService.findUserById(id);
		} catch (Exception e) {
			throw new UserNotFoundException("User with id " + id + " not found");
		}
		
		return user;
	}
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> addUser(@Valid @RequestBody User newUser) {
		System.out.println("[DEBUG] - In UserController.addUser()...");
		User user = userService.addUser(newUser);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	@PatchMapping(produces="application/json", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> updateUser(@Valid @RequestBody User updatedUser) {
		System.out.println("[DEBUG] - In UserController.updateUser()...");
		User user = userService.updateUserById(updatedUser);
		
		if(user == null) {
			throw new UserNotFoundException("User with id " + updatedUser.getUserId() + " not found");
		}
		
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable int id){
		System.out.println("[DEBUG] - In UserController.deleteUser(int id)...");
		int deleted = userService.deleteUser(id);

		if(deleted == -1) {
			throw new UserNotFoundException("User with id " + id + " not found");
		}

		return new ResponseEntity<User>(HttpStatus.OK); // HTTP status code = 200
	}
	
	@PostMapping(value="/login", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> loginUser(@RequestBody User user) {
		user = userService.loginUser(user);
		
		if(user == null) {
			throw new InvalidCredentialsException("Invalid credentials");
		}
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@ExceptionHandler
	public ResponseEntity<UserErrorResponse> handleException(UserNotFoundException e) {
		UserErrorResponse error = new UserErrorResponse();

		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimestamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<UserErrorResponse> handleException(InvalidCredentialsException e) {
		UserErrorResponse error = new UserErrorResponse();

		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimestamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.UNAUTHORIZED);
	}
}
