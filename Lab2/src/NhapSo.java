import java.util.Scanner;

public class NhapSo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so hang thu nhat: ");
		int a= scanner.nextInt();
		System.out.print("Nhap so hang thu hai: ");
		int b= scanner.nextInt();
		int kq = a+b;
		System.out.println("Tong " + a + " + " + b + " = " + kq);
	}

}