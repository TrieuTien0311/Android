package Class;
import java.util.Scanner;
public class KhoiA extends ThiSinh {
	private String mon1_336;
	private String mon2_336;
	private String mon3_336;
	public KhoiA() {

	}
	public KhoiA(String mon1_336, String mon2_336, String mon3_336) {
		this.mon1_336 = mon1_336;
		this.mon2_336 = mon2_336;
		this.mon3_336 = mon3_336;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1_336 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2_336 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3_336 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1_336 +
                        " - " + mon2_336 + " - " + mon3_336);
	}
}

