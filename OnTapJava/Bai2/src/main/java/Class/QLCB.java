package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class QLCB {
	private ArrayList<CanBo> dscb_336;
	public QLCB() {
		dscb_336 = new ArrayList<CanBo>(10);
	}
	public void themCanBo(CanBo cb_336) {
		dscb_336.add(cb_336);
	}
	public void nhapDanhSach(Scanner sc) {
		CanBo cb_336;
		System.out.print("Nhap vao so luong can bo: ");
		int n_336 = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap thong tin chi tiet:");
		for (int i = 0; i < n_336; i++) {
			System.out.println("Lan nhap thu " + (i + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien;"
                                + "3-CongNhan): ");
			int chon = sc.nextInt();
			sc.nextLine();
			cb_336 = new CanBo();
			switch (chon) {
			case 1:
				cb_336 = new KySu();
				break;
			case 2:
				cb_336 = new NhanVien();
				break;
			case 3:
				cb_336 = new CongNhan();
				break;

			default:
				cb_336 = new KySu();
				break;
			}
			cb_336.nhapThongTin(sc);
			themCanBo(cb_336);
		}
	}
	public void timKiemCanBo(String hoTen) {
		for (CanBo cb_336 : dscb_336) {
			if (hoTen.equals(cb_336.getHoTen())) {
				cb_336.hienThiThongTin();
			}
		}
	}
}

