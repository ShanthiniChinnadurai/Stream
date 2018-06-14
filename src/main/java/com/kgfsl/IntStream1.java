package com.kgfsl;

import java.util.stream.IntStream;

public class IntStream1 {
  public static void main(String[] args) {
    IntStream i = IntStream.of(4,3,2,1);
    //System.out.println(i);
    i.forEachOrdered(System.out::println);
  }
}