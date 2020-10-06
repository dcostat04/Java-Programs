import java.util.Scanner;
public class SwtichCase{
	public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any two numbers  ");
		int a=sc.nextInt();
		int b=sc.nextInt();
        System.out.println("Enter \n 1. add \n 2. subtract \n 3. multiply \n 4.divide \n 5.modulo  ");
		int c=sc.nextInt();
		int d;
		switch(c){
			case 1:
            d=a+b;
			System.out.println("ans="+ d);
			break;
			case 2:
			d=a-b;
			System.out.println("ans="+ d);
			break;
			case 3:
			d=a*b;
			System.out.println("ans="+ d);
			break;
			case 4:
			if (b!=0){
			float e=a/b;
			System.out.println("ans="+ e);
			break;}
			else{
				System.out.println("not possible");
				break;
			}
			case 5:
			d=a%b;
			System.out.println("ans="+ d);
			break;
			
		}
	}
}