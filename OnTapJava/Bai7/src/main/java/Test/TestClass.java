package Test;
import java.util.Scanner;
import Class.QLHS;
public class TestClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		QLHS list_336=new QLHS();
		list_336.nhapDanhSachHS(sc);
		System.out.print("Nhung hoc sinh sinh nam 1985 "
                        + "va que Thai Nguyen la:");
		list_336.timKiemThongTin(1985, "Thai Nguyen");
		System.out.println("Nhung hoc sinh hoc lop 10A1 la:");
		list_336.timKiemThongTin("10A1");
		sc.close();
	}
}
