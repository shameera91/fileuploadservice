package com.example.demo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.FileUpload;

import lombok.extern.slf4j.Slf4j;

/**
 * Created By Shameera.A on 4/25/2022
 */
@Slf4j
@Service
public class FileUploadService {

	/*@Autowired
	FileUploadRepository fileUploadRepository;

	public void saveFileUploadData() throws IOException {
		FileUpload testFileNme = fileUploadRepository.save(FileUpload.builder().fileName("testFileNme").build());

		// String fileNme = "test/txt";
		OutputStream out = null;
		File file = new File("/mnt/block-volume/testfilesample.txt");
		try {
			out = new FileOutputStream(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
		log.info("file upload id" + testFileNme.getId());

	}*/
}
