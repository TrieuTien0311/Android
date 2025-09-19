package Class;
import java.util.Scanner;
public class HocSinh extends Nguoi {
	private String lop_336;
	private String khoHoc_336;
	private String kyHoc_336;
	public HocSinh() {
	}
	public HocSinh(String hoTen_336, String lop_336, String khoaHoc, 
                String kyHoc_336) {
		this.hoTen_336 = hoTen_336;
		this.lop_336 = lop_336;
		this.khoHoc_336 = khoaHoc;
		this.kyHoc_336 = kyHoc_336;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap lop: ");
		lop_336 = sc.nextLine();
		System.out.print("\tNhap khoa hoc: ");
		khoHoc_336 = sc.nextLine();
		System.out.print("\tNhap ky hoc: ");
		kyHoc_336 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tLop: " + lop_336);
		System.out.println("\tKhoa hoc: " + khoHoc_336);
		System.out.println("\tKy hoc: " + kyHoc_336);
	}
	public String getLop() {
		return lop_336;
	}
}
