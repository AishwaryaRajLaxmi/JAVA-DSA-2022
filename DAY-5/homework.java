
https://www.hackerrank.com/contests/aug22-java-dsa-homework-challenges/challenges/even-odd-1000

https://www.hackerrank.com/contests/aug22-java-dsa-homework-challenges/challenges/print-z-and-x-divisible-by-3

// Take an integer input.

// If the entered number is an even number, then

// a. If the number is greater than 1000, then print “Even and above 1000”

// b. Else print “Even”

// Else If the entered number is an odd number, then

// a. If the number is greater than 1000, then print “Odd and above 1000”

// b. Else print “Odd”

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            if(num>1000){
            System.out.println("Even and above 1000");
            }
            else{
                System.out.println("Even");
            }
        }
        else if(num%2!=0){
            if(num>1000){
                System.out.println("Odd and above 1000");
            }
            else{
                System.out.println("Odd");
            }
        }
        
    }
}

// Take integer inputs x, y, z from the user,

// If the x is divisible by 3, then

// a. If y is greater than or equal to 200, then add 10 to the value of z.

// b. Else if y is greater than or equal to 100 but less than 200, then add 5 to the value of z

// c. Else if y is greater than or equal to 50, but less than 100, then add 4 to the value of z

// d. Else add 1 to z

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
         int y=sc.nextInt();
        int z=sc.nextInt();
        
        if(x%3==0){
            if(y>=200){
                z=z+10;
            }
        else if(y>=100 && y<200){
            z=z+5;
           }
         else if(y>=50 && y<100){
             z=z+4;
         }   
            else{
                z=z+1;
            }
            
        }  
        else if(x%3!=0){
            if(y>=200){
            z=z+3;}
            else if(y>=100 && y<200){
                z=z+2;
            }
            else{
                z=z+1;
            }
                
            }

        System.out.println(z+10);
    }
}