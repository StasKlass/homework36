package org.example;

public class Main {
    public static void main(String[] args) {
        String[] testStrings = {"hello", "world", "java", "code", "example"};

        for (String testString : testStrings) {
            try {
                StringValidator.validateStringLength(testString);
                System.out.println("Строка \"" + testString + "\" имеет допустимую длину.");
            } catch (InvalidStringLengthException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Проверка строки завершена.");
            }
        }
    }
}
