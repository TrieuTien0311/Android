package Test;
import java.util.Scanner;
import Class.KhuPho;
public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KhuPho qlkp_336 = new KhuPho();
		qlkp_336.nhapDanhSach(sc);
		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp_336.timKiemThongTin();
	}

}
