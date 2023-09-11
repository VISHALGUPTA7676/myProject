package com.esypharma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.token.TokenService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esypharma.app.service.UserService;
import com.esypharma.models.Manufacturer;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

	
	@Autowired
	private UserService service;
	
	
	
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/addManufacture/{userID}" )
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public ResponseEntity<?> addManufacture(@RequestBody Manufacturer manufacturer,@PathVariable String userID ){
		String massage;
		if(userService.addManufacturer(manufacturer,userID)) {
			massage="manufacturer is added";
		}else {
			massage="manufacturer is not added";
		}
		
		return ResponseEntity.ok(massage);
	}
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public void userAccess() {
		
		service.getAllUser();
	}

	@GetMapping("/mod")
	@PreAuthorize("hasRole('MODERATOR')")
	public String moderatorAccess() {

		return "Moderator Board.";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
}
