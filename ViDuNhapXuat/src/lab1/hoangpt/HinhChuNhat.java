package lab1.hoangpt;

import java.util.Scanner;

public class HinhChuNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CT tính chu vi và diện tích hình chữ nhật\n");
		// Chuẩn bị cho việc nhập
		Scanner Banphim = new Scanner(System.in);
		// In dòng mời nhập chiều dài
		System.out.print("mời nhập chiều dài: ");
		// In dòng mời nhập chiều rộng
		double a = Banphim.nextDouble();
		System.out.print("mời nhập chiều rộng: ");
		double b = Banphim.nextDouble();
		// Tinh toan 
		double  chu_vi= (a+b)*2;
		double 	dien_tich = a*b;
		System.out.print("Chu vi hình chữ nhật là: ");
		System.out.println(chu_vi);
		System.out.print("Diện tích hình chữ nhật là: ");
		System.out.print(dien_tich);
	}

}
