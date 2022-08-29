package bai.tap;
// Sử dụng xâu ký tự để viết hàm kiểm tra số thuận nghịch. Áp dụng liệt kê các số thuận nghịch có 6 chữ số.

public class Bai1 {
	public static void main(String[] args) {
		soNghichThuan();
	}

	public static void soNghichThuan() {
		System.out.println("Số nhịch đảo: ");
		for (int i = 100; i < 1000; i++) {
			System.out.println(i + nghichDaoSo(i));
		}
	}

	public static String nghichDaoSo(int n) {
		String dapAn = "";
		String chuoiN = n + "";
		int lengt = chuoiN.length();
		for (int i = lengt - 1; i >= 0; i--) {
			dapAn += chuoiN.charAt(i);
		}
		return dapAn;
	}
}
