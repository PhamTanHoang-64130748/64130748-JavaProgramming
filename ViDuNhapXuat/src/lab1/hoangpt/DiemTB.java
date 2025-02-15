package lab1.hoangpt;

import java.util.Scanner;

public class DiemTB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In ra một dòng tiêu đề App
		System.out.println("Diem TB");
		// Chuẩn bị cho việc nhập
		Scanner Banphim = new Scanner(System.in);
		// In dòng mời nhập A
		System.out.print("Mời nhập họ tên sinh viên: ");
        String a = Banphim.nextLine();
		System.out.print("mời nhập điểm trung bình:");
		double b = Banphim.nextDouble();
		//Xuat thong tin
		System.out.print("\nHọ tên sinh viên: ");
		System.out.println(a);
        System.out.print("Điểm trung bình: ");
        System.out.println(b);
	}

}
