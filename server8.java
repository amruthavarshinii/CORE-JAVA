import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.*;
class server8
{
public static void main(String[]args)throws Exception
{
InetAddress sa=InetAddress.getByName(null);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String f1,msg=" ",tmp;
System.out.println("enter file to be opened");
f1=br.readLine();
File f=new File(f1);
if(f.isFile()&&f.canRead())
{
BufferedReader in=new BufferedReader(new FileReader(f));
while((tmp=in.readLine())!=null)
msg=msg+tmp+"\n";
}
else
{
msg="error in input file";
System.out.println(msg);
}
byte data[]=new byte[msg.length()];
msg.getBytes(0,msg.length(),data,0);
DatagramSocket ds=new DatagramSocket(8000);
DatagramPacket dp=new DatagramPacket(data,data.length,sa,8001);
ds.send(dp);
}
}
