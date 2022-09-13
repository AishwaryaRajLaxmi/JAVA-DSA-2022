1.// Write a Program to print numbers from 20 to N , where N is taken input from the user.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        
        for(int i=20;i<=N;i++){
            System.out.print(" " +i);
        }
        
    }
}

// 2.Write a program to print the First 20 multiples of 9 in the same line.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        for(int i=1;i<=20;i++){
System.out.print((9*i) +" ");
            }
    }
}

// 3.Write a program to print the First N multiples of 11.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            System.out.print((11*i) + " ");
        }
    }
}

// 4.Write a program to print the given series 3,11,19,27,35....... till n using i=i+8 , Where n is taken from user.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        // int i=3;
        
        for(int i=3;i<n;i+=8){
            System.out.print(i +" ");
        }
        
    }
}

// 5.Write a program to print the given series 13,18,23,28,33....... till n using i=i+5 , Where n is taken from user.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=13;i<n;i+=5){
            System.out.print(i +" ");
        }
    }
}

// 6.Write a program to print numbers from n to 5 .Where n is taken as input from user.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=n;5<=i;i--){
            System.out.print(i +" ");
        }
        
    }
}


// 7.Write a program to print the multiples of 8 starting from n to 1, where n taken as input from user.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=n;i>=8;i--)
        if(i%8==0){
            System.out.print( i +" ");
        }
    }
}

