import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Lab6Impl extends UnicastRemoteObject implements Lab6 {

	   public Lab6Impl() throws RemoteException{
		   super();
	   }
	   public int addNum(int x, int y) throws RemoteException{
		   System.out.println("Client yeu cau tinh toan");
		   return (x+y);
	   }
	   public int tru(int x, int y) throws RemoteException{
		   if(x>y) {
			   return x-y;
		   }
		   else if(x==y) {
			   return 0;
		   }
		   else
			   return y-x;
	   }
	   
	   public double nhan(float x, float y) throws RemoteException{
		   return x*y;
	   }
	   
	   public double chia(float x, float y) throws RemoteException{
		   if (x>y)
		   return x/y;
		   else return 0;
	   }
	}
