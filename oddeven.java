import java.util.*;
import java.lang.*;
class oddeven
{
 public static void Main(String[] args)
{
 int number;
 Scanner sc=new Scanner(System.in);
 number=sc.nextInt();
 if(((number/2)*2)==number)
  {
   System.out.println(" It is a even number");
  }
 else
 {
  System.out.println(" It is a odd number");
 }
}
}
