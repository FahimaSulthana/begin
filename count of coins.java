import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of coins");
		int coins=sc.nextInt();
		int array[]=new int[coins];
		for(int i=0;i<coins;i++)
		{
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("enter the sum");
		int sum=sc.nextInt();
		int sum1=sum;
		while(sum!=0)
		{
			if(sum>=array[coins-1])
			{
			   sum=sum/array[coins-1];
			   if(sum!=0)
			   {
					System.out.println(sum+"coins of"+array[coins-1]);
			   }
			   sum=sum1%array[coins-1];
			}
			coins--;
		}
	}
}
