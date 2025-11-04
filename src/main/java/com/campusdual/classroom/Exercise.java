package com.campusdual.classroom;

public class Exercise {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }return dividend / divisor;

    }

    public static void main(String[] args) {
        try {
            int result = divisionWithCustomException(3, 0);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }

    }
}
