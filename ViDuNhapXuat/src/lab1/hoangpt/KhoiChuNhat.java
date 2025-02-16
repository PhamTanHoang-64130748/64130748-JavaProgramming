package lab1.hoangpt;

import java.util.Scanner;

public class KhoiChuNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CT tính thể tích hình khối chữ nhật");
		Scanner Banphim = new Scanner(System.in);
		// Nhập độ dài các cạnh hình khối chữ nhật
		//Chiều dài
		System.out.print("mời nhập chiều dài: ");
		double a = Banphim.nextDouble();
		//Chiều rộng
		System.out.print("mời nhập chiều rộng: ");
		double b = Banphim.nextDouble();
		//Chiều cao
		System.out.print("mời nhập chiều cao: ");
		double h = Banphim.nextDouble();
		// Tính thể tích hình hộp chữ nhật
		double the_tich = a * b * h;
		System.out.print("Thể tích hình khối chữ nhật: ");
		System.out.println(the_tich);
	}

}
