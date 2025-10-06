package com.topsify.cli;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.topsify.cli.models.User;
import com.topsify.cli.utils.JSONFileReader;
import com.topsify.cli.utils.SQLFileWriter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        JSONFileReader jsonFileReader = new JSONFileReader(objectMapper);
        SQLFileWriter sqlFileWriter = new SQLFileWriter();
        try {
            List<User> users = jsonFileReader.readJsonArray("users.json", new TypeReference<List<User>>() {
            });
            users.forEach(System.out::println);
            sqlFileWriter.writeUsersToSQL(users, "./db/seeds/users.sql");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
