import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.*;
public class client6
{
public static void main(String[]args)throws Exception
{
try
{
Socket s1=new Socket(InetAddress.getLocalHost(),4000);
BufferedReader br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(s1.getOutputStream(),true);
String input,t;
while(true)
{
System.out.println("client");
System.out.println("client:"+in.readLine());
System.out.println(br.readLine());
}
}
catch(Exception e)
{
}
}
}