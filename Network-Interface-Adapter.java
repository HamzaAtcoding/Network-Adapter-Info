package pkg;
import java.net.*;
import java.util.*;

public class NetWorkInfo
{
public static void main(String args[])
{
  try{
	NetworkInterface ntAdapter = null;
	InetAddress inet = null;

	System.out.println("Network Interface Informations");
	Enumeration<NetworkInterface> Enumeration = NetworkInterface.getNetworkInterfaces();
	while(Enumeration.hasMoreElements())
	{
	ntAdapter = (NetworkInterface)Enumeration.nextElement();
	System.out.println(" Adapter Display Name :"+ntAdapter.getDisplayName());
	System.out.println("Adapter Name : "+ntAdapter.getName());
	Enumeration e = ntAdapter.getInetAddresses();
	while(e.hasMoreElements())
	{
	inet = (InetAddress)e.nextElement();
	System.out.println("	 IP Address : "+inet.getHostAddress() );
	}
	}
  }catch(Exception e){e.printStackTrace();}

}
}