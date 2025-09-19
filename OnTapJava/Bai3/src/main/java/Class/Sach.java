package Class;
import java.util.Scanner;
public class Sach extends TaiLieu {
	private String tacGia_336;
	private int soTrang_336;
	public Sach() {
	}
	public Sach(String maTaiLieu_336, String tenNXB_336, 
                int soBanPhatHanh_336, String tacGia_336, int soTrang_336) {
		super(maTaiLieu_336, tenNXB_336, soBanPhatHanh_336);
		this.tacGia_336 = tacGia_336;
		this.soTrang_336 = soTrang_336;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia_336 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang_336 = sc.nextInt();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia_336);
		System.out.println("\tSo trang: " + soTrang_336);
	}
}

