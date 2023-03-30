/*3.Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". 
Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "Type". 
Create an object of the Car class and call both the "drive" and "Type" methods.*/

class vehicle
{
	String brand="bmw",model="bmw1";
	int year=2007;
	void drive()
	{
		System.out.println("\nI am From Drive Method:\nBrand: "+brand+"\nmodel= "+model+"\nyear="+year);
	}
}
class car extends vehicle
{
	String colour="black";
	void type()
	{
		System.out.println("\nI am from Type Method:\nColour= "+colour);
	}
}
class GetVehicle
{
	public static void main(String args[])
	{
		car c=new car();
		c.drive();
		c.type();
	}
}