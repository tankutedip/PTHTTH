import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {

public static void main(String[] args) throws NotBoundException, RemoteException {
	Scanner input=new Scanner(System.in);

     
	Scanner cn=new Scanner(System.in);
	
	try {
		Registry reg=LocateRegistry.getRegistry("localhost",9998);
		Lab6 x= (Lab6) reg.lookup("RMInc");
		
		System.out.println("0. Ket thuc");
		System.out.println("1. Cong hai so");
		System.out.println("2. Tru hai so");
		System.out.println("3. Nhan hai so");
		System.out.println("4. chia hai so");
		
		System.out.println("Nhap thao tac can thuc hiem:");
		int chon = cn.nextInt();
		System.out.println("-------------------------------");
		while (chon>0)
	      {  
			switch(chon){
	            case 1:
	            	System.out.println("Cong hai so");
	            	System.out.println("Nhap x: ");
	        		int x1=cn.nextInt();
	        		System.out.println("Nhap y: ");
	        		int x2=cn.nextInt();
	        		
	        		System.out.println("Ket qua la: " + x.addNum(x1,x2));
	               
	               break;

	            case 2: 
	               System.out.println("Tru hai so");
	            	System.out.println("Nhap x: ");
	        	     int x3=cn.nextInt();
	        		System.out.println("Nhap y: ");
	        		int x4=cn.nextInt();
	        		
	        		System.out.println("Ket qua la: " + x.tru(x3, x4));
	               break;

	            case 3:
	            	System.out.println("Nhan hai so");
	            	System.out.println("Nhap x: ");
	        	     float x5=cn.nextInt();
	        		System.out.println("Nhap y: ");
	        		float x6=cn.nextInt();
	        		
	        		System.out.println("Ket qua la: " + x.nhan(x5, x6));
	               break;
	               
	            case 4:
	            	System.out.println("Chia hai so");
	            	System.out.println("Nhap x: ");
	        	     float x7=cn.nextInt();
	        		System.out.println("Nhap y: ");
	        		float x8=cn.nextInt();
	        		
	        		System.out.println("Ket qua la: " + x.chia(x7, x8));
	               break;
	               
	            case 0:
	            	System.out.println("Ket thuc chuong trinh!");
	            	System.out.println("Cam on!");
	               break;
	            default: 
	            	System.out.println("Nhap thao tac sai, xin moi nhap lai!");
	            	break;
	                          }
			System.out.println("-------------------------------");
			System.out.println("0. Ket thuc");
			System.out.println("1. Cong hai so");
			System.out.println("2. Tru hai so");
			System.out.println("3. Nhan hai so");
			System.out.println("4. chia hai so");
			
			System.out.println("Nhap thao tac can thuc hien:");
			chon = cn.nextInt();
			 
	      }
	}
		catch (RemoteException e) 
		{

		e.printStackTrace();
	    }
	}
}
