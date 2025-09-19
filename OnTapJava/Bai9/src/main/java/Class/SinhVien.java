package Class;
import java.util.Scanner;
public class SinhVien {
	protected String hoTen_336;
	protected String maSV_336;
	protected String ngaySinh_336;
	protected String lop_336;
	public SinhVien() {
	}
	public SinhVien(String hoTen_336, String maSV_336, 
                String ngaySinh_336, String lop_336) 
        {
		this.hoTen_336 = hoTen_336;
		this.maSV_336 = maSV_336;
		this.ngaySinh_336 = ngaySinh_336;
		this.lop_336 = lop_336;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_336 = sc.nextLine();
		System.out.print("\tNhap ma sinh vien: ");
		maSV_336 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh_336 = sc.nextLine();
		System.out.print("\tNhap lop: ");
		lop_336 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_336);
		System.out.println("\tNgay sinh: " + ngaySinh_336);
		System.out.println("\tMa sinh vien: " + maSV_336);
		System.out.println("\tLop: " + lop_336);
	}
}
