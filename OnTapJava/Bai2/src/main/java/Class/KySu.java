package Class;
import java.util.Scanner;
public class KySu extends CanBo {
	private String nganhDaoTao_336;
	public KySu() {

	}
	public KySu(String hoten_336, String ngaySinh_336, 
                String gioiTinh_336, String diaChi_336, String nganhDaoTao_336) 
        {
		super(hoten_336, ngaySinh_336, gioiTinh_336, diaChi_336);
		this.nganhDaoTao_336 = nganhDaoTao_336;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap nganh dao tao: ");
		nganhDaoTao_336 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNganh dao tao: " + nganhDaoTao_336);
	}
}
