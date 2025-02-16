package lab1.hoangpt;

import java.util.Scanner;

public class PTBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner Banphim = new Scanner(System.in);
	        // Nhập hệ số a, b, c
	        System.out.print("Nhập hệ số a: ");
	        double a = Banphim.nextDouble();
	        System.out.print("Nhập hệ số b: ");
	        double b = Banphim.nextDouble();
	        System.out.print("Nhập hệ số c: ");
	        double c = Banphim.nextDouble();
	        // Tính delta
	        double delta = b * b - 4 * a * c;
	        // Xuất kết quả delta
	        System.out.print("Giá trị delta: ");
	        System.out.println(delta);
	        //Giai Pt bậc 2
	        if (delta >= 0) {
	        	//Tính căn delta
	         double canDelta = Math.sqrt(delta);
	         //Xuất căn delta
	            System.out.print("Căn delta: ");
	            System.out.println(canDelta);
	            // Trường hợp 1: Delta lớn hơn 0 cho được 2 nghiệm
	            if(delta > 0) {
	            	  double x1 = (-b + canDelta)/(2*a);
	      	        System.out.print("Giá trị x1: ");
	      	        System.out.println(x1);
	      	      double x2 = (-b - canDelta)/(2*a);
	      	        System.out.print("Giá trị x2: ");
	      	        System.out.println(x2);
	            }
	            //Trường hợp: Delta = 0 cho nghiệm kép
	            else {
	            	double x = -b/(2*a);
	      	        System.out.print("Phương trình có nghiệm: ");
	      	        System.out.println(x);
	            }
	            // Trường hợp 3 : Delta âm pt vô nghiệm
	        } else {
	            System.out.println("Delta âm, phương trình không có nghiệm thực.");
	        }
	}
}
