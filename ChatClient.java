import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
class ChatClient
{
private static int port=1001;
private static String host="localhost";
public static void main(String[] args)throws IOException
{
Socket server;
PrintWriter out=null;
try
{
server=new Socket(host,port);
out=new PrintWriter(server.getOutputStream(),true);
}
catch(UnknownHostException e)
{
System.err.println(e);
System.exit(1);
}
BufferedReader stdln=new BufferedReader( new InputStreamReader(System.in));
String msg;
while((msg=stdln.readLine())!=null)
{
out.println(msg);
}
}
}