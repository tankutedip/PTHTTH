import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ChuoiServer {
  public static void main(String[] args) throws MalformedURLException, AlreadyBoundException {
	System.out.println("Server dang khoi dong");
	
	int port=9998;
	try {
		LocateRegistry.createRegistry(port);
		ChuoiImpl ch= new ChuoiImpl();
		UnicastRemoteObject.exportObject(ch,port);
		Naming.bind("rmi://192.168.10.75:9998/Chuoi", ch);
		System.out.println("Ket noi den Server thanh cong!");
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
