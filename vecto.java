import java.util.*;

class Vecto{
public static void main(String args[]){
Vector<String>vec=new Vector<String>(4);

vec.addElement("BLUE");
vec.addElement("YELLOW");
vec.addElement("GREEN");
vec.addElement("RED");

System.out.println("Size is: "+vec.size());
System.out.println("Intial capacity is: "+vec.capacity());

vec.addElement("PURPLE");
vec.addElement("PINK");

System.out.println("Size after adding: "+vec.size());
System.out.println("capacity after adding: "+vec.capacity());
Enumeration en=vec.elements();
System.out.println("Elements are: ");
while(en.hasMoreElements())
 System.out.println(en.nextElement() +" ");
}}
