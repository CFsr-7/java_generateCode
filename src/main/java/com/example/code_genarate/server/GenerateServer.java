package com.example.code_genarate.server;

import com.example.code_genarate.vo.FileRequest;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface GenerateServer {

    ResponseEntity<String> GenerateFile(FileRequest fileRequest) throws IOException;

}
