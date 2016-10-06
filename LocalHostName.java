import java.io.*;
import java.net.*;
import java.util.*;
public class LocalHostName
{
  public static void main(String args[])
{
   try
{
   InetAddress address =InetAddress.getLocalHost();
   System.out.println(address);
}
catch(UnknownHostException ex)
{
  System.out.println("couldn't find this computer's address");
}
}
}
   
