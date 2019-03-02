import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.*;
class server7 extends Thread
{
public static void main(String[]args)throws Exception
{
try
{
ServerSocket s1=new ServerSocket(4000);
Socket s2=s1.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(s2.getOutputStream(),true);
String f1,data=" ",tmp;
System.out.println("enter file to be opened");
f1=br.readLine();
File f=new File(f1);
if(f.isFile()&&f.canRead())
{
BufferedReader fil=new BufferedReader(new FileReader(f));
while((tmp=br.readLine())!=null)
data=data+tmp+"\n";
}
else
{
System.out.println("error in input file");
out.println(data);
}
}
catch(Exception e)
{
}
}
}
