/*1. Write a program in java showing overloading of Add method with 2 and 3 parameters.
If the user passes 2 values method with 2 parameter should be called, if he passes 3 values method with 3 parameters should be called*/

class Addition
{
	public void Add(int a, int b)
	{
		System.out.println("I am Add Method with Two Parameters");
	}
	public void Add(int a, int b, int c)
	{
		System.out.println("I am Add Method with Three Parameters");
	}
}
class OverloadedAdd
{
	public static void main(String args[])
	{
	Addition A = new Addition();
	A.Add(5,6,3);
	}
}