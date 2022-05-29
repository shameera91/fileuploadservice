package com.example.demo.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.service.FileUploadService;

@RestController
@RequestMapping("/api/v1/file-handling")
public class FileHandlingController {

	private final FileUploadService fileUploadService;

	public FileHandlingController(FileUploadService fileUploadService) {
		this.fileUploadService = fileUploadService;
	}
	/*
	 * @PostMapping("/upload") public String add(@ModelAttribute UploadFileDTO
	 * uploadFileDTO){ System.out.println(uploadFileDTO.toString()); String fileName
	 * = uploadFileDTO.getFile().getOriginalFilename(); try {
	 * uploadFileDTO.getFile().transferTo( new File(
	 * "D:\\pvt_dev\\FileUploder\\fileuploadservice\\src\\main\\java\\com\\example\\demo\\upload\\"
	 * + fileName)); } catch (Exception e) { return "error 123"; } return "added"; }
	 */

	@PostMapping("/upload/{binName}")
	public ResponseEntity uploadToBin(@RequestParam("file") MultipartFile file, @PathVariable String binName)
			throws IOException {
		fileUploadService.uploadToBin(file, binName);
		return ResponseEntity.ok(HttpStatus.OK);
	}

}
