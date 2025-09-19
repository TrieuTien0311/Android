package Class;
import java.util.Scanner;
public class PhanSo {
    private int tuSo_336;
    private int mauSo_336;
    public int getTuSo_336() {
        return tuSo_336;
    }
    public void setTuSo_336(int tuSo_336) {
        this.tuSo_336 = tuSo_336;
    }
    public int getMauSo_336() {
        return mauSo_336;
    }
    public void setMauSo_336(int mauSo_336) {
        this.mauSo_336 = mauSo_336;
    }
    public PhanSo()
    {
        tuSo_336=0;
        mauSo_336=1;
    }
    public PhanSo(int tuSo_336, int mauSo_336) 
    {
        this.tuSo_336 = tuSo_336;
        this.mauSo_336 = mauSo_336;
    }
    public void nhapPS(Scanner sc)
    {
        int a_336,b_336;
        do
        {
            System.out.print("Nhap vao tu so: ");
            a_336=sc.nextInt();
            System.out.print("Nhap vao mau so: ");
            b_336=sc.nextInt();
            if (b_336==0)
                System.out.print("Mau so khong duoc bang 0! Moi ban nhap lai.");
            else
            {
                tuSo_336=a_336;
                mauSo_336=b_336;
            }
        }
        while (b_336==0);
    }
    public void hienthiPS()
    {
        if (tuSo_336*mauSo_336<0)
            System.out.println("-"+Math.abs(tuSo_336)+"/"+Math.abs(mauSo_336));
        else
            System.out.println(Math.abs(tuSo_336)+"/"+Math.abs(mauSo_336));
    }
    public PhanSo congPS(PhanSo ps2_336)
    {
        int a_336,b_336;
        a_336=tuSo_336*ps2_336.mauSo_336+ps2_336.tuSo_336*mauSo_336;
        b_336=mauSo_336*ps2_336.mauSo_336;
        return new PhanSo(a_336,b_336);
    }
    public PhanSo truPS(PhanSo ps2_336)
    {
        int a_336,b_336;
        a_336=tuSo_336*ps2_336.mauSo_336-ps2_336.tuSo_336*mauSo_336;
        b_336=mauSo_336*ps2_336.mauSo_336;
        return new PhanSo(a_336,b_336);
    }
    public PhanSo nhanPS(PhanSo ps2_336)
    {
        int a_336,b_336;
        a_336=tuSo_336*ps2_336.tuSo_336;
        b_336=mauSo_336*ps2_336.mauSo_336;
        return new PhanSo(a_336,b_336);
    }
    public PhanSo chiaPS(PhanSo ps2_336)
    {
        int a_336,b_336;
        a_336=tuSo_336*ps2_336.mauSo_336;
        b_336=mauSo_336*ps2_336.tuSo_336;
        return new PhanSo(a_336,b_336);
    }
    private int timUSCLN(int a_336,int b_336)
    {
        int r_336;
        while (b_336!=0)
        {
            r_336=a_336%b_336;
            a_336=b_336;
            b_336=r_336;  
        }
        return a_336;
    }
    public boolean kiemTraToiGian()
    {
        if (timUSCLN(tuSo_336,mauSo_336)==1)
            return true;
        else
            return false;
    }
    public PhanSo toiGianPS(PhanSo ps2_336)
    {
        int x_336;
        x_336=timUSCLN(tuSo_336,mauSo_336);
        tuSo_336=tuSo_336/x_336;
        mauSo_336=mauSo_336/x_336;
        return new PhanSo(tuSo_336,mauSo_336);
    }
}
