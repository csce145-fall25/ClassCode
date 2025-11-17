package com.chapter10;

import java.io.*;

/**
 * Demonstrates writing and reading binary data using ObjectOutputStream and ObjectInputStream
 * Includes primitives, strings, and custom objects
 */
public class BinaryOutputDemo {
    private static final String FILENAME = "binary.dat";
    
    public static void main(String[] args) {
        // Create a File object
        File file = new File(FILENAME);
        
        // Write data to the file
        writeData(file);
        
        // Read data from the file
        readData(file);
    }
    
    /**
     * Writes various types of data to a binary file
     */
    private static void writeData(File file) {
        System.out.println("=== Writing Data to " + FILENAME + " ===\n");
        
        try (ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream(file))) {
            
            // Write primitives
            int intValue = 42;
            double doubleValue = 3.14159;
            boolean boolValue = true;
            char charValue = 'A';
            long longValue = 9876543210L;
            
            output.writeInt(intValue);
            output.writeDouble(doubleValue);
            output.writeBoolean(boolValue);
            output.writeChar(charValue);
            output.writeLong(longValue);
            
            System.out.println("Primitives written:");
            System.out.println("  int: " + intValue);
            System.out.println("  double: " + doubleValue);
            System.out.println("  boolean: " + boolValue);
            System.out.println("  char: " + charValue);
            System.out.println("  long: " + longValue);
            
            // Write a String using writeObject()
            String message = "Hello, Binary World!";
            output.writeObject(message);
            System.out.println("\nString written (using writeObject):");
            System.out.println("  \"" + message + "\"");
            
            // Write a String using writeUTF()
            String utfMessage = "UTF-8 String: こんにちは (Hello in Japanese) 🌍";
            output.writeUTF(utfMessage);
            System.out.println("\nString written (using writeUTF):");
            System.out.println("  \"" + utfMessage + "\"");
            
            // Write a Person object
            Person person = new Person("Alice Johnson", 30, 75000.50);
            output.writeObject(person);
            System.out.println("\nObject written:");
            System.out.println("  " + person);
            
            System.out.println("\nData successfully written to " + file.getAbsolutePath());
            
        } catch (IOException e) {
            System.err.println("Error writing data: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Reads data from a binary file and displays it
     */
    private static void readData(File file) {
        System.out.println("\n\n=== Reading Data from " + FILENAME + " ===\n");
        
        // Check if file exists
        if (!file.exists()) {
            System.err.println("File " + FILENAME + " does not exist!");
            return;
        }
        
        try (ObjectInputStream input = new ObjectInputStream(
                new FileInputStream(file))) {
            
            // Read primitives (must read in same order as written)
            int intValue = input.readInt();
            double doubleValue = input.readDouble();
            boolean boolValue = input.readBoolean();
            char charValue = input.readChar();
            long longValue = input.readLong();
            
            System.out.println("Primitives read:");
            System.out.println("  int: " + intValue);
            System.out.println("  double: " + doubleValue);
            System.out.println("  boolean: " + boolValue);
            System.out.println("  char: " + charValue);
            System.out.println("  long: " + longValue);
            
            // Read String using readObject()
            String message = (String) input.readObject();
            System.out.println("\nString read (using readObject):");
            System.out.println("  \"" + message + "\"");
            
            // Read String using readUTF()
            String utfMessage = input.readUTF();
            System.out.println("\nString read (using readUTF):");
            System.out.println("  \"" + utfMessage + "\"");
            
            // Read Person object
            Person person = (Person) input.readObject();
            System.out.println("\nObject read:");
            System.out.println("  " + person);
            
            System.out.println("\nData successfully read from " + file.getAbsolutePath());
            
        } catch (IOException e) {
            System.err.println("Error reading data: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
