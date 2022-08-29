package bai.tap;

import java.util.Iterator;
import java.util.Scanner;

//Viết chương trình nhập vào một xâu ký tự s bất kỳ, sau đó chuyển sang dạng xen kẽ chữ in hoa và chữ
//in thường. Ví dụ s = ABCDefgh thì kết quả là AbCdEfGh
public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập chuỗi s");
		String chuoiS = sc.next();
		System.out.println(taoChuoiXenKe(chuoiS));
	}

	private static String taoChuoiXenKe(String chuoiS) {
		char kyTuDau = chuoiS.charAt(0);
		String[] mangS = chuoiS.split("");
		int n = mangS.length;
		StringBuilder builder = new StringBuilder();
		int chanLe;
		if (kyTuDau > 96) {
			chanLe = 1;
		} else {
			chanLe = 0;
		}
		builder.append(kyTuDau);
		for (int i = 1; i < n; i++) {
			if (i % 2 == chanLe) {
				builder.append(mangS[i].toUpperCase());
			} else {
				builder.append(mangS[i].toLowerCase());
			}
		}
		return builder.toString();
	}
}
