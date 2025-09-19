package Test;
import java.util.Scanner;
import Class.QuanLy;
public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLy ql_336 = new QuanLy();
		ql_336.nhapDanhSach(sc);
		System.out.println("Danh sach nhung can bo "
                        + "co luong >= 8 trieu la:");
		ql_336.timKiem(8000000);
		sc.close();
	}
}
