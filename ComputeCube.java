import java.util.Scanner;


public class ComputeCube
{

public static void main(String[]args)
{
	System.out.println("What is x of the root cube?");
	//create a scanner to get input data
	Scanner keyboard= new Scanner(System.in);
	
	double x = keyboard.nextDouble();
	double Integerx= Math.pow(x, 3);
	System.out.println("The result of x cubed is " + Integerx+
						"The x is "+ x);
	
	

}//end main

}//end ComputeCube