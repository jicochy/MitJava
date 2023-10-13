package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CreditCSVWriter {
    private String filePath;

    public CreditCSVWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeCredit(List<String[]> creditData) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (String[] line : creditData) {
                writer.println(String.join(",", line));
            }
        }
    }
}