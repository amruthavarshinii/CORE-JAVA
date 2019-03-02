import java.io.*;
import java.net.*;
import java.lang.*;
public class client4
{
public static void main(String[]args)throws Exception
{
Socket s1=new Socket(InetAddress.getLocalHost(),1000);
BufferedReader in=new BufferedReader(new InputStreamReader(s1.getInputStream()));
PrintWriter out=new PrintWriter(s1.getOutputStream(),true);
String input;
while((input=in.readLine())!=null)
{
out.println(input);
System.out.println("clint reciver acknowledge");
}
}
}