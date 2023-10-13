package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVFileReader {
    private String filePath;

    public CSVFileReader(String filePath) {
        this.filePath = filePath;
    }

    public List<String[]> readCSV() throws FileNotFoundException {
        List<String[]> data = new ArrayList<>();
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                data.add(parts);
            }
        }
        return data;
    }
}
