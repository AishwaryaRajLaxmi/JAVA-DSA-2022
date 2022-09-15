https://www.hackerrank.com/contests/aug22-java-dsa-homework-challenges/challenges/print-above-given-ab
https://www.hackerrank.com/contests/aug22-java-dsa-homework-challenges/challenges/height-weight-and-age

// Take integer inputs a, b, and

// a. If a is greater than 100 and b is greater 10, then print “a is above 100 and b is above 10”

// b. If the above condition doesn't match then if a is greater than 50 and b is greater than 50, then print “a is above 50 and b is above 50”

// c. If the above condition doesn't match then if a is greater than 20 and b is greater than 100, then print “a is above 20 and b is above 100”

// d. If none of the above conditions follow then print “None”

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         int b=sc.nextInt();
        
    if(a>100 && b>10){
        System.out.println("a is above 100 and b is above 10");
    }
        else if(a>50 && b>50)
        {
           System.out.println("a is above 50 and b is above 50"); 
        }
        
    else if(a>20 && b>100){
        System.out.println("a is above 20 and b is above 100");
    }
        else{
            System.out.println("None");
        }
}
    

}

// Take height, weight and age of a person as an integer input and

// a. If height is equal to 5 and weight is equal to 50 and age is equal to 10, then print “Overweight”

// b. If height is equal to 5 or weight is equal to 60, then print “Fat”

// c. If height is equal to 6 and weight is equal to 50, then print “Slim”

// d. If none of the condition follows, then print “None”

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int weight=sc.nextInt();
        int age=sc.nextInt();
        
        if(height==5 && weight==50 && age==10){
            System.out.println("Overweight");
        }
        
        else if(height==5 && weight==60){
            System.out.println("Fat");
        }
       else  if(height==6 && weight==50){
            System.out.println("Slim");
        }
        else{
            System.out.println("None");
        }
    }
}