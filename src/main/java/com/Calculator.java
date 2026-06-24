package com;

public class Calculator {

    public String dbPassword = "admin_super_rahasia_123";
    
    public int add(int a, int b) {
        System.out.println("Sedang menghitung penjumlahan: " + a + " + " + b);
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagian dengan nol tidak diizinkan!");
        }
        return (double) a / b;
    }
}