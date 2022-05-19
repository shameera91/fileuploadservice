package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FileUploadService;

import lombok.extern.slf4j.Slf4j;

/**
 * Created By Shameera.A on 4/18/2022
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/welcome")
public class WelcomeController {
	@Autowired
	FileUploadService fileUploadService;

	@GetMapping
	public ResponseEntity testMessage() throws IOException {
		log.info("testing !!!!");
		//fileUploadService.saveFileUploadData();
		return ResponseEntity.ok(HttpStatus.OK);
	}
}
