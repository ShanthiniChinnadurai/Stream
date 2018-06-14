package com.kgfsl;

interface Printer5 {
    void print();
}

public class LambdaDemo5 {

    public static void printSomething() {
        System.out.println("something");
        //printer.print(something);
    }

    public static void main(String[] args) {
        //LambdaDemo lambdaDemo = new LambdaDemo();
        //String something = "Learning Lambda";
        Printer5 printer = LambdaDemo5::printSomething;
        printer.print();
    }
}
