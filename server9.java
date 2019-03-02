import java.util.*;
import java.net.*;
import javax.net.*;
import java.io.*;
public class server9
{
public static void main(String[]args)throws IOException
{
String myURL="http://www.google.com/";
URL u=new URL(myURL);
HttpsURLConnection conn=(HttpsURLConnection)u.openConnection();
InputStream is=conn.getInputStream();
InputStreamReader in=new InputStreamReader(is);
BufferedReader br=new BufferedReader(in);
String tmp;
while((tmp=br.readLine())!=null)
{
System.out.println(tmp);
}
br.close();
}
}