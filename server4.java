import java.io.*;
import java.net.*;
import java.lang.*;
import java.util.*;
public class server4
{
public static void main(String[]args)throws Exception
{
ServerSocket s1=new ServerSocket(1000);
Socket s2=s1.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(s2.getInputStream()));
PrintWriter out=new PrintWriter(s2.getOutputStream(),true);
Date d=new Date();
while(true)
{
System.out.println("server side:"+d.toString());
System.out.println(br.readLine());
}
}
}