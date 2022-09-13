// You will be given two digits x, y as character inputs, you need to form the two-digit number from it. Print the final output based on the conditions given below,

// a) If character x is zero, then print only the digit y in the integer data-type format.

// b) Otherwise, print the number xy.

// For eg if x is ‘3’ and y is ‘8’, then print the number 38 in the integer data-type format.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        char x=sc.next().charAt(0);
        char y=sc.next().charAt(0);
        
        if(x=='0'){
            System.out.println(y);
        }
        else{
            System.out.print(x);
            System.out.print(y);
        }
            

    }
}

// Take in a character as an input from the user,

// **A. Conditon 1 **: If the character is an alphabet then you need to toggle the character first,

// For eg, if the entered character is ‘a’, then convert it into ‘A’, and if the entered character is ‘A’ then convert it into ‘a’, this simply means that if the entered character is a capital case then convert it into small case character and vice-versa. After toggling the character, a. if the resultant character is not ‘a’, ‘A’, ‘b’, ‘B’, then take two jumps to the left and print the character, for eg. If the toggled character is ‘c’ then print ‘a’, If the toggled character is ‘Z’, then print ‘X’. b. If the toggled character is ‘a’, ‘A’, ‘b’, ‘B’, then print “Sorry”           need to find error

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        
        if(ch<=97 && ch>=122 || ch>=65 && ch<=90){
           
            System.out.println(ch(char)+48);
            
            if(ch!='a' || ch!='A' ||ch!='b' ||ch!='c'){
             
                System.out.println(ch-=2);
            }
            else if(ch=='a' || ch=='A' || ch=='b' || ch=='B'){
                System.out.println("Sorry");
            }
        }
    }
}

