packed IPAddress;

import java.net.InetAddress;
import java.net.UnKnownHostException;

public class TimDCIP{
  public static void main(String[] args)
  {
    try{
      InetAddress host = InetAddress.getByName(args[0]);
      String hostName = host.getHostName();
      System.out.println("Host name:" + hostName);
      System.out.println("Dia chi IP:" + host.getHostAddress());
    }
    catch(UnKnownHostException e)
    {
      System.out.printl("Khong tim thay dia chi");
      return;
    }
  }
}
