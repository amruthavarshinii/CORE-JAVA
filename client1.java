import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.*;
import java.util.zip.*;
public class client1 
{
public static void main(String[]args)throws Exception
{
try
{
Socket s1=new Socket(InetAddress.getLocalHost(),1000);
BufferedReader in=new BufferedReader(new InputStreamReader(s1.getInputStream()));
PrintWriter out=new PrintWriter(s1.getOutputStream(),true);
String data=" ";
CRC32 c=new CRC32();
for(int i=0;i<args.length;i++)
{
System.out.println(args[i]);
c.update(args[i].getBytes());
data=data+args[i]+"$";
}
System.out.println(data);
System.out.println("CRC="+c.getValue());
out.println(data);
out.println(c.getValue());
System.out.println(in.readLine());
}
catch(Exception e)
{
}
}
}
