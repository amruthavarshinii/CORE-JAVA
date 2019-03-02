import java.io.*;
import java.util.*;
import java.net.*;
public class Client
{
public static void main(String args[])throws Exception
{
InetAddress a=InetAddress.getLocalHost();
Socket s1=new Socket(a,1000);
String add=a.getHostAddress();
BufferedReader br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
PrintWriter out=new PrintWriter(new OutputStreamWriter(s1.getOutputStream()),true);
System.out.println(add);
System.out.println(br.readLine());
s1.close();
}
}