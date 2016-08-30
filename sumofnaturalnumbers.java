import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
}
