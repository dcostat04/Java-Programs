import java.util.Scanner;
public class TernaryOperators{
	public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter any two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c =a>b?a:b;
    System.out.println("max of both numbers is"+" "+ c);
	}
}