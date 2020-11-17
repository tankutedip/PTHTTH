package VD;
import java.rmi.Remote;
import java.rmi.RemoteException;

	public interface VD extends Remote{
	   int addNum(int x, int y) throws RemoteException;
	}

