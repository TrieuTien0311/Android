package Test;
import Class.QuanLy;
import java.util.Scanner;
public class TestCLass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		QuanLy ql_336 = new QuanLy();
		ql_336.nhapDanhSach(sc);
		System.out.println("Danh sach bien lai cua cac "
                        + "ho gia dinh la:");
		ql_336.hienThiDanhSach();
		sc.close();
    }
}
