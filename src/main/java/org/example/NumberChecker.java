package org.example;

public class NumberChecker {
    public static void checkNumber(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Строка не является числом: " + str);
        }
    }

    public static void main(String[] args) {
        String[] testStrings = {"123", "456.78", "abc", "123abc", ""};

        for (String testString : testStrings) {
            try {
                checkNumber(testString);
                System.out.println(testString + " - строка является числом.");
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
