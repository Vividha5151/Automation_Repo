package string_assignment;

import java.util.Scanner;

public class percentage_ofcharacter {

	public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String input = sc.nextLine();  
        int totalCharacters = input.length();  
        int uppercaseCount = 0;  
        int lowercaseCount = 0;  
        int digitCount = 0;  
        int specialCharCount = 0;  
        for (int i = 0; i < totalCharacters; i++) {  
            char ch = input.charAt(i);  
            if (Character.isUpperCase(ch)) {  
                uppercaseCount++;  
            } else if (Character.isLowerCase(ch)) {  
                lowercaseCount++;  
            } else if (Character.isDigit(ch)) {  
                digitCount++;  
            } else {  
                specialCharCount++;  
            }  
        }  
        double uppercasePercentage = (uppercaseCount * 100.0) / totalCharacters;  
        double lowercasePercentage = (lowercaseCount * 100.0) / totalCharacters;  
        double digitPercentage = (digitCount * 100.0) / totalCharacters;  
        double specialCharPercentage = (specialCharCount * 100.0) / totalCharacters;  
        System.out.println("Uppercase letters: " + uppercasePercentage + "%");  
        System.out.println("Lowercase letters: " + lowercasePercentage + "%");  
        System.out.println("Digits: " + digitPercentage + "%");  
        System.out.println("Special characters: " + specialCharPercentage + "%");  
        sc.close();  
    }  
}  
