package lab1.hoangpt;

import java.util.Scanner;

public class TinhTong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In ra một dòng tiêu đề App
		System.out.println("CT tính tổng\n");
		// Chuẩn bị cho việc nhập
		Scanner Banphim = new Scanner(System.in);
		// In dòng mời nhập A
		System.out.print("mời nhập a:");
		double a = Banphim.nextDouble();
		System.out.print("mời nhập b:");
		double b = Banphim.nextDouble();
		// Tinh toan 
		double tong = a+b;
		System.out.print("Tổng là: ");
		System.out.print(tong);
	}

}
