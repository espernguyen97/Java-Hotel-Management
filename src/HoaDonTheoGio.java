import java.util.Scanner;

public class HoaDonTheoGio extends HoaDon {
	// 1. attributes
	private float soGioThue;
	
	// 2. get, set
	public float getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(float soGioThue) {
		this.soGioThue = soGioThue;
	}
	
	// 3. constructor
	
	public HoaDonTheoGio() {
		super();
	}

	public HoaDonTheoGio(int maHD, int ngayHD, int thangHD, int namHD, int maPhong, String tenKH, float donGiaGio,
			float soGioThue) {
		super(maHD, ngayHD, thangHD, namHD, maPhong, tenKH, soGioThue);
		this.soGioThue = soGioThue;
		this.donGiaGio = donGiaGio;
	}
	
	
	
	// 4. input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		do {
			System.out.println("Vui lòng nhập số giờ thuê: ");
			System.out.println("Hóa đơn cho khách đặt phòng dưới 30h.");
			this.soGioThue = Integer.parseInt(scan.nextLine());
		}while (soGioThue>30 ||soGioThue<=0);

	System.out.println("Vui long nhap don gia theo gio: ");
	this.donGiaGio = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Số giờ thuê: " + this.soGioThue
				+ "\t Đơn giá theo giờ: " + this.donGiaGio
				+ "\t Thành tiền: " + this.thanhTien);
	}
	
	// 5. business
	public void tinhTienTheoGio() {
		if (this.soGioThue < 24) {
			this.thanhTien = this.soGioThue * this.donGiaGio;
		} else if (this.soGioThue >= 24 &&this.soGioThue <= 30 ) {
			this.thanhTien = 24 * this.donGiaGio;
		}
	}
	
	
	

	
	
}
