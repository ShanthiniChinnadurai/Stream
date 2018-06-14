package com.kgfsl;

interface Printer3 {
    void print(String val);
}

class LambdaDemo3 {

    public void printSomething(String something, Printer3 printer) {
        //System.out.println(something);
        printer.print(something);
    }

    public static void main(String[] args) {
        LambdaDemo3 lambdaDemo = new LambdaDemo3();
        Printer3 printer = (String toPrint) -> {
                System.out.println(toPrint);
            
        };
        String something = "Learning Lambda";
        lambdaDemo.printSomething(something, printer);
    }
}
