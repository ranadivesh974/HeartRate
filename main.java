package javabased;
import java.util.Scanner;

public class Heartrate
{
    
public static void main(String[] args)

{
	int age, year;

    Scanner sc = new Scanner(System.in);
	System.out.print("enter your birth year: ");
	year = sc.nextInt();
	age = 2021 - year;

	int max = 220 - age;
	int l = ((int)max * 3)/10;
	int h = ((int)max * 5)/10;

	System.out.print("Your age: ");
	System.out.print(age);
	System.out.print("\r\nYour resting heart rate range is: ");
	System.out.print(l);
	System.out.print(" to ");
	System.out.print(h);
	
	int rate;
	System.out.print("\r\nenter your heart rate: ");
	rate = sc.nextInt();
    sc.close();
    
	int range = 0;
	if ( rate >= l && rate <= h)
	{
		System.out.print("Your heart rate is normal, maintain it!");
	}
	else
	{
		System.out.print("Your heart rate is unusual, don't panic either take rest or go visit a cardiologist!");
	}
}
}
