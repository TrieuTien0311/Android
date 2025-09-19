package Test;
import java.util.Scanner;
import Class.TuyenSinh;
public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TuyenSinh dsTuyenSinh_336 = new TuyenSinh();
		System.out.println("Nhap vao danh sach thi sinh: ");
		dsTuyenSinh_336.nhapDanhSach(sc);
		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh_336.hienThiDanhSach();
		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh_336 = sc.nextInt();
		sc.nextLine();
		dsTuyenSinh_336.timKiemThiSinh(soBaoDanh_336);
		sc.close();
	}
}
