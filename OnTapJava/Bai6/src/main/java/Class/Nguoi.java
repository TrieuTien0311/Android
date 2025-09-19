package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Nguoi {
	protected String hoTen_336;
	protected Date ngaySinh_336;
	protected int CMND_336;
	public Nguoi() {
	}
	public Nguoi(String hoTen_336, Date ngaySinh_336, int CMND_336) {
		this.hoTen_336 = hoTen_336;
		this.ngaySinh_336 = ngaySinh_336;
		this.CMND_336 = CMND_336;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_336 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh_336 = strToDate(strDate);
		System.out.print("\tNhap CMND: ");
		CMND_336 = sc.nextInt();
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
		System.out.println("\tNgay sinh: " + ngaySinh_336);
		System.out.println("\tCMND: " + CMND_336);
	}
	public int getCMND() {
		return CMND_336;
	}
}
