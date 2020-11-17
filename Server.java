package VD;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
public static void main(String[] args) throws AlreadyBoundException {
	Registry reg;
	try {
		reg = LocateRegistry.createRegistry(9988);
		VDImpl pl=new VDImpl();
		reg.bind("RMInc",pl);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
