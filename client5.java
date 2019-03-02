import java.util.*;
import java.io.*;
import java.net.*;
import java.lang.*;
public class client5
{
public static void main(String[]args)throws Exception
{
try
{
InetAddress a= InetAddress.getLocalHost();
Socket s1=new Socket(a,8000);
BufferedReader br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
PrintWriter out=new PrintWriter(new OutputStreamWriter(s1.getOutputStream()),true);
String addr=a.getHostAddress();
out.println(addr);
System.out.println(br.readLine());
}
catch(Exception e)
{
}
}
}