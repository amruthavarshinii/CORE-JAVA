import java.io.*;
import java.util.*;
import java.lang.*;
import java.net.*;
public class client2
{
public static void main(String[]args)throws Exception
{
try
{
Socket s1=new Socket("local host",8088);
String command;
DataInputStream din=new DataInputStream(s1.getInputStream());
DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("welcome to telnet");
System.out.println("<telnet prompt>");
command=in.readLine();
dout.writeUTF(command);
System.out.println(din.readLine());
s1.close();
din.close();
dout.close();
}
catch(Exception e)
{
}
}
}