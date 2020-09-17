class Cono{
int a;
int b;
Cons()
{
a = 30;
b = 35;
}
Cons(int x, int y)
{
a = x;
b = y;
}
public void display(){
System.out.println(" a = "+a);
System.out.println(" b = "+b);
}
public static void main(String args[])
{
Cons c1 = new Cons();
Cons c2 = new Cons(55,50);
System.out.println("The first constructor is");
c1.display();
System.out.println("The overloaded constructor is");
c2.display();
}
}
