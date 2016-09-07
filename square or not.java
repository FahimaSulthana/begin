import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		if(x1==x2 && x3==x4 && y1==y4 && y2==y3)
		System.out.println("it forms a square");
		else
		System.out.println("it does not forms a square");
	}
}
