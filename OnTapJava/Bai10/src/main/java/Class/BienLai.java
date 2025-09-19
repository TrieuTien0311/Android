package Class;
import java.util.Scanner;
public class BienLai extends KhachHang {
	private int chiSoMoi_336;
	private int chiSoCu_336;
	private double tien_336;
	public BienLai() {
	}
	public BienLai(int chiSoMoi_336, int chiSoCu_336, double tien_336) {
		this.chiSoMoi_336 = chiSoMoi_336;
		this.chiSoCu_336 = chiSoCu_336;
		this.tien_336= tien_336;
	}
	public BienLai(String tenChuHo_336, int chiSoMoi_336, 
                int chiSoCu_336, double tien_336) {
		this.tenChuHo_336 = tenChuHo_336;
		this.chiSoMoi_336 = chiSoMoi_336;
		this.chiSoCu_336 = chiSoCu_336;
		this.tien_336 = tien_336;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi_336 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu_336 = sc.nextInt();
		sc.nextLine();
		tien_336 = (chiSoMoi_336 - chiSoCu_336) * 750;
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi_336);
		System.out.println("\tChi so cu: " + chiSoCu_336);
		System.out.println("\tTien: : " + tien_336);
	}
}
