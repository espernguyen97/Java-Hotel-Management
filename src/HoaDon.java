import java.util.Scanner;

public class HoaDon {

	// 1. Attributes
	protected int maHD;
	protected int ngayHD;
	protected int thangHD;
	protected int namHD;
	protected int maPhong;
	protected String tenKH;
	protected float donGiaGio;
	protected float donGiaNgay;
	protected float thanhTien;

	// 2. Get, Set
	public int getMaHD() {
		return maHD;
	}

	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}

	public int getNgayHD() {
		return ngayHD;
	}

	public void setNgayHD(int ngayHD) {
		this.ngayHD = ngayHD;
	}

	public int getThangHD() {
		return thangHD;
	}

	public void setThangHD(int thangHD) {
		this.thangHD = thangHD;
	}

	public int getNamHD() {
		return namHD;
	}

	public void setNamHD(int namHD) {
		this.namHD = namHD;
	}

	public int getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public float getDonGiaGio() {
		return donGiaGio;
	}

	public void setDonGiaGio(float donGiaGio) {
		this.donGiaGio = donGiaGio;
	}

	public float getDonGiaNgay() {
		return donGiaNgay;
	}

	public void setDonGiaNgay(float donGiaNgay) {
		this.donGiaNgay = donGiaNgay;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	// 3. constructors
	public HoaDon() {
		this.thanhTien = 0;
	}

	public HoaDon(int maHD, int ngayHD, int thangHD, int namHD, int maPhong, String tenKH, float donGia) {
		super();
		this.maHD = maHD;
		this.ngayHD = ngayHD;
		this.thangHD = thangHD;
		this.namHD = namHD;
		this.maPhong = maPhong;
		this.tenKH = tenKH;
	}

	public HoaDon(int maHD, int ngayHD, int thangHD, int namHD, int maPhong, String tenKH, float donGiaGio,
			float donGiaNgay) {
		super();
		this.maHD = maHD;
		this.ngayHD = ngayHD;
		this.thangHD = thangHD;
		this.namHD = namHD;
		this.maPhong = maPhong;
		this.tenKH = tenKH;
		this.donGiaGio = donGiaGio;
		this.donGiaNgay = donGiaNgay;
	}

	// 4. input, output
	public void nhap(Scanner scan) {
		System.out.print("Nh???p m?? h??a ????n: ");
		this.maHD = Integer.parseInt(scan.nextLine());
		System.out.print("Nh???p ng??y c???a h??a ????n: ");
		this.ngayHD = Integer.parseInt(scan.nextLine());
		System.out.print("Nh???p th??ng c???a h??a ????n: ");
		this.thangHD = Integer.parseInt(scan.nextLine());
		System.out.print("Nh???p n??m c???a h??a ????n: ");
		this.namHD = Integer.parseInt(scan.nextLine());
		System.out.print("Nh???p t??n kh??ch h??ng: ");
		this.tenKH = scan.nextLine();
		System.out.print("Nh???p m?? ph??ng: ");
		this.maPhong = Integer.parseInt(scan.nextLine());
	}

	public void xuat() {
		System.out.print("M?? h??a ????n: " + this.maHD + "\t Ng??y : " + this.ngayHD + "\t Th??ng: " + this.thangHD
				+ "\t N??m: " + this.namHD + "\t T??n Kh??ch H??ng: " + this.tenKH + "\t M?? ph??ng: " + this.maPhong);
	}

	// 5. business method
}
