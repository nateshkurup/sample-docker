/**
 * 
 */
package com.natesh.sample.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Natesh Kurup
 * Created On: Aug 4, 2018
 */
@RestController
@RequestMapping("/api")
public class MyController {

	@GetMapping("/greeting")
	public String greet(){
		 return "<h1>Hello Docker !!!!!</h1>";
	}
}
