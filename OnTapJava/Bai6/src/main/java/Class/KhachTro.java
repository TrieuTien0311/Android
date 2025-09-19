package Class;
import java.util.Scanner;
public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro_336;
	private String loaiPhong_336;
	private double giaPhong_336;
	public KhachTro() {
	}
	public KhachTro(String hoTen_336, int CMND_336, int soNgayTro_336, 
                String loaiPhong_336, double giaPhong_336) {
		this.hoTen_336 = hoTen_336;
		this.CMND_336 = CMND_336;
		this.soNgayTro_336 = soNgayTro_336;
		this.loaiPhong_336 = loaiPhong_336;
		this.giaPhong_336 = giaPhong_336;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so ngay tro: ");
		soNgayTro_336 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong_336 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong_336 = sc.nextDouble();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo ngay tro: " + soNgayTro_336);
		System.out.println("\tLoai phong: " + loaiPhong_336);
		System.out.println("\tGia phong: " + giaPhong_336);
	}
	public int getSoNgayTro() {
		return soNgayTro_336;
	}
	public double getGiaPhong() {
		return giaPhong_336;
	}
}
