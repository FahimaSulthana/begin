import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		List<Integer> l=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		l.add(sc.nextInt());
		l.add(sc.nextInt());
		l.add(sc.nextInt());
		System.out.println(Collections.max(l));
	}
}
