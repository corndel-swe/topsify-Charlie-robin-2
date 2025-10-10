package com.topsify.cli;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.topsify.cli.models.User;
import com.topsify.cli.utils.JSONFileReader;
import com.topsify.cli.utils.SQLFileWriter;
import com.topsify.cli.utils.SQLInsertable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements SQLInsertable,Runnable {

    @Override
    public String getSQLInsert() {
        return "HELLO TANIA";
    }

    @Override
    public void run() {

    }
}

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        JSONFileReader jsonFileReader = new JSONFileReader(objectMapper);
        SQLFileWriter sqlFileWriter = new SQLFileWriter();

        List<Student> students = List.of(new Student());

        List<String> names = List.of("Peter", "Frank", "Nic");


        try {
            List<User> users = jsonFileReader.readJsonArray("users.json", new TypeReference<List<User>>() {
            });
            users.forEach(System.out::println);

            Collections.sort(users);

            sqlFileWriter.writeUsersToSQL(users, "./db/seeds/users.sql");

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
