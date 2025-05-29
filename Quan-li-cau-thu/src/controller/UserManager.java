package controller;

import model.CauThu;
import java.util.ArrayList;

public class UserManager {
    private final ArrayList<CauThu> danhSach = new ArrayList<>();

    public void themCauThu(CauThu ct) {
        danhSach.add(ct);
    }

    public void hienThiDanhSach() {
        for (CauThu ct : danhSach) {
            System.out.println(ct);
        }
    }

}
