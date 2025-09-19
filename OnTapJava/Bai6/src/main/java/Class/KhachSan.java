package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class KhachSan {
	private ArrayList<KhachTro> ds_336;
	public KhachSan() {
		ds_336 = new ArrayList<KhachTro>(10);
	}
	public void themKhachTro(KhachTro kt) {
		ds_336.add(kt);
	}
	public void nhapDanhSach(Scanner sc) {
		KhachTro khach_336;
		System.out.print("Nhap vao so luong khach: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao thong tin khach tro:");
		for (int i = 0; i < n; i++) {
			System.out.println("Khach tro thu " + (i + 1) + " la:");
			khach_336 = new KhachTro();
			khach_336.nhapThongTin(sc);
			themKhachTro(khach_336);
		}
	}
	public void hienThiDanhSach() {
		for (KhachTro khach_336 : ds_336) {
			khach_336.hienThiThongTin();
		}
	}
	public double tinhTien(int CMND_336) {
		double tien = 0;

		for (KhachTro khach_336 : ds_336) {
			if (khach_336.getCMND() == CMND_336) {
				tien = khach_336.getSoNgayTro() 
                                        * khach_336.getGiaPhong();
			}
		}
		return tien;
	}
}
