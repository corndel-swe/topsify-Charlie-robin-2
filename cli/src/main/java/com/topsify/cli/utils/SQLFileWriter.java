package com.topsify.cli.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SQLFileWriter {

    public <T extends SQLInsertable> void writeUsersToSQL(List<T> insertable, String outputFileName) throws RuntimeException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (T toInsert : insertable) {
                writer.append(toInsert.getSQLInsert());
            }
        } catch (IOException exception) {
            throw new RuntimeException("Failed to write to SQL file: " + outputFileName, exception);
        }
    }
}
