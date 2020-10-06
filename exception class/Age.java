 import java.util.*;
 class Age{  
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in); 
    System.out.println("Enter age:");
    int a = sc.nextInt();  
     if(a<18)  
      throw new ArithmeticException("invalid");  
     else  
      System.out.println("eligible");  
}
   }  