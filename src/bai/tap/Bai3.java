package bai.tap;

import java.util.Scanner;

//3. Viết chương trình thực hiện chuẩn hoá một xâu ký tự nhập từ bàn phím (loại bỏ các dấu cách thừa, chuyển
//ký tự đầu mỗi từ thành chữ hoa, các ký tự khác thành chữ thường)
public class Bai3 {
	public static void main(String[] args) {
		System.out.println("Nhập chuỗi s");
		Scanner sc = new Scanner(System.in);
		String chuoiS = sc.nextLine().trim();
		System.out.println(chuanHoaXauKyTu(chuoiS));
	}

	private static String chuanHoaXauKyTu(String chuoiS) {
		while(chuoiS.indexOf("  ") > 0) {
			chuoiS = chuoiS.replaceAll("  ", " ");
		}
		chuoiS = chuoiS.replaceAll("  ", " ");
		String[] mangS = chuoiS.split(" ");
		int n = mangS.length;
		StringBuilder builder = new StringBuilder();
		String giaTri;
		for (int i = 0; i < n; i++) {
			giaTri = mangS[i];
			// kiểm tra ký tự đầu phải in hoa không nếu không chuyển về in hoa
			if (giaTri.charAt(0) > 96) {
				char newChar = (char) (giaTri.charAt(0) - 32);
				char old = giaTri.charAt(0);
				giaTri = giaTri.replace(old, newChar);
			}
			builder.append(giaTri);
			builder.append(" ");
		}
		return builder.toString();
	}
}
