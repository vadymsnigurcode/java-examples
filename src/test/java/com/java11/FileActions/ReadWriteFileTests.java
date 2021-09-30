package com.java11.FileActions;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ReadWriteFileTests {
    @Test
    public void testReadFile() throws IOException {
        Path path = Paths.get("C:\\dev\\projects\\java-examples\\src\\main\\resources\\sample.txt");
        String fileContent = Files.readString(path);
        System.out.println(fileContent);

        String newFileContent = fileContent.replace("Line","Lines");
        Path newFilePath = Paths.get("C:\\dev\\projects\\java-examples\\src\\main\\resources\\sample-new.txt");
        Files.writeString(newFilePath, newFileContent);

    }
}
