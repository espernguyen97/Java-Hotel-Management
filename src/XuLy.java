import java.util.Scanner;

public class XuLy {

	public XuLy() {

	}

	public static void main(String[] args) {

		DanhSachHoaDon objDSHD = new DanhSachHoaDon();
		Scanner scan = new Scanner(System.in);
		objDSHD.dummyData();
		
		objDSHD.nhap(scan);
		objDSHD.init();
		objDSHD.xuat();
	}

}
