import java.io.*;
import java.net.*;
import java.util.*;
public class Hostname
{
  public static void main(String args[])
{
  String a;
Scanner sc= new Scanner(System.in);
  System.out.print("Enter the url:");
  a=sc.nextLine();
   try
{
   InetAddress address =InetAddress.getByName(a);
   System.out.println(address);
}
catch(UnknownHostException ex)
{
  System.out.println("couldn't find"+a);
}
}
}
   
