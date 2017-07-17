# pa1
import java.io.*;
import java.util.*;
public class Strreve
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String a;
    String reverse="";
    System.out.println("Enter the string");                                                                      
    a=sc.nextLine();
    String s[]=a.split(" ");
    int len=a.length();
    for(String s1:s)
    {
      StringBuffer b=new StringBuffer(s1);
      System.out.print(b.reverse().toString()+" ");
      sc.close();
    }
  }
}
