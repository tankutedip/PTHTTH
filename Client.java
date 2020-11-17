package VD;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {

public static void main(String[] args) throws NotBoundException {
	Scanner cn=new Scanner(System.in);
	try {
		Registry reg=LocateRegistry.getRegistry("localhost",9988);
		VD x= (VD) reg.lookup("RMInc");
		System.out.println("Nhap x: ");
		int x1=cn.nextInt();
		System.out.println("Nhap y: ");
		int x2=cn.nextInt();
		
		System.out.println("Ket qua la: " + x.addNum(x1,x2));
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}