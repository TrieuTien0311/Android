/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BienLaiTienDien;

import java.util.Scanner;

public class KhachHang {
	protected String tenChuHo_349;
	protected int soNha_349;
	protected String maCongTo_349;

	public KhachHang() {

	}
	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo_349 = tenChuHo;
		this.soNha_349 = soNha;
		this.maCongTo_349 = maCongTo;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo_349 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_349 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo_349 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo_349);
		System.out.println("\tSo nha: " + soNha_349);
		System.out.println("\tMa cong to: " + maCongTo_349);
	}
}
