import java.io.*;
import java.net.*;
import java.lang.*;
class client7
{
public static void main(String[]args)throws Exception
{
Socket s1=new Socket(InetAddress.getLocalHost(),4000);
BufferedReader in=new BufferedReader(new InputStreamReader(s1.getInputStream()));
String tmp;
while((tmp=in.readLine())!=null)
System.out.println(tmp);
}
}