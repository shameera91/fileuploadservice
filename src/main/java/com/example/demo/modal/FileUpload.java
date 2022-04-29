package com.example.demo.modal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created By Shameera.A on 4/25/2022
 */

@Entity
@Table(name = "file_upload")
@Getter
@NoArgsConstructor
@SuperBuilder
public class FileUpload {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String fileName;
}
