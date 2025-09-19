package Class;
import java.util.Scanner;
public class Bao extends TaiLieu {
	private String ngayPhatHanh_336;
	public Bao() {
	}
	public Bao(String maTaiLieu_336, String tenNXB_336, 
                int soBanPhatHanh_336, String ngayPhatHanh_336) {
		super(maTaiLieu_336, tenNXB_336, soBanPhatHanh_336);
		this.ngayPhatHanh_336 = ngayPhatHanh_336;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh_336 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh_336);
	}
}

