package com.williamsapplicatie.SIF.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	
@RequestMapping("/tomcat")
public String intro8() {
	
	return "Het werkt goed";
}

}
