package com.topsify.cli.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class JSONFileReader {

    private final ObjectMapper objectMapper;

    public JSONFileReader(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public <T> List<T> readJsonArray(String fileName, TypeReference<List<T>> typeReference) throws RuntimeException {
        try {
            File file = Paths.get("reports", fileName).toFile();
            return objectMapper.readValue(file, typeReference);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read JSON file: " + fileName);
        }
    }
}
