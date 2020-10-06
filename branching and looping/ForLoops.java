import java.util.Scanner;
public class ForLoops{
	public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a  numbers ");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i=i+1)
		{
			fact=fact*i;
		}
		System.out.println("factorial=  "+ fact);
	}
}