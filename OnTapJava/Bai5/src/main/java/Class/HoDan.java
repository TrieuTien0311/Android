package Class;
import java.util.Date;
import java.util.Scanner;
public class HoDan extends Nguoi 
{
	private int soNguoi_336;
	private int soNha_336;
	private Nguoi[] list_336;
	public HoDan() {
		list_336 = new Nguoi[10];
	}
	public HoDan(String hoTen_336, Date ngaySinh_336, String ngheNghiep_336,
                int soNguoi_336, int soNha_336) {
		super(hoTen_336, ngaySinh_336, ngheNghiep_336);
		this.soNguoi_336 = soNguoi_336;
		this.soNha_336 = soNha_336;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi_336 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_336 = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i = 0; i < soNguoi_336; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list_336[i] = new Nguoi();
			list_336[i].nhapThongTin(sc);
		}
	}
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi_336);
		System.out.println("\tSo nha: " + soNha_336);
		System.out.println("\tThong tin cua tung nguoi "
                        + "trong gia dinh:");
		for (int i = 0; i < soNguoi_336; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list_336[i].hienThiThongTin();
		}
	}
	public Nguoi[] getList() {
		return list_336;
	}
	public int getSoNguoi() {
		return soNguoi_336;
	}
}
