import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		      int c=0;
        String input;
        String[] vowels={"a","e","i","o","u"};
        Scanner sc=new Scanner(System.in);
        input=sc.next();
        for(int i=0;i<5;i++)
        {
         if(vowels[i].equals(input))
         c++;
        }
        if(c!=0)
         System.out.println("its a vowel");
        else
         System.out.println("its a consonant");
	}
}
