package Test;
import java.util.Scanner;
import Class.KhachSan;
public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KhachSan ql_336 = new KhachSan();
		ql_336.nhapDanhSach(sc);
		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd_336 = sc.nextInt();
		System.out.println("==> Tong tien la: " + 
                        ql_336.tinhTien(cmnd_336));
		sc.close();
	}
}
