import java.util.Scanner;

public class HoaDonTheoNgay extends HoaDon {
	// 1. attributes
//	private float soGioThue;
	private float soNgayThue;

	// 2. get, set

	public float getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(float soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	// 3. constructor

	public HoaDonTheoNgay() {
		super();
	}

	public HoaDonTheoNgay(int maHD, int ngayHD, int thangHD, int namHD, int maPhong, String tenKH, float donGiaNgay, float soNgayThue) {
		super(maHD, ngayHD, thangHD, namHD, maPhong, tenKH, soNgayThue);
		this.soNgayThue = soNgayThue;
		this.donGiaNgay = donGiaNgay;
	}

	// 4. input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Vui lòng nhập số ngày thuê: ");
		this.soNgayThue = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập đơn giá theo ngày thuê: ");
		this.donGiaNgay = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		
		System.out.println("\t Số ngày thuê: " + this.soNgayThue +"\t Đơn giá theo ngày: " + this.donGiaNgay + "\t Thành tiền: " + this.thanhTien);
	}

	// 5. business
	public void tinhThanhTienTheoNgay() {
		this.thanhTien = this.donGiaNgay * this.soNgayThue;
	}

}