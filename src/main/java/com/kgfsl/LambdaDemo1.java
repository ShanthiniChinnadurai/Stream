package com.kgfsl;

class LambdaDemo1 {
    
        public void printSomething(String something) {
            System.out.println(something);
        }
    
        public static void main(String[] args) {
            LambdaDemo1 lambdaDemo = new LambdaDemo1();
            String something = "Learning Lambda";
            lambdaDemo.printSomething(something);
        }
    }