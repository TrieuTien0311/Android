package Class;
import java.util.Scanner;
public class Nguoi {
	protected String hoTen_336;
	protected String ngaySinh_336;
	protected String queQuan_336;
	public Nguoi() {
	}
	public Nguoi(String hoTen_336, String ngaySinh_336, String queQuan_336) 
        {
		this.hoTen_336 = hoTen_336;
		this.ngaySinh_336 = ngaySinh_336;
		this.queQuan_336 = queQuan_336;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_336 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh_336 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan_336 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_336);
		System.out.println("\tNgay sinh: " + ngaySinh_336);
		System.out.println("\tQue quan: " + queQuan_336);
	}
}
