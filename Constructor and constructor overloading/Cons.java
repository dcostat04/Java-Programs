class Cons{
int a;
int b;
Cons()
{
a = 20;
b = 25;
}
public void display(){
System.out.println("Value of a is = "+a);
System.out.println("Value of b is = "+b);
}
public static void main(String args[])
{
Cons c1 = new Cons();
System.out.println("Constructor dislpay:");
c1.display();
}
}
