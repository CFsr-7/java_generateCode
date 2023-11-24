package com.example.code_genarate.vo;

public class FileRequest {
    private String directory;
    private String fileName;
    private String fileExtension;
    private String fileContent;

    public String getDirectory() {
        return directory;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

}
