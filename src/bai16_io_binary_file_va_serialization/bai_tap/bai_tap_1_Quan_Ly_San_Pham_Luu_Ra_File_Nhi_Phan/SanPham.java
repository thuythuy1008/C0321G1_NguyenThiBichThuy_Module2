package bai16_io_binary_file_va_serialization.bai_tap.bai_tap_1_Quan_Ly_San_Pham_Luu_Ra_File_Nhi_Phan;

import java.io.Serializable;

public class SanPham implements Serializable {
    private int maSanPham;
    private String tenSanPham;
    private String hanSanXuat;
    private int gia;

    public SanPham(int i, String s) {
    }

    public SanPham(int maSanPham, String tenSanPham, String hanSanXuat, int gia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hanSanXuat = hanSanXuat;
        this.gia = gia;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setHanSanXuat(String hanSanXuat) {
        this.hanSanXuat = hanSanXuat;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getHanSanXuat() {
        return hanSanXuat;
    }

    public int getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hanSanXuat='" + hanSanXuat + '\'' +
                ", gia=" + gia +
                '}';
    }
}
