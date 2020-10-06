import java.util.*;
class Excep{
    public static void main(String args[]){
    int c;
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter any number:");
    int a = sc.nextInt();
    System.out.println("enter another number");
    int b = sc.nextInt();
    try {
        System.out.println("Peforming division a / b");
        c = a/b;
        System.out.println(c);
    } catch(ArithmeticException e) {System.out.println("You can't divide any number by 0");
    System.out.println("The multiplication of two mentioned numbers:");
    System.out.println(a*b);
    }  
    finally{System.out.println("Even if try and catch blocks are present it does not affect execution of the finally block");
    
    }
    }
}

