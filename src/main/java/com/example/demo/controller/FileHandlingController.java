package com.example.demo.controller;


import com.example.demo.dtos.UploadFileDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@Slf4j
@RestController
@RequestMapping("/api/v1/file")
@CrossOrigin
public class FileHandlingController {

    @PostMapping("/upload")
    public String add(@ModelAttribute UploadFileDTO uploadFileDTO){
        System.out.println(uploadFileDTO.toString());
        String fileName = uploadFileDTO.getFile().getOriginalFilename();
        try {
            uploadFileDTO.getFile().transferTo(
         new File("D:\\pvt_dev\\FileUploder\\fileuploadservice\\src\\main\\java\\com\\example\\demo\\upload\\"
                 + fileName));
        } catch (Exception e) {
            return "error 123";        }
        return "added";
    }

}
