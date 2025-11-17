package com.chapter10;

import java.io.*;
import java.util.Scanner;

/**
 * Program that:
 * 1. Reads a filename and count from user
 * 2. Reads that many double values from user
 * 3. Writes them to the specified file
 * 4. Reads the doubles back from the file
 * 5. Doubles each value
 * 6. Writes the doubled values to a new file with "OUT" appended
 */
public class Doubler {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read filename and number of doubles
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine().trim();
        
        System.out.print("Enter the number of doubles to input: ");
        int count = scanner.nextInt();
        
        // Read the double values from user
        double[] values = new double[count];
        System.out.println("\nEnter " + count + " double values:");
        for (int i = 0; i < count; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            values[i] = scanner.nextDouble();
        }
        
        // Write the doubles to the file
        writeDoublesToFile(filename, values);
        
        // Read the doubles back from the file using EOFException
        double[] readValues = readDoublesFromFile(filename);
        
        // Double each value
        double[] doubledValues = new double[readValues.length];
        System.out.println("\nDoubling each value:");
        for (int i = 0; i < readValues.length; i++) {
            doubledValues[i] = readValues[i] * 2;
            System.out.println("  " + readValues[i] + " * 2 = " + doubledValues[i]);
        }
        
        // Write doubled values to output file (binary)
        String outputFilename = filename + "OUT";
        writeDoublesToFile(outputFilename, doubledValues);
        
        scanner.close();
        
        System.out.println("\nProcess complete!");
        System.out.println("Original values written to: " + filename);
        System.out.println("Doubled values written to: " + outputFilename);
    }
    
    /**
     * Writes an array of doubles to a binary file using ObjectOutputStream
     */
    private static void writeDoublesToFile(String filename, double[] values) {
        File file = new File(filename);
        
        try (ObjectOutputStream output = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(file)))) {
            
            System.out.println("\nWriting " + values.length + " doubles to " + filename + ":");
            for (double value : values) {
                output.writeDouble(value);
                System.out.println("  Wrote: " + value);
            }
            
            System.out.println("Successfully wrote to " + file.getAbsolutePath());
            
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Reads doubles from a binary file using ObjectInputStream
     * Uses EOFException to detect end of file
     */
    private static double[] readDoublesFromFile(String filename) {
        File file = new File(filename);
        
        if (!file.exists()) {
            System.err.println("File " + filename + " does not exist!");
            return new double[0];
        }
        
        // Use ArrayList to store values since we don't know count in advance
        java.util.ArrayList<Double> valueList = new java.util.ArrayList<>();
        
        try (ObjectInputStream input = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(file)))) {
            
            System.out.println("\nReading doubles from " + filename + " (using EOFException):");
            
            // Read until EOFException is thrown
            try {
                while (true) {
                    double value = input.readDouble();
                    valueList.add(value);
                    System.out.println("  Read: " + value);
                }
            } catch (EOFException e) {
                // This is expected - end of file reached
                System.out.println("End of file reached. Read " + valueList.size() + " values.");
            }
            
            System.out.println("Successfully read from " + file.getAbsolutePath());
            
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
            e.printStackTrace();
        }
        
        // Convert ArrayList to array
        double[] values = new double[valueList.size()];
        for (int i = 0; i < valueList.size(); i++) {
            values[i] = valueList.get(i);
        }
        
        return values;
    }
}