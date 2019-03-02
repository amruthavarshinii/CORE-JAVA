import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.*;
public class server5
{
public static void main(String[]args)throws Exception
{
try
{
ServerSocket s1=new ServerSocket(8000);
Socket s2=s1.accept();
InetAddress a=InetAddress.getLocalHost();
String addr=a.getHostAddress();
BufferedReader br=new BufferedReader(new InputStreamReader(s2.getInputStream()));
PrintWriter out=new PrintWriter(s2.getOutputStream());
System.out.println("client connected");
System.out.println(addr);
System.out.println("client ip is:");
System.out.println(br.readLine());
}
catch(Exception e)
{
}
}
}