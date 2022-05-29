package com.example.demo.service;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

/**
 * Created By Shameera.A on 4/25/2022
 */
@Slf4j
@Service
public class FileUploadService {

	@Autowired
	private final RestTemplate restTemplate;

	public FileUploadService(final RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public void uploadToBin(MultipartFile multipartFileOne, String binName) throws IOException {

		String resourceUrl = "https://filebin.net/";

		RestTemplate template = new RestTemplate();
		// File file = new File("D:\\test.txt");
		// File file = new
		// File(classLoader.getResource("classpath:test.txt").getFile());

		// File file = new File("src/test/resources/input.txt");
		// FileInputStream input = new FileInputStream(file);
		// MultipartFile multipartFile = new MockMultipartFile("file", file.getName(),
		// "text/plain",
		// IOUtils.toByteArray(input));

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("filename", multipartFileOne.getName());
		headers.add("bin", "sdasddazadzsadas");
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

		HttpEntity<byte[]> requestEntity = new HttpEntity<>(multipartFileOne.getBytes(), headers);

		template.exchange(resourceUrl, HttpMethod.POST, requestEntity, String.class);
	}

	/*
	 * @Autowired FileUploadRepository fileUploadRepository;
	 * 
	 * public void saveFileUploadData() throws IOException { FileUpload testFileNme
	 * =
	 * fileUploadRepository.save(FileUpload.builder().fileName("testFileNme").build(
	 * ));
	 * 
	 * // String fileNme = "test/txt"; OutputStream out = null; File file = new
	 * File("/mnt/block-volume/testfilesample.txt"); try { out = new
	 * FileOutputStream(file);
	 * 
	 * } catch (FileNotFoundException e) { e.printStackTrace(); } finally {
	 * out.close(); } log.info("file upload id" + testFileNme.getId());
	 * 
	 * }
	 */
}
