package Class;
import java.util.Scanner;
public class CBGV extends Nguoi {
	private double luongCung_336;
	private double thuong_336;
	private double phat_336;
	private double luongThucLinh_336;
	public CBGV() {
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap luong cung: ");
		luongCung_336 = sc.nextDouble();
		sc.nextLine();
		System.out.print("\tNhap thuong: ");
		thuong_336 = sc.nextDouble();
		sc.nextLine();
		System.out.print("\tNhap phat: ");
		phat_336 = sc.nextDouble();
		sc.nextLine();
		luongThucLinh_336 = luongCung_336 + thuong_336 - phat_336;
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tLuong cung: " + luongCung_336);
		System.out.println("\tThuong: " + thuong_336);
		System.out.println("\tPhat: " + phat_336);
		System.out.println("\tLuong thuc linh: " + luongThucLinh_336);
	}
	public double getLuongThucLinh() {
		return luongThucLinh_336;
	}
}
