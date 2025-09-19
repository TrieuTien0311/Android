package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Nguoi {
	private String hoTen_336;
	private Date ngaySinh_336;
	private String ngheNghiep_336;
	public Nguoi() {
	}
	public Nguoi(String hoTen_336, Date ngaySinh_336, String ngheNghiep_336) 
        {
		this.hoTen_336 = hoTen_336;
		this.ngaySinh_336 = ngaySinh_336;
		this.ngheNghiep_336 = ngheNghiep_336;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_336 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh_336 = strToDate(strDate);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep_336 = sc.nextLine();
	}
	private Date strToDate(String strDate) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}
		return date;
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_336);
		System.out.println("\tNgay sinh: " +dateToString(ngaySinh_336));
		System.out.println("\tNghe nghiep: " + ngheNghiep_336);
	}
	private String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = sdf.format(date);
		return strDate;
	}
	public Date getNgaySinh() {
		return ngaySinh_336;
	}
}

