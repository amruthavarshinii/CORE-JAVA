import java.util.*;
import java.net.*;
import java.io.*;
class server
{
public static void main(String[]args)throws Exception
{
ServerSocket s1=new ServerSocket(1000);
Socket s2=s1.accept();
InetAddress a=InetAddress.getLocalHost();
String addr=a.getHostAddress();
BufferedReader in =new BufferedReader(new InputStreamReader(s2.getInputStream()));
PrintWriter out=new PrintWriter(s2.getOutputStream(),true);
System.out.println("client connected");
System.out.println(addr);
System.out.println("Client ip address is:");
System.out.println(in.readLine());
s1.close();
s2.close();
}
}

