import java.util.*;
import java.io.*;
import java.lang.*;
class digit
{
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		char[] g=s.toCharArray();
		for(int i=0;i<g.length;i++)
		{
			if(Character.isDigit(g[i]))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
