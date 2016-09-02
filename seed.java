import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=n;
		int seed=n;
		while(k>0)
		{
			int m=k%10;
			if(m==0)
			{
				System.out.println("number with zero cant have seed value");
				break;
			}
			seed=seed*m;
			k=k/10;
		}
		System.out.println(n+"is the seed of"+seed);
	}
}
