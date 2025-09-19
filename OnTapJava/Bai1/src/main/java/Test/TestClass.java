package Test;
import Class.PhanSo;
import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        PhanSo ps1_336=new PhanSo();
        PhanSo ps2_336=new PhanSo();
        PhanSo psTong_336= new PhanSo();
        System.out.println("Nhap phan so thu nhat: ");
        ps1_336.nhapPS(sc);
        System.out.println("Nhap phan so thu hai: ");
        ps2_336.nhapPS(sc);
        psTong_336=ps1_336.congPS(ps2_336);
        System.out.print("Phan so thu nhat: ");
        ps1_336.hienthiPS();
        System.out.print("Phan so thu hai: ");
        ps2_336.hienthiPS();
        System.out.print("Phan so tong chua rut gon: ");
        psTong_336.hienthiPS();
        System.out.print("Phan so tong khi da rut gon: ");
        psTong_336=psTong_336.toiGianPS(psTong_336);
        if (psTong_336.getMauSo_336()==1)
            System.out.println(psTong_336.getTuSo_336());
        else
            psTong_336.hienthiPS();
        sc.close();
    }
}
