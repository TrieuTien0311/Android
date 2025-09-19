package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class TheMuon extends SinhVien {
	private int soMuon_336;
	private Date ngayMuon_336;
	private Date hanTra_336;
	private String soHieu_336;
	public TheMuon() {
	}
	public TheMuon(int soMuon_336, Date ngayMuon_336, String soHieu_336) {
		this.soMuon_336 = soMuon_336;
		this.ngayMuon_336 = ngayMuon_336;
		this.soHieu_336 = soHieu_336;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so muon: ");
		soMuon_336 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon_336 = sc.nextLine();
		ngayMuon_336 = strToDate(strNgayMuon_336);
		String strNgayTra = "31-12-2025";
		hanTra_336 = strToDate(strNgayTra);
		System.out.println("\tNhap so hieu: ");
		soHieu_336 = sc.nextLine();
	}
	private Date strToDate(String strNgayMuon_336) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = sdf.parse(strNgayMuon_336);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}
		return date;
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phieu muon: " + soMuon_336);
		System.out.println("\tNgay muon: " + ngayMuon_336);
		System.out.println("\tHan tra: " + hanTra_336);
		System.out.println("\tSo hieu: " + soHieu_336);
	}
	public Date getHanTra() {
		return hanTra_336;
	}
}
