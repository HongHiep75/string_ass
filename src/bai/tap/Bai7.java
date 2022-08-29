package bai.tap;

import java.util.Scanner;

//Nhập hai xâu s1 và s2. Tìm xâu s2 trong s1. Nếu có hãy loại bỏ s2 trong s1. Chú ý: phải loại bỏ cho đến
//khi không tìm được s2 trong s1 nữa.
public class Bai7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi s1");
		String chuoiS1 = sc.nextLine();
		System.out.println("Nhập chuỗi s2");
		String chuoiS2 = sc.nextLine();
		if(chuoiS1.indexOf(chuoiS2) < 0) {
			System.out.println("Trong s1 khong co s2");
		}else {
			System.out.println(chuoiS1.replaceAll(chuoiS2, ""));
		}
		
	}
}
