package com.example.code_genarate.controller;

import org.springframework.http.ResponseEntity;
import com.example.code_genarate.vo.FileRequest;
import org.springframework.stereotype.Controller;
import com.example.code_genarate.server.GenerateServer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin
@RequestMapping("file")
public class GenerateController {

    @Autowired
    GenerateServer generateServer;

    @PostMapping("/generate")
    public ResponseEntity<String> generateFile(@RequestBody FileRequest fileRequest) {
        try {
            return generateServer.GenerateFile(fileRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
