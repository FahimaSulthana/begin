import java.util.*;
import java.io.*;
import java.lang.*;
class title
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String title=br.readLine();
		String name=br.readLine();
		System.out.println(title+","+name.charAt(0));
	}
}
