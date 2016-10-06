import java.io.*;
import java.util.*;
import java.net.*;
public class AddressAndHostName
{
 public static void main(String args[])
{
  String s;
 System.out.print(" Enter the url : ");
 Scanner sc =new Scanner(System.in);
s=sc.nextLine();
  try
{
   InetAddress ia=InetAddress.getByName(s);
   System.out.println("Host name is "+ia.getHostName());
   System.out.println("Address is " +ia.getHostAddress());
}
catch(UnknownHostException ex)
{
 System.out.println(ex);
}
}
}
