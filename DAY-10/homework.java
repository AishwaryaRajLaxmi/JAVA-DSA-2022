//1. Write a program to print the given series n , n-6 , n-12 , n-18 ,...... till the value to be printed is greater than Zero(0).

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=num;i>0;i=i-6){
            System.out.println(i+ " ");
        }
    }
}

//2. Write a program to print the given series n , n-3k , n-6k , n-9k ,n-12k ,...... till the value to be printed is greater than Zero(0). Where n and k will be given as input

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=sc.nextInt();
        for(int i=num;i>0;i=i-(3*k)){
            System.out.println(i+ " ");
        }
    }
}.

//3. Write a program to print Alphabets from (A to Z).
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        for(char c='A';c<='Z';c++){
            System.out.print(c +" ");
        }
    }
}

// 4.Write a program to print AAA,bb,CCC,dd,EEE,ff,........uptil 26 lines ,where each String printed in a seperate line.

// 5.Print the series in a single line as given below. Z,z,Y,y,X,x,W,w,V,v,U,u,T,t,S,s,R,r,Q,q,P,p,O,o,N,n,M,m,L,l,K,k,J,j,I,i,H,h,G,g,F,f,E,e,D,d,C,c,B,b,A,a.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       System.out.print("Z,z,Y,y,X,x,W,w,V,v,U,u,T,t,S,s,R,r,Q,q,P,p,O,o,N,n,M,m,L,l,K,k,J,j,I,i,H,h,G,g,F,f,E,e,D,d,C,c,B,b,A,a.");
    }
}

