package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ErrorCSVWriter {
    private String filePath;

    public ErrorCSVWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeError(List<String[]> errorData) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (String[] line : errorData) {
                writer.println(String.join(",", line));
            }
        }
    }
}
