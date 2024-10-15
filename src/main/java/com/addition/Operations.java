package com.addition;

public class Operations {

    public Operations() {
    }

    public int sum(int x, int y){
        return x+y;
    }

    public int subtract(int x, int y){
        return x-y;
    }

    public int multiply(int x, int y){
        return x*y;
    }

    public float divide(int x, int y){
        try {
            return (float) x/y;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
            return 0;
        }
    }
}
