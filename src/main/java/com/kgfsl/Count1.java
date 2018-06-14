package com.kgfsl;

import java.util.*;

class Count1 {

   // Driver code
   public static void main(String[] args)
   {

       // creating a list of Integers
       List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10, 12, 15, 16, 2, 0, 6, 8, 10,90,13);

       // Using count() to count the number
       // of elements in the stream and
       // storing the result in a variable.
       long total = list.stream().distinct().count();

       // Displaying the number of elements
       System.out.println(total);
   }
}