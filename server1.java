import java.net.*;
import java.io.*;
import java.util.*;
import java.util.zip.*;
import java.lang.*;
public class server1 extends Thread
{
public static void main(String[]args)throws Exception
{
ServerSocket s1=new ServerSocket(1000);
Socket s2=s1.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(s2.getInputStream()));
PrintWriter out=new PrintWriter(s2.getOutputStream(),true);
String str1,str2;
str2=br.readLine();
System.out.println("incoming data:"+str2);
StringTokenizer s=new StringTokenizer(str2,"$");
CRC32 c=new CRC32();
str1=s.nextToken();
for(int i=0;i<s.countTokens()+2;i++)
{
System.out.println(str1);
c.update(str1.getBytes());
str1=s.nextToken();
}
System.out.println(str1);
c.update(str1.getBytes());
Long rCRC=Long.parseLong(br.readLine()), cCRC=c.getValue();
System.out.println("rcrc:="+rCRC);
System.out.println("ccrc=:"+cCRC);
if(rCRC==cCRC)
{
System.out.println("check successful");
out.println("check successful");
}
else
{
System.out.println("check unsuccesful");
out.println("check unsucessful");
}
}
}