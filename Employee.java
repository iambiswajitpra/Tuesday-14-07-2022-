package Tuesday15072022;
import java.util.Scanner;
public class Employee {
	public static void main(String[] args)
	{
		//Counter Variable for loop
		int basicSal, HRA, DA, grossSal;
		
		Scanner sc=new Scanner(System.in); //taking data from user
		System.out.println("Enter the Basic Salary:");
		basicSal =sc.nextInt();
		
		if(basicSal >=1500)  //applying condition acc. to Question
		{
			HRA=20*basicSal/100;
			DA=90*basicSal/100;
		}
		else
		{
			HRA=500;
			DA=70*basicSal/100;
		}
		
		//Calculating Gross Salary
		grossSal=basicSal+HRA+DA;
		System.out.println("The Gross Salary of the employee is "+grossSal);
		
	}
}
