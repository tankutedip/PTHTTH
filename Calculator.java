import java.rmi.Remote;
import java.rmi.RemoteException;

	public interface Lab6 extends Remote{
	   int addNum(int x, int y) throws RemoteException;
	   public int tru(int x, int y) throws RemoteException;
	   public double nhan(float x, float y) throws RemoteException;
	   public double chia(float x, float y) throws RemoteException;
	}
