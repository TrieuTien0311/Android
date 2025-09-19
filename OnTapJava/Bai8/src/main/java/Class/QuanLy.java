package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLy {
	private ArrayList<CBGV> ds_336;
	public QuanLy() {
		ds_336 = new ArrayList<CBGV>(10);
	}
	public void themCBGV(CBGV canBo_336) {
		ds_336.add(canBo_336);
	}
	public void nhapDanhSach(Scanner sc) {
		CBGV canBo_336;
		System.out.print("Nhap vao so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("Can bo thu " + (i + 1) + " la:");
			canBo_336 = new CBGV();
			canBo_336.nhapThongTin(sc);
			themCBGV(canBo_336);
		}
	}
	public void hienThiDanhSach() {
		for (CBGV cb : ds_336) {
			cb.hienThiThongTin();
		}
	}
	public void timKiem(double luong_336) {
		for (CBGV cb : ds_336) {
			if (cb.getLuongThucLinh() >= luong_336) {
				cb.hienThiThongTin();
			}
		}
	}
}
