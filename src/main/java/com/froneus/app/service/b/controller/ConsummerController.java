package com.froneus.app.service.b.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.froneus.app.service.b.dto.MessageDTO;
import com.froneus.app.service.b.service.INodeEndpointConsumerService;

@RestController()
public class ConsummerController {

	private static Logger log = LoggerFactory.getLogger(ConsummerController.class);
	
	@Autowired
	private INodeEndpointConsumerService svc;
	
	@PostMapping("/transcribe")
	public ResponseEntity<?> consume(@RequestBody MessageDTO dto) {
		log.info("Mensaje recibido: "+dto.getMessage());
		return ResponseEntity.ok(svc.consume());
	}
}
