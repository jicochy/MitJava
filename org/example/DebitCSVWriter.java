package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;

public class DebitCSVWriter {
    private String filePath;

    public DebitCSVWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeDebit(List<String[]> debitData) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (String[] line : debitData) {
                writer.println(String.join(",", line));
            }
        }
    }
}

// Similarly, make similar changes to CreditCSVWriter and ErrorCSVWriter
