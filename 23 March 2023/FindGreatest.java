/*Write a program to take 3 numbers and Find the greatest of all the 3 numbers.*/

import java.util.Scanner;  
public class FindGreatest  
{  
	public static void main(String[] args)   
	{  
		int a, b, c, Greatest, z;  
		Scanner sc = new Scanner(System.in); //object of the Scanner class  
   
		System.out.println("Enter the first number:"); //reading input from the user for number 1
		a = sc.nextInt();  
		System.out.println("Enter the second number:"); //reading input from the user for number 2
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  //reading input from the user for number 3
		c = sc.nextInt();  
		
		z=a>b?a:b;  //comparing a and b and storing the Greatest number in a z variable  
		
		Greatest=c>z?c:z;  //comparing the z variable with c and storing the result in the variable  
		 
		System.out.println("The Greatest number is: "+ Greatest);  //prints the Greatest number 
	}  
}