import java.io.*;
import java.util.*;
import java.lang.*;
import java.net.*;
public class server2
{
public static void main(String[]args)throws Exception
{
String data="Hello client";
try
{
ServerSocket s1=new ServerSocket(8088);
Socket s2=s1.accept();
System.out.println("client connected");
PrintWriter out=new PrintWriter(s2.getOutputStream(),true);
DataInputStream din=new DataInputStream(s2.getInputStream());
if(din.readUTF().equals("1"))
{
System.out.println("string"+data);
out.print(data);
}
s1.close();
s2.close();
out.close();
din.close();
}
catch(Exception e)
{
}
}
}
