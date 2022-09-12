// 1
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}

// 2.There are  lines of input, and each line contains a single integer.

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
         int b=scan.nextInt();
        int c=scan.nextInt();
        // Complete this line
        // Complete this line
        
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // Complete this line
        // Complete this line
    }
}



// 3.You will be given two integers x and y. You have to print the sum of x and y in the first line, and the difference of x and y in the second line.

// First integer input should be stored in x, Second integer input should be stored in y.


// // "static void main" must be defined in a public class.
public class Main {  
    public static void main(String[] args) {
   int x=10;
        int y=20;
        Scanner sc=new Scanner(System.in);
        System.out.println(x+y);
        System.out.println(x-y);
        
    }
}

// 4.Take length and breadth of the rectangle as input. And print area of the rectangle in the first line and perimeter of the rectangle in the second line.

// In the first line, length of the rectangle is given as input. In the second line, breadth of the rectangle is given as input.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        
        System.out.println(length*breadth);
        System.out.println((2*length)+(2*breadth));
    }
}

// 5.You will be given Fahrenheit as input that should be stored in a double variable and print your answer in Celsius of data-type double.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        
        Scanner sc=new Scanner(System.in);
        double faren=sc.nextDouble();
        double cel=(faren-32)*5/9;
        System.out.println(cel);
    }
}

6.