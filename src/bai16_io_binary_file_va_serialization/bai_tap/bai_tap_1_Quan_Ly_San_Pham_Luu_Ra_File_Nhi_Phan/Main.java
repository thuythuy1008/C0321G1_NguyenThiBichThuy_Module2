package bai16_io_binary_file_va_serialization.bai_tap.bai_tap_1_Quan_Ly_San_Pham_Luu_Ra_File_Nhi_Phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void ghiVaoTep(String path, List<SanPham> sanPham) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(sanPham);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void display(ArrayList<SanPham> sanPham) {
        System.out.println("--------------------------");
        System.out.println("Danh sách các sản phẩm:");
        for (SanPham sanPham1 : sanPham) {
            System.out.println(sanPham1);
        }
        System.out.println("--------------------------");
    }

    static void add(ArrayList<SanPham> sanPham, Scanner input) {
        System.out.println("Nhập mã của sản phẩm: ");
        int maSanPham = input.nextInt();
        input.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String tenSanPham = input.nextLine();
        System.out.println("Nhập hãn sản xuất: ");
        String hanSanXuat = input.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        int gia = input.nextInt();
        SanPham sanPham1 = new SanPham(maSanPham, tenSanPham, hanSanXuat, gia);
        sanPham.add(sanPham1);
        display(sanPham);
    }

    public static void main(String[] args) {
        List<SanPham> sanPham = new ArrayList<>();
        sanPham.add(new SanPham(1,"Samsung","Samsung",20000000));
        sanPham.add(new SanPham(2,"Galaxy","Samsung",30000000));
        sanPham.add(new SanPham(3,"Iphone","Iphone",35000000));
        sanPham.add(new SanPham(4,"Oppo","Oppo",25000000));
        sanPham.add(new SanPham(5,"Siaomi","Siaomi",15000000));
        ghiVaoTep("src\\bai16_io_binary_file_va_serialization\\bai_tap\\bai_tap_1_Quan_Ly_San_Pham_Luu_Ra_File_Nhi_Phan\\sanPham.txt", sanPham);
        List<SanPham> duLieuSanPham = docDuLieuTuTep("src\\bai16_io_binary_file_va_serialization\\bai_tap\\bai_tap_1_Quan_Ly_San_Pham_Luu_Ra_File_Nhi_Phan\\sanPham.txt");
        Main.display((ArrayList<SanPham>) sanPham);

//        sanPham.add(new SanPham(6,"Samsung1","Samsung",23000000));
        Main.add((ArrayList<SanPham>) sanPham);
    }

    private static void add(ArrayList<SanPham> sanPham) {
    }

    public static List<SanPham> docDuLieuTuTep(String path) {
        List<SanPham> sanPham = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            sanPham = (List<SanPham>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return sanPham;
    }
}
