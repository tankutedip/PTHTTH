package VD;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class VDImpl extends UnicastRemoteObject implements VD {

	   public VDImpl() throws RemoteException{
		   super();
	   }
	   public int addNum(int x, int y) throws RemoteException{
		   System.out.println("Client yeu cau tinh toan");
		   return (x+y);
	   }
	}
