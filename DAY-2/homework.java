// 1) Take the diameter of a circle as input. Print the area of the circle as integer input.

// 2) Take the base and height of a triangle as input and store them in double variables x
// and y and print its area.

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();

       
        System.out.println("Area of Triangle:" +(x*y)/2);
              
            }
        }
      

// 3) Take an input x, check if it is greater than 1000 or not. Print true or false.


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
    if(x>1000){
        System.out.println("true");
    }
        else{
              System.out.println("false");
        }

       
                   
     }    }

// 4) For 3rd and 4th Question. Attempt the Quiz
// https://forms.gle/bJCRD9hTR3PzZ4uN6

// 5) Find the answer of the following expressions
// a. Int x = 7+3+4
// b. Int x = 12 + 5 + 8
// c. Int x= 13/5 + 18/8
// d. double x= 12 + 5.0 + 2.76
// e. double x= 12/3 + 13/2
// f. double x=12/3 + 13.0/2
// g. double x=14/2 + 15.0/4
// h. double x= 13/2 % 5/3
// i. double x= 17.0/2 % 16.0/4


public class Main {
    public static void main(String[] args) {
     
    
              System.out.println(7+3+4);
         System.out.println(12+5+8);
        System.out.println(13/5 + 18/8);
        System.out.println((double)12 + 5.0 + 2.76);
        System.out.println((double)12/3 + 13/2);
        System.out.println((double)12/3 + 13.0/2);
        System.out.println((double)14/2 + 15.0/4);
        System.out.println((double)13/2 % 5/3);
        System.out.println((double)17.0/2 % 16.0/4);
        }
}


// 6) Store these expressions inside a Boolean variable ans. Print their outputs true or
// false accordingly
// a. boolean ans = 3 > 2
// b. boolean ans = 3 ≥ 3
// c. boolean ans = 4 + 3 > 9
// d. boolean ans = 10 + 8 > 10
// e. boolean ans = 12 != 10
// f. boolean ans = 13 == 13
// g. boolean ans = 14 != 14
// h. boolean ans = 20 == 5*4
// i. boolean ans = 30 != 3+4-10
// j. boolean ans = 20 == 41/2

public class Main {
    public static void main(String[] args) {
      boolean ans;
       ans = 3 > 2;
       System.out.println(ans);    
       ans = 3 >= 3;
       System.out.println(ans);
       ans = 4 + 3 > 9;
       System.out.println(ans);
      ans = 10 + 8 > 10;
         System.out.println(ans);
        ans = 12 != 10;
         System.out.println(ans);
 ans = 13 == 13;
         System.out.println(ans);
    ans = 14 != 14;
         System.out.println(ans);
  ans = 20 == 5*4;
         System.out.println(ans);
  ans = 30 != 3+4-10;
         System.out.println(ans);
  ans = 20 == 41/2;
         System.out.println(ans);
    
        }
}

// 7) Take marks of a student in five subjects as input in a
//  double variable. Print the sum
// of total marks and also find the percentage of the student.

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        // double a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        double total,percentage;
        total=a+b+c+d+e;
        percentage=total/5;
        System.out.println("Tota:l"+total);
        System.out.println("percentage:"+percentage);
        
    }
}

// 8) Take four integer inputs and check if the product of them is greater than 1000 or
// not. Print true or false accordingly.

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int w=sc.nextInt();
        int product=x*y*z*w;
       
        if(product>1000){
              System.out.println("true");
        }
        else{
            System.out.println("false");
        }

// // 9) Take an integer input and check if the number is divisible by 7 or not.

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
      
             
        if(x%7==0){
              System.out.println("it is divisible by 7");
        }
        else{
            System.out.println("it is not divisible by 7");
        }
            