package controller;

import model.CauThu;

public class Main {
    public static void main(String[] args) {
        UserManager manager = new UserManager();

        CauThu ct1 = new CauThu("Nguyen Van A", 25, "Tiền đạo");
        CauThu ct2 = new CauThu("Tran Van B", 23, "Hậu vệ");

        manager.themCauThu(ct1);
        manager.themCauThu(ct2);

        manager.hienThiDanhSach();
    }
}
