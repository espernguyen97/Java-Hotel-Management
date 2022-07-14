import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachHoaDon {
	// 1. attributes
	private ArrayList<HoaDon> listHoaDon;


	// 2, get, set
	public ArrayList<HoaDon> getListHoaDon() {
		return listHoaDon;
	}

	public void setListHoaDon(ArrayList<HoaDon> listHoaDon) {
		this.listHoaDon = listHoaDon;
	}


	// 3. constructors

	public DanhSachHoaDon() {
		listHoaDon = new ArrayList<HoaDon>();

	}

	public DanhSachHoaDon(ArrayList<HoaDon> listHoaDon) {
		super();
		this.listHoaDon = listHoaDon;
	}

	// 4. input, out
	public void nhap(Scanner scan) {
		HoaDon hd;
		boolean flag = true;
		do {
			System.out.println("Vui lòng chọn");
			System.out.println("1. Tính theo giờ");
			System.out.println("2. Tính theo ngày");
			System.out.println("0. Thoát");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				hd = new HoaDonTheoGio();
				hd.nhap(scan);
				this.listHoaDon.add(hd);
				break;
			case 2:
				hd = new HoaDonTheoNgay();
				hd.nhap(scan);
				this.listHoaDon.add(hd);
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);

	}

	public void xuat() {
		for (HoaDon hd : this.listHoaDon) {
			hd.xuat();
		}
	}

	// 5. business method
	public void init() {
		tinhTien();
	}

	public void tinhTien() {
		for (HoaDon hd : this.listHoaDon) {
			if (hd instanceof HoaDonTheoGio) {

				((HoaDonTheoGio) hd).tinhTienTheoGio();

			} else {
				((HoaDonTheoNgay) hd).tinhThanhTienTheoNgay();
			}
		}
	}

	public void dummyData() {
		HoaDon hd;
		hd = new HoaDonTheoGio(1, 1, 9, 2013, 1, "Han", 5, 10);
		this.listHoaDon.add(hd);

		hd = new HoaDonTheoGio(2, 1, 1, 2014, 1, "Tra", 2, 20);
		this.listHoaDon.add(hd);

		hd = new HoaDonTheoGio(3, 1, 9, 2013, 1, "No", 30, 30);
		this.listHoaDon.add(hd);
		
		hd = new HoaDonTheoGio(3, 1, 9, 2013, 1, "Jade", 40, 15);
		this.listHoaDon.add(hd);

		hd = new HoaDonTheoNgay(4, 1, 9, 2013, 1, "Mad", 11, 1);
		this.listHoaDon.add(hd);

		hd = new HoaDonTheoNgay(5, 1, 9, 2013, 1, "Elvis", 22, 2);
		this.listHoaDon.add(hd);

		hd = new HoaDonTheoNgay(6, 1, 9, 2013, 1, "Cray", 33, 3);
		this.listHoaDon.add(hd);
	}

}