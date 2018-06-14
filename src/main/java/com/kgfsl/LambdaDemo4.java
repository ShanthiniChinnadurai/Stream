package com.kgfsl;

interface Printer4 {
    void print(String something);
}

public class LambdaDemo4 {

    public static void printSomething(String something) {
        System.out.println(something);
        //printer.print(something);
    }

    public static void main(String[] args) {
        //LambdaDemo lambdaDemo = new LambdaDemo();
        String something = "Learning Lambda";
        Printer4 printer = LambdaDemo4::printSomething;
        printer.print(something);
    }
}