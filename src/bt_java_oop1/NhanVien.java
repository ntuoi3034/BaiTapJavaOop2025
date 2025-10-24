package bt_java_oop1;

public class NhanVien {
        // Các thuộc tính (biến thành viên)
        String hoTen;
        int tuoi;
        String gioiTinh;
        String chucVu;
        double luong;

        // Hàm tạo (constructor)
        public NhanVien(String hoTen, int tuoi, String gioiTinh, String chucVu, double luong) {
            this.hoTen = hoTen;
            this.tuoi = tuoi;
            this.gioiTinh = gioiTinh;
            this.chucVu = chucVu;
            this.luong = luong;
        }

        // Hàm hiển thị thông tin nhân viên
        public void hienThiThongTin() {
            System.out.println("=== Thông tin nhân viên ===");
            System.out.println("Họ tên: " + hoTen);
            System.out.println("Tuổi: " + tuoi);
            System.out.println("Giới tính: " + gioiTinh);
            System.out.println("Chức vụ: " + chucVu);
            System.out.println("Lương: " + luong + " VND");
        }
    }