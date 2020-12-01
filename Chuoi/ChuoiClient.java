import java.rmi.Naming;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ChuoiClient {
	public static void menu() {
		System.out.println("1. Dao nguoc va in hoa ki tu");
		System.out.println("2. Dem so ki tu co trong chuoi");
		System.out.println("0. Thoat chuong trinh");
	}
public static void main(String[] args) {
	System.out.println("Client da ket noi...");
	Scanner scn= new Scanner(System.in);
	try {
		Chuoi ch= (Chuoi) Naming.lookup("rmi://192.168.10.75:9998/Chuoi");
		
		menu();
		System.out.println("Nhap chuong trinh can thuc hien");
		int chon= scn.nextInt();
		System.out.println("-------------------------------");
		while(chon>0) {
			switch(chon) {

			case 1:
				System.out.println("Nhap chuoi can dao nguoc va in hoa: ");
				scn.nextLine();
				String s2=scn.nextLine();
				System.out.println("Chuoi sau khi dao nguoc va in hoa la: "+ ch.daochuoi(s2));
				break;
				
			case 2:
				System.out.println("Nhap chuoi can dem so ki tu:");
				scn.nextLine();
				String s3=scn.nextLine();
				System.out.println("So ky tu co trong chuoi: "+ch.demkitu(s3));
				break;
				
			case 0:
				System.out.println("Ket thuc chuong trinh!!!1");
				break;
				
			default:
				System.err.println("Nhap thao tac sai!!!");
				break;
				
			}
			System.out.println("-----------------------------");
			menu();
			System.out.println("Nhap thao tac can thuc hien: ");
			chon=scn.nextInt();
		}
	} catch (MalformedURLException | RemoteException | NotBoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
