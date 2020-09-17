class Tre
{
void sum(int a,int b)
{int sum=a+b;
System.out.println("Sum of two integers:"+sum);
}
void sum(double x, double y)
{
double sum=x+y;
System.out.println("sum of two integers:"+sum);
}
public static void main(String args[])
{
Methodoverloading m=new Methodoverloading();
m.sum(10,20);
m.sum(10.2,20.1);
}
}
