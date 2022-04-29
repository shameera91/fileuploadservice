package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.FileUpload;
import com.example.demo.repository.FileUploadRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * Created By Shameera.A on 4/25/2022
 */
@Slf4j
@Service
public class FileUploadService {

	@Autowired
	FileUploadRepository fileUploadRepository;

	public void saveFileUploadData() {
		FileUpload testFileNme = fileUploadRepository.save(FileUpload.builder().fileName("testFileNme").build());
		log.info("file upload id" + testFileNme.getId());
	}
}
