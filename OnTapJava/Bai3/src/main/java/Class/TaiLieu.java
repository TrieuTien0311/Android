package Class;
import java.util.Scanner;
public class TaiLieu {
	private String maTaiLieu_336;
	private String tenNXB_336;
	private int soBanPhatHanh_336;
	public TaiLieu() {
	}
	public TaiLieu(String maTaiLieu_336, String tenNXB_336, 
                int soBanPhatHanh_336) {
		this.maTaiLieu_336 = maTaiLieu_336;
		this.tenNXB_336 = tenNXB_336;
		this.soBanPhatHanh_336 = soBanPhatHanh_336;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu_336 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB_336 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh_336 = sc.nextInt();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu_336);
		System.out.println("\tTen nha xuat ban: " + tenNXB_336);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh_336);
	}
	public String getMaTaiLieu() {
		return maTaiLieu_336;
	}
}

