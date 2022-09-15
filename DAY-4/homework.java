1.// Take two integers as input value.

// Print greater among them as output.

// Note:- If both the values are same then print anyone of the values as output.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        if(m>n){
        System.out.println(m);
        }
        else if(m==n){
            System.out.println(m);
        }
        else{
            System.out.println(n);
        }
            
}
}

// Take an integer value as input.

// Print "Even" if the number is even else print "Odd" if the number is odd.

// Note:- 0 will be considered as even number.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int num;
        Scanner sc=new Scanner(System.in);
        
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
             System.out.println("Odd");
        }
    }
}

// Take income of a person as input from the user, print “No tax to be paid” if income is less than 500,000 and print “Tax to be paid” if income is greater than or equal to 500,000.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        
        if(income<500000){
              System.out.println("No tax to be paid");
        }
        else if(income>500000)
              System.out.println("Tax to be paid");
    }
}

// You are given the marks of a student as an integer input, the teacher gives 4 marks as grace marks if the marks of the student is less than 33, otherwise no grace marks are given. Print the final marks of the student.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        
        if(marks<33){
            System.out.println(marks+4);
        }
        else{
            System.out.println(marks);
        }
    }
}

// You will be given age as an integer input from the user, and print according to the conditions given below a. Print “Super Senior Citizen” if age is equal to or above 70 b. Print “Senior Citizen” if age is below 70 but equal to or above 59. c. Print “Adult” if age is below 59 but equal to or above 18. d. Print “Underage” is age is below 18 but above 1. e. Print “New Born” if none of the above conditions follow.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        
        if(age>=70){
            System.out.println("Super Senior Citizen");
        }
        else if(age<70 && age>=59){
             System.out.println("Senior Citizen");
            
        }
        else if(age<59 && age>=18){
             System.out.println("Adult");
        }
        else if(age<18 && age>1){
             System.out.println("Underage");
        }
        else{
             System.out.println("New Born");
        }
    }
}

// The government adds money into the account of a person based on his age. Take age and salary of the person as integer inputs. And print his final income as an integer data-type output. a. if age is above 60, Rs. 1000 is added into the account b. if age is above 40 and less than or equal to 60, Rs. 500 is added. c. No money is added if the age is less than or equal to 40.
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int salary=sc.nextInt();
        
        if(age>60){
            System.out.println(salary+1000);
        }
        else if(age>40 && age<=60){
              System.out.println(salary+500);
        }
        else if(age<=40){
              System.out.println(salary);
            
        }
        
    }
}
// Home work questions :-
// https://www.hackerrank.com/contests/aug22-java-dsa-homework-challenges/challenges/gkstr06-greater-number

// https://www.hackerrank.com/contests/aug22-java-dsa-homework-challenges/challenges/gkstr04-even-or-odd

// https://www.hackerrank.com/contests/aug22-java-dsa-homework-challenges/challenges/tax-or-not

// https://www.hackerrank.com/contests/aug22-java-dsa-homework-challenges/challenges/grace-marks-1

// https://www.hackerrank.com/contests/aug22-java-dsa-homework-challenges/challenges/print-age-bracket

// https://www.hackerrank.com/contests/aug22-java-dsa-homework-challenges/challenges/print-final-salary-given-age