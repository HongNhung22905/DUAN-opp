package model;

import java.util.ArrayList;

public class DanhSachCauThu {
    private final ArrayList<CauThu> danhSach;

    public DanhSachCauThu() {
        this.danhSach = new ArrayList<>();
    }

    // Thêm cầu thủ vào danh sách
    public void themCauThu(CauThu ct) {
        danhSach.add(ct);
    }

    // Hiển thị toàn bộ danh sách
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            for (CauThu ct : danhSach) {
                System.out.println(ct);
            }
        }
    }

    // Tìm cầu thủ theo tên
    public CauThu timTheoTen(String ten) {
        for (CauThu ct : danhSach) {
            if (ct.getTen().equalsIgnoreCase(ten)) {
                return ct;
            } else {
            }
        }
        return null;
    }

    // Xóa cầu thủ theo tên
    public boolean xoaCauThu(String ten) {
        CauThu ct = timTheoTen(ten);
        if (ct != null) {
            danhSach.remove(ct);
            return true;
        }
        return false;
    }

    // Lấy số lượng cầu thủ
    public int soLuongCauThu() {
        return danhSach.size();
    }

    // Getter cho danh sách (nếu cần)
    public ArrayList<CauThu> getDanhSach() {
        return new ArrayList<>(danhSach); // Trả bản sao, tránh chỉnh sửa trực tiếp
    }
}
