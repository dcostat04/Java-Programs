class car
{
   public car()
	{
	   System.out.println("Class car");
	}
   public void vehicleType()
	{	
	   System.out.println("vehicle type:car");
	}
}
class maruti extends car
{
   public maruti()
	{
	  System.out.println("Class maruti");
	}
public void brand()
	{
	  System.out.println("vehicle type:maruti");
 	}
public void speed()
	{
	  System.out.println("80 kmph");
	}	
}
class maruti800 extends maruti
{
   public maruti800()
 	{
	  System.out.println("Class maruti800");
	}
public void speed()
	{
	System.out.println("90 kmph");
	}
public static void main(String abc[])
	{
	  maruti800 m800=new
	  maruti800();
	  m800.vehicleType();
	  m800.brand();	
	 m800.speed();
	}
}
