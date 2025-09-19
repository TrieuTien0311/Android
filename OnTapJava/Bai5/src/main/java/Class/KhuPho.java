package Class;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class KhuPho {
	private ArrayList<HoDan> dshd_336;
	public KhuPho() {
		dshd_336 = new ArrayList<HoDan>(10);
	}
	public void themHoDan(HoDan hoDan_336) {
		dshd_336.add(hoDan_336);
	}
	public void nhapDanhSach(Scanner sc) {
		HoDan hoDan_336;
		System.out.print("Nhap vao so ho dan: ");
		int soHoDan_336 = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i = 0; i < soHoDan_336; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			hoDan_336 = new HoDan();
			hoDan_336.nhapThongTin(sc);
			themHoDan(hoDan_336);
		}
	}
	public void hienThiDanhSach() {
		int n = dshd_336.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			dshd_336.get(i).hienThiThongTin();
		}
	}
	public void timKiemThongTin() {
		Date now = new Date();
		int namHienTai = now.getYear() + 1900;
		Nguoi[] dstv = null;
		for (HoDan hoDan_336 : dshd_336) {
			dstv = hoDan_336.getList();
			for (int i = 0; i < hoDan_336.getSoNguoi(); i++) {
				if (namHienTai - (dstv[i].getNgaySinh().getYear()
                                        + 1900) == 80) {
					hoDan_336.hienThiThongTin();
				}
			}
		}
	}
}
