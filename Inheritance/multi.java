import java.util.*;
class A {
public void runA()
{
System.out.println("A");
}
}
interface B
{
public abstract void runB();
}
class C extends A implements B
{
public void runB()
{
System.out.println("B from C");
}
public void runC()
{
System.out.println("C");
}
}
public class Multi
{
public static void main(String args[])
{
C c = new C();
c.runA();
c.runB();
c.runC();
}
}
