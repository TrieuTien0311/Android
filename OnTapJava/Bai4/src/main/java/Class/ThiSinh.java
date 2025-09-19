package Class;
import java.util.Scanner;
public class ThiSinh {
	private int soBD_336;
	private String hoTen_336;
	private String diaChi_336;
	private String dienUuTien_336;
	public ThiSinh() 
        {
        }
	public ThiSinh(int soBD_336, String hoTen_336, String diaChi_336, 
                String dienUuTien_336) {
		this.soBD_336 = soBD_336;
		this.hoTen_336 = hoTen_336;
		this.diaChi_336 = diaChi_336;
		this.dienUuTien_336 = dienUuTien_336;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD_336 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen_336 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_336 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien_336 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD_336);
		System.out.println("\tHo ten: " + hoTen_336);
		System.out.println("\tDia chi: " + diaChi_336);
		System.out.println("\tDien uu tien: " + dienUuTien_336);
	}
	public int getSoBD() {
		return soBD_336;
	}
}
