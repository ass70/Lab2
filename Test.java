import java.util.Scanner;


public class Test{
	public static void main(String[] args){
		System.out.println("Test!");
		System.out.println("Welcome to lab 2!");
		System.out.println("This program will calculate your speed: ");
		
		System.out.print("Enter how many miles you have traveled:  ");
		double miles;
		
		Scanner sc = new Scanner(System.in);
		miles = sc.nextDouble();
		
		System.out.print("How many hours did it take you to get there:  ");
		double hours;
		
		hours = sc.nextDouble();
		
		double speed = miles / hours;
		
		System.out.println("Your speed is :  " + speed + "mph");
		
		
		
	}
}