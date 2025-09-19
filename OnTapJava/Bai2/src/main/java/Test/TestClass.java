package Test;
import java.util.Scanner;
import Class.QLCB;
public class TestClass 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QLCB qlcb_336 = new QLCB();
		qlcb_336.nhapDanhSach(sc);
		System.out.print("Nhap vao ho ten can tim kiem: ");
		String name_336 = sc.nextLine();
		qlcb_336.timKiemCanBo(name_336);
		sc.close();
	}

}
