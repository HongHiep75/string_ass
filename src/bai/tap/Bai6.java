package bai.tap;

import java.util.Scanner;
import java.util.StringTokenizer;


//Nhập một câu không quá 20 từ, mỗi từ không quá 10 ký tự. Viết chương trình tách các từ trong câu và
//in các từ theo thứ tự Alphabet.
public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		boolean check;
		String chuoiKyTu[] = null;
		StringBuilder builder = null;
		// kiem tra một câu không quá 20 từ, mỗi từ không quá 10 ký tự
		do {
			check = false;
			System.out.println("Nhập xâu ký tự: ");

			String chuoiS = sc.nextLine().trim();
			st = new StringTokenizer(chuoiS, " ");
			// so tu co trong cau
			int count = st.countTokens();
			if (count > 20) {
				System.out.println("Không được nhập hơn 20 từ");
				check = true;
				continue;
			}
			chuoiKyTu = new String[st.countTokens()];
			int index = 0;
			builder = new StringBuilder();
			String saoChep;
			while (st.hasMoreTokens()) {
				saoChep = st.nextToken();
				if (saoChep.length() > 10) {
					System.out.println("Không được nhập từ có hơn 10 ký tự");
					check = true;
					break;
				}
				chuoiKyTu[index] = saoChep;
				index++;
				
			}
		} while (check);
		int n = chuoiKyTu.length;
		sapXepMang(chuoiKyTu, n);
		
		for (int i = 0; i < chuoiKyTu.length; i++) {
			System.out.println(chuoiKyTu[i]);
		}
	}

	private static void sapXepMang(String[] chuoiKyTu, int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (chuoiKyTu[i]
						.compareTo(chuoiKyTu[j]) > 0) {
					String temp = chuoiKyTu[i];
					chuoiKyTu[i] = chuoiKyTu[j];
					chuoiKyTu[j] = temp;
				}
			}
		}
	}
}
