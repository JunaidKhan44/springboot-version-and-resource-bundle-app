/**
 * 
 */
package com.springboot.controller;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Junaid.Khan
 *
 */
@RestController
public class ResourceController {
	
	@GetMapping("/get")
	public String  getAllMessages() {
//		//Locale locale = new Locale("en", "US");
		Locale locale = new Locale("ur", "Urdu");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("MessageResource", locale);
		return resourceBundle.getString("informationMessage");
	}

	
	@GetMapping("/val")
	public String  getAll() {
		
		return "hello";
	}
}
