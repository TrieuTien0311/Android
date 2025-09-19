package Class;
import java.util.Scanner;
public class KhachHang {
	protected String tenChuHo_336;
	protected int soNha_336;
	protected String maCongTo_336;
	public KhachHang() {
	}
	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo_336 = tenChuHo;
		this.soNha_336 = soNha;
		this.maCongTo_336 = maCongTo;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo_336 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_336 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo_336 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo_336);
		System.out.println("\tSo nha: " + soNha_336);
		System.out.println("\tMa cong to: " + maCongTo_336);
	}
}
