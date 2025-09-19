package Class;
import java.util.Scanner;
public class TapChi extends TaiLieu {
	private int soPhatHanh_336;
	private int thangPhatHanh_336;
	public TapChi() {
	}
	public TapChi(String maTaiLieu_336, String tenNXB_336,
                int soBanPhatHanh_336, int soPhatHanh_336,int thangPhatHanh_336) 
        {
		super(maTaiLieu_336, tenNXB_336, soBanPhatHanh_336);
		this.soPhatHanh_336 = soPhatHanh_336;
		this.thangPhatHanh_336 = thangPhatHanh_336;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh_336 = sc.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh_336 = sc.nextInt();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh_336);
		System.out.println("\tThang phat hanh: " + thangPhatHanh_336);
	}
}
