package bai.tap;

import java.util.Scanner;
import java.util.StringTokenizer;

//.Viết chương trình thực hiện nhập một xâu họ tên theo cấu trúc: họ...đệm...tên; chuyển xâu đó sang biểu
//diễn theo cấu trúc tên...họ...đệm.

public class Bai5 {
	public static void main(String[] args) {
		System.out.println("Nhập xâu ký tự: ");
		Scanner sc = new Scanner(System.in);
		String chuoiS = sc.nextLine().trim();
		StringTokenizer st = new StringTokenizer(chuoiS, ".", false);
		StringBuilder builder = new StringBuilder();
		int count = st.countTokens();
		String[] mangS = new String[count];
		for (int i = 0; i < count; i++) {
			mangS[i] = st.nextToken();
		}
		System.out.println(chuyenChuoi(mangS));

	}

	private static String chuyenChuoi(String[] mangS) {

		int n = mangS.length;
		StringBuilder builder = new StringBuilder();
		builder.append(mangS[n - 1]);
		builder.append("...");
		builder.append(mangS[0]);
		builder.append("...");

		for (int i = 1; i < n - 1; i++) {
			builder.append(mangS[i]);
			if (i != n - 2) {
				builder.append("...");
			}

		}

		return builder.toString();
	}
}
