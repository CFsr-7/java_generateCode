package com.example.code_genarate.server.Imp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import com.example.code_genarate.vo.FileRequest;
import com.example.code_genarate.server.GenerateServer;

@Service
public class GenerateServerImp implements GenerateServer {

    @Override
    public ResponseEntity<String> GenerateFile(FileRequest fileRequest) throws IOException {
        // 创建目录
        Path directory = Paths.get(fileRequest.getDirectory());
        Files.createDirectories(directory);
        // 创建文件并写入内容
        String filePath = fileRequest.getDirectory()
                + File.separator + fileRequest.getFileName()
                + "." + fileRequest.getFileExtension();

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(fileRequest.getFileContent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new ResponseEntity<>("已生成", HttpStatus.OK);
    }

}
