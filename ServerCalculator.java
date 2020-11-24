import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
public static void main(String[] args) throws AlreadyBoundException {
	Registry reg;
	try {
		reg = LocateRegistry.createRegistry(9998);
		Lab6Impl pl=new Lab6Impl();
		reg.bind("RMInc",pl);
		System.out.println("Server dang khoi dong!!!!");
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
