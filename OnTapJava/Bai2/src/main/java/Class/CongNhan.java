package Class;
import java.util.Scanner;
public class CongNhan extends CanBo {
	private String bac_336;
	public CongNhan() {
	}
	public CongNhan(String hoten_336, String ngaySinh_336, 
                String gioiTinh_336, String diaChi_336, String bac_336) 
        {
		super(hoten_336, ngaySinh_336, gioiTinh_336, diaChi_336);
		this.bac_336 = bac_336;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap bac: ");
		bac_336 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tBac: " + bac_336);
	}
}
