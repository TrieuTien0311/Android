package Class;
import java.util.Scanner;
public class NhanVien extends CanBo {
	private String congViec_336;
	public NhanVien() {

	}
	public NhanVien(String hoten_336, String ngaySinh_336, 
                String gioiTinh_336, String diaChi_336, String congViec_336) 
        {
		super(hoten_336, ngaySinh_336, gioiTinh_336, diaChi_336);
		this.congViec_336 = congViec_336;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap cong viec: ");
		congViec_336 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tCong viec: " + congViec_336);
	}
}
