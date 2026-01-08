package com.devweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devweb.course.entities.User;

//controlador rest que responde no caminho '/users'
@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria","maria@email.com","999999","12345");
		
		return ResponseEntity.ok().body(u);
	}
}
