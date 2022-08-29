package bai.tap;

import java.util.Scanner;

//Viết chương trình thực hiện nhập một xâu ký tự và tìm từ dài nhất trong xâu đó. Từ đó xuất hiện ở vị trí
//nào? (Chú ý. nếu có nhiều từ có độ dài giống nhau thì chọn từ đầu tiên tìm thấy).
public class Bai4 {
	public static void main(String[] args) {
        System.out.println("Nhập xâu ký tự: ");
		Scanner sc = new Scanner(System.in);
		String chuoiS = sc.nextLine().trim();
		while(chuoiS.indexOf("  ") > 0) {
			chuoiS = chuoiS.replaceAll("  ", " ");
		}
		System.out.println("Từ dài nhất là từ thứ: " + timTuDaiNhat(chuoiS));
	}

	private static int timTuDaiNhat(String chuoiS) {
		
		String[] mangS = chuoiS.split(" ");
		int n = mangS.length;
		int max = mangS[0].length();
		int viTri = 0;
		int giaTri;
		for (int i = 1; i < mangS.length; i++) {
			giaTri = mangS[i].length();
			if(giaTri > max) {
				max = giaTri;
				viTri = i;
			}
		}
		return viTri;
	}
}
