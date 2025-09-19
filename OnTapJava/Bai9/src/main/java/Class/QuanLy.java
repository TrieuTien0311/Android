package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLy {
	private ArrayList<TheMuon> ds_336;
	public QuanLy() {
		ds_336 = new ArrayList<TheMuon>(10);
	}
	public void themTheMuon(TheMuon theMuon_336) {
		ds_336.add(theMuon_336);
	}
	public void nhapDanhSach(Scanner sc) {
		TheMuon theMuon_336;
		System.out.print("Nhap vao so luong the muon: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("The muon thu " + (i + 1) + " la:");
			theMuon_336 = new TheMuon();
			theMuon_336.nhapThongTin(sc);
			themTheMuon(theMuon_336);
		}
	}
	public void hienThiDanhSachTraCuoiThang() {
		for (TheMuon the : ds_336) {
			if (the.getHanTra().getDate() == 31 || 
                                the.getHanTra().getDate() == 30) 
                        {
				the.hienThiThongTin();
			}
		}
	}
}
