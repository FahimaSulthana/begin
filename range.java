import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int r=sc.nextInt();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n>r)
		{
			System.out.println("out of range! please enter valid number");
			n=sc.nextInt();
		}
		else
		System.out.println("Success");
	}
}
