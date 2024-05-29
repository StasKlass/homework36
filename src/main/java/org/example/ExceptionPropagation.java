package org.example;

import java.io.IOException;

public class ExceptionPropagation {

    public static void method1() throws IOException {
        method2();
    }

    public static void method2() throws IOException {
        method3();
    }

    public static void method3() throws IOException {
        throw new IOException("Исключение из method3");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (IOException e) {
            System.out.println("Исключение перехвачено в main: " + e.getMessage());
        } finally {
            System.out.println("Завершение программы.");
        }
    }
}
