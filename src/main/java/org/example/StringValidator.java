package org.example;

public class StringValidator {
    public static void validateStringLength(String str) throws InvalidStringLengthException {
        if (str.length() < 5) {
            throw new InvalidStringLengthException("Длина строки меньше 5 символов: " + str);
        }
    }
}
