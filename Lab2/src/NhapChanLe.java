import java.util.Scanner;

public class NhapChanLe {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(">> Kiem tra so chan le <<");
		System.out.print("Vui long nhap so can kiem tra: ");
		int so = s.nextInt();
		if (so %2 ==0) {
			System.out.println("So " + so + " la so chan!");
		} else {
			System.out.print("So " + so + " la so le!");
		}
	}
}
