//M02 Programming Assignment (3)
//Ivy Tech Community College
//SDEV 200 - Java
//Professor Bumgardner
//Nativida Muhammad
//02 April 2024

import java.util.Scanner;
class BinaryFormatException extends Exception {
    public BinaryFormatException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        String binaryString = "101010"; // Example binary string
        try {
            int decimalValue = bin2Dec(binaryString);
            System.out.println("Decimal value of " + binaryString + " is: " + decimalValue);
        } catch (BinaryFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Invalid binary string: " + binaryString);
            }
        }
        // Convert binary string to decimal
        int decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            int digit = ch - '0';
            decimalValue = decimalValue * 2 + digit;
        }
        return decimalValue;
    }
}
