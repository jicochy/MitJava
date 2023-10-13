package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\jicoc\\OneDrive\\Desktop\\CSV\\input.csv";
        String debitFilePath = "C:\\Users\\jicoc\\OneDrive\\Desktop\\CSV\\debit.csv";
        String creditFilePath = "C:\\Users\\jicoc\\OneDrive\\Desktop\\CSV\\credit.csv";
        String errorFilePath = "C:\\Users\\jicoc\\OneDrive\\Desktop\\CSV\\error.csv";

        try {
            // Create an instance of the CSV file reader
            CSVFileReader csvReader = new CSVFileReader(inputFilePath);
            List<String[]> data = csvReader.readCSV();

            // Create instances of CSV writers for debit, credit, and error
            DebitCSVWriter debitWriter = new DebitCSVWriter(debitFilePath);
            CreditCSVWriter creditWriter = new CreditCSVWriter(creditFilePath);
            ErrorCSVWriter errorWriter = new ErrorCSVWriter(errorFilePath);

            // Create lists to hold filtered data
            List<String[]> debitData = new ArrayList<>();
            List<String[]> creditData = new ArrayList<>();
            List<String[]> errorData = new ArrayList<>();

            // Filter the data into debit, credit, and error transactions
            for (String[] line : data) {
                if (line.length >= 5) {
                    String transactionType = line[4].toLowerCase();
                    if ("debit".equals(transactionType)) {
                        debitData.add(line);
                    } else if ("credit".equals(transactionType)) {
                        creditData.add(line);
                    } else {
                        errorData.add(line);
                    }
                }
            }

            // Write the filtered data to the corresponding CSV files
            debitWriter.writeDebit(debitData);
            creditWriter.writeCredit(creditData);
            errorWriter.writeError(errorData);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


