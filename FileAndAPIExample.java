/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileandapiexample;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class FileAndAPIExample {
    public static void main(String[] args) {
        // File paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            // Step 1: Read content from the input file
            String inputContent = readFile(inputFilePath);
            System.out.println("Input from file: " + inputContent);

            // Step 2: Make an API request with the input content
            String apiUrl = "https://api.example.com/echo"; // Replace with a real API URL
            String response = makeApiRequest(apiUrl, inputContent);
            System.out.println("Response from API: " + response);

            // Step 3: Write the API response to the output file
            writeFile(outputFilePath, response);
            System.out.println("Response written to " + outputFilePath);

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to read file content
    public static String readFile(String filePath) throws IOException {
        StringBuilder content = new String
