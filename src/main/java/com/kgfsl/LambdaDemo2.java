package com.kgfsl;

interface Printer2 {
    void print(String val);
}

class LambdaDemo2 {

    public void printSomething(String something, Printer2 printer) {
        //System.out.println(something);
        printer.print(something);
    }

    public static void main(String[] args) {
        LambdaDemo2 lambdaDemo = new LambdaDemo2();
        Printer2 printer = new Printer2() {
            @Override
            public void print(String val) {
                System.out.println(val);
            }
        };
        String something = "Learning Lambda";
        lambdaDemo.printSomething(something, printer);
    }
}