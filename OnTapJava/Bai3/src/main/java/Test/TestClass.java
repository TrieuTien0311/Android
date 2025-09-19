package Test;
import java.util.Scanner;
import Class.QuanLySach;
public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLySach qls_336 = new QuanLySach();
		qls_336.nhapDanhSachTL(sc);
		System.out.print("\n\nNhap vao loai tai lieu can tim: ");
		String loai_336 = sc.nextLine();
		qls_336.timLoaiTL(loai_336);
		System.out.print("\n\nNhap vao ma tai lieu can tim: ");
		String maTL_336 = sc.nextLine();
		qls_336.timMaTL(maTL_336);
		sc.close();
	}
}
