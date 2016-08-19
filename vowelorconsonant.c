import java.util.*;
import java.lang.*;
import java.io.*;
class vowelorconsonant
{
 public static void Main(String[] args)
 {
  int c=0;
  char input;
  char[] vowels={'a','e','i','o','u'};
  Scanner sc=new Scanner(System.in);
  input=sc.next().charAt(0);
  for(int i=0;i<5;i++)
  {
   if(vowels[i].equals(input))
    c++;
  }
  if(c!=0)
   System.out.println("its a vowel");
  else
   System.out.println("its a consonqnt");
 }
}
