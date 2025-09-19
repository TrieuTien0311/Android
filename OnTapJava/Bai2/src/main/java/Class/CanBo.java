package Class;
import java.util.Scanner;
public class CanBo {
	private String hoTen_336;
	private String ngaySinh_336;
	private String gioiTinh_336;
	private String diaChi_336;
	public CanBo() {
	}
	public CanBo(String hoten, String ngaySinh_336, String gioiTinh_336, 
                String diaChi_336) 
        {
		this.hoTen_336 = hoten;
		this.ngaySinh_336 = ngaySinh_336;
		this.gioiTinh_336 = gioiTinh_336;
		this.diaChi_336 = diaChi_336;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_336 = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh_336 = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh_336 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_336 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_336);
		System.out.println("\tNgay sinh: " + ngaySinh_336);
		System.out.println("\tGioi tinh: " + gioiTinh_336);
		System.out.println("\tDia chi: " + diaChi_336);
	}
	public String getHoTen() {
		return this.hoTen_336;
	}
}
