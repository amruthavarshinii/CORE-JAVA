import java.io.*;
import java.net.*;
import java.lang.*;
import java.util.*;
public class server6
{
public static void main(String[]args)throws Exception
{
try
{
ServerSocket s1=new ServerSocket(4000);
Socket s2=s1.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(s2.getInputStream()));
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(s2.getOutputStream(),true);
String s,t;
while(true)
{
System.out.println("server");
s=in.readLine();
System.out.println("server:"+s);
System.out.println(br.readLine());
}
}
catch(Exception e)
{
}
}
}
