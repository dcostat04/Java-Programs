import java.util.*;
abstract class A
{
public abstract void fun();
}
class B extends A
{
public void fun()
{
System.out.println(&quot;Concreteimplementation given in B&quot;);
}
}
public class AbsCls
{
public static void main(String args[])
{
B b = new B();
b.fun();
}
}
