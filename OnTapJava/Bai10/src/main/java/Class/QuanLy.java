package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLy {
	private ArrayList<BienLai> ds_336;
        public QuanLy() {
		ds_336 = new ArrayList<BienLai>(10);
	}
	public void themBienLai(BienLai bienLai_336) {
		ds_336.add(bienLai_336);
	}
	public void nhapDanhSach(Scanner sc) {
		BienLai bienLai_336;
		System.out.print("Nhap vao so luong bien lai: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao danh sach bien lai:");
		for (int i = 0; i < n; i++) {
			System.out.println("Bien lai thu " + (i + 1) + " la:");
			bienLai_336 = new BienLai();
			bienLai_336.nhapThongTin(sc);
			themBienLai(bienLai_336);
		}
	}
	public void hienThiDanhSach() {
		for (int i = 0; i < ds_336.size(); i++) {
			System.out.println("Bien lai thu " + (i + 1) + " la:");
			ds_336.get(i).hienThiThongTin();
			System.out.println();
		}
	}
}
