package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class QLHS {
	private ArrayList<HocSinh> dshs_336;
	public QLHS() {
		dshs_336 = new ArrayList<HocSinh>(10);
	}
	public void themHS(HocSinh hs_336) {
		dshs_336.add(hs_336);
	}
	public void nhapDanhSachHS(Scanner sc) {
		HocSinh hs_336;
		System.out.print("Nhap vao so luong hoc sinh: ");
		int n = sc.nextInt();
		System.out.println("Nhap thong tin cho "
                        + "hoc sinh trong danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("\tHoc sinh thu " 
                                + (i + 1) + " la:");
			hs_336 = new HocSinh();
			hs_336.nhapThongTin(sc);
			themHS(hs_336);
		}
	}
	public void hienThiDanhSach() {
		int n = dshs_336.size();
		for (int i = 0; i < n; i++) {
			System.out.println("\tHoc sinh thu " + (i+ 1) + " la:");
			dshs_336.get(i).hienThiThongTin();
		}
	}
	public void timKiemThongTin(int nam_336, String que_336) {
		for (HocSinh hs_336 : dshs_336) {
			if ((hs_336.getNgaySinh().getYear() + 1900 == nam_336) 
                                && (que_336.equals(hs_336.getQueQuan()))) {
				hs_336.hienThiThongTin();
			}
		}
	}
	public void timKiemThongTin(String lop_336) {
		for (HocSinh hs_336 : dshs_336) {
			if (lop_336.equals(hs_336.getLop())) {
				hs_336.hienThiThongTin();
			}
		}
	}
}
