import java.util.*;
import java.io.*;
import java.lang.*;
class sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		DataInputStream br=new DataInputStream(System.in);
		List<Integer> l=new ArrayList<Integer>();
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			l.add(Integer.parseInt(br.readLine()));
		}
		int sum=(Collections.max(l))+(Collections.min(l));
		System.out.println(sum);

	}
}
