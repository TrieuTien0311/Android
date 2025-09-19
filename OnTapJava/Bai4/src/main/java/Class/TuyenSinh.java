package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class TuyenSinh {
	private ArrayList<ThiSinh> dsts_336;
	public TuyenSinh() {
		dsts_336 = new ArrayList<ThiSinh>(10);
	}
	public void themThiSinh(ThiSinh ts_336) {
		dsts_336.add(ts_336);
	}
	public void nhapDanhSach(Scanner sc) {
		ThiSinh ts_336;
		int chon_336;
		System.out.print("Nhap vao so luong thi sinh: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thuoc khoi nao "
                                + "(1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon_336 = sc.nextInt();
			switch (chon_336) {
			case 1:
				ts_336 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			case 2:
				ts_336 = new KhoiB("Toan", "Hoa", "Sinh");
				break;
			case 3:
				ts_336 = new KhoiC("Van", "Su", "Dia");
				break;
			default:
				ts_336 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			}
			ts_336.nhapThongTin(sc);
			themThiSinh(ts_336);
		}
	}
	public void hienThiDanhSach() {
		int n = dsts_336.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu " + (i + 1) + " la:");
			dsts_336.get(i).hienThiThongTin();
		}
	}
	public void timKiemThiSinh(int soBaoDanh_336) {
		for (ThiSinh ts_336 : dsts_336) {
			if (ts_336.getSoBD() == soBaoDanh_336) {
				ts_336.hienThiThongTin();
			}
		}
	}
}
