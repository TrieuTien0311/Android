package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Nguoi {
	protected String hoTen_336;
	protected Date ngaySinh_336;
	protected String queQuan_336;
	public Nguoi() {

	}
	public Nguoi(String hoTen_336, Date ngaySinh_336, String queQuan_336) {
		this.hoTen_336 = hoTen_336;
		this.ngaySinh_336 = ngaySinh_336;
		this.queQuan_336 = queQuan_336;
	}
	public void nhapThongTin(Scanner sc) {
                sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen_336 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate_336 = sc.nextLine();
		ngaySinh_336 = strToDate(strDate_336);
		System.out.print("\tNhap que quan: ");
		queQuan_336 = sc.nextLine();
	}
	private Date strToDate(String strDate_336) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = sdf.parse(strDate_336);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}
		return date;
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_336);
		System.out.println("\tNgay sinh: " + ngaySinh_336);
		System.out.println("\tQue quan: " + queQuan_336);
	}
	public String getQueQuan() {
		return queQuan_336;
	}
	public Date getNgaySinh() {
		return ngaySinh_336;
	}
}
