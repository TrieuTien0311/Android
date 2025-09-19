/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BienLaiTienDien;

import java.util.Scanner;

public class BienLai extends KhachHang {
	private int chiSoMoi_349;
	private int chiSoCu_349;
	private double tien_349;

	public BienLai() {

	}
	public BienLai(int chiSoMoi, int chiSoCu, double tien) {
		this.chiSoMoi_349 = chiSoMoi;
		this.chiSoCu_349 = chiSoCu;
		this.tien_349 = tien;
	}
	public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
		this.tenChuHo_349 = tenChuHo;
		this.chiSoMoi_349 = chiSoMoi;
		this.chiSoCu_349 = chiSoCu;
		this.tien_349 = tien;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi_349 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu_349 = sc.nextInt();
		sc.nextLine();
		tien_349 = (chiSoMoi_349 - chiSoCu_349) * 750;
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi_349);
		System.out.println("\tChi so cu: " + chiSoCu_349);
		System.out.println("\tTien: : " + tien_349);
	}
}
