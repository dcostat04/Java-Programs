import java.util.Scanner;
class Array
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int[] a = new int[5];
int i;
System.out.print("Enter Five numbers:");
for(i=0; i<5; i++)
a[i] = sc.nextInt();
System.out.print("The five numbers you entered are :");
for(i=0; i<5; i++)
System.out.print(a[i]+"");

}
}
