import java.util.*;
class Exce{
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
    }  
    }
    
}