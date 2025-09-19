/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai10_bienlaitiendien;

import BienLaiTienDien.QuanLy;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bai10_BienLaiTienDien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		QuanLy ql = new QuanLy();
		ql.nhapDanhSach(sc);
		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql.hienThiDanhSach();
		sc.close();
    }   
}
