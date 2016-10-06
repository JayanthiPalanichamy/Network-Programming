import java.io.*;
import java.net.*;
import java.util.*;
public class AllHostName
{
  public static void main(String args[])
{
  String a;
Scanner sc= new Scanner(System.in);
  System.out.print("Enter the url:");
  a=sc.nextLine();
   try
{
   InetAddress[] address =InetAddress.getAllByName(a);
  for(int i=0;i<address.length;i++){
   System.out.println(address[i]);
}
}
catch(UnknownHostException ex)
{
  System.out.println("couldn't find"+a);
}
}
}
   
