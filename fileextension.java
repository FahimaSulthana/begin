import java.util.*;
import java.io.*;
import java.lang.*;
class fileextension
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int flag=0;
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='.')
			{
				flag=1;
				i++;
			}
			if(flag==1)
				System.out.println(a[i]);

			
		}

	}
}
