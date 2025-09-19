package Test;
import java.util.Scanner;
import Class.QuanLy;
public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLy ql_336 = new QuanLy();
		ql_336.nhapDanhSach(sc);
		System.out.println("Danh sach sinh vien "
                        + "tra sach vao cuoi thang:");
		ql_336.hienThiDanhSachTraCuoiThang();
		sc.close();
	}
}
