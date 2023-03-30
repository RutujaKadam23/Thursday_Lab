/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. 
Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle.
Print the area and perimeter of a rectangle*/

class Rectangle
{
	int length, breadth;
	Rectangle(int x, int y)
	{
		length=x;
		breadth=y;
	}

	public void Area()
	{
		System.out.println("area of rectangle is: "+(length * breadth));
	}
	public void Perimeter()
	{
		System.out.println("Perimeter of rectangle is: "+(2*(length+breadth)));
	}
}
class GetRectangle
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(10,20);
		r.Area();
		r.Perimeter();
	}
}