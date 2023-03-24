/*  Write a java Program. Create a class Calculation add methods 
    addition, Substraction, Multiplication and Division to it.
     Create objects and access those methods.               */
	 
	 
class Calculation
{
	public int Add(int num1, int num2)
	{
		System.out.println(num1 + num2);
		return num1 + num2;
	}
	public int Sub(int num1, int num2)
	{
		System.out.println(num1 - num2);
		return num1 - num2;
	}
	public int  Mul(int num1, int num2)
	{
		System.out.println(num1 * num2);
		return num1 * num2;
	}
	public int Div(int num1, int num2)
	{
		System.out.println(num1 / num2);
		return num1 / num2;
	}
}	 
class GetCalculation
{
	public static void main(String args[])
	{
		Calculation c = new Calculation();
		c.Add(5,5);
		c.Sub(6,1);
		c.Mul(3,3);
		c.Div(12,6);
	}

}