package bai10_stack_queue.bai_tap.bai_tap_Optional_To_Chuc_Du_Lieu_Hop_Ly_Demerging_Su_Dung_Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class QueueDemerging {
    public static Personnel[] listPersonnel() {
        Personnel[] personnels = new Personnel[5];
        personnels[0] = new Personnel("Nguyễn Văn A", "10/04/1994", "Nam");
        personnels[1] = new Personnel("Huỳnh Thị B", "20/07/1992", "Nữ");
        personnels[2] = new Personnel("Võ Văn C", "01/12/1997", "Nam");
        personnels[3] = new Personnel("Hồ Thị D", "05/10/1994", "Nữ");
        personnels[4] = new Personnel("Trần Văn E", "30/01/1995", "Nam");
        for (int i = 0; i < personnels.length - 1; i++) {
            for (int j = i + 1; j < personnels.length; j++) {
                if (personnels[i].compareTo(personnels[j]) > 0) {
                    Personnel temp = personnels[j];
                    personnels[j] = personnels[i];
                    personnels[i] = temp;
                }
            }
        }
        System.out.println("Mảng sắp xếp theo ngày tháng năm sinh: ");
        System.out.println(Arrays.toString(personnels));
        return personnels;
    }

    public static void main(String[] args) {
        Personnel[] personnels = listPersonnel();
        Queue<Personnel> male = new ArrayDeque();
        Queue<Personnel> female = new ArrayDeque();

        for (Personnel personnel : personnels) {
            if (personnel.getGender().equals("Nam")) {
                male.add(personnel);
            } else {
                female.add(personnel);
            }
        }

        ArrayList<Personnel> listSort = new ArrayList<>();
        while (!female.isEmpty()) {
            listSort.add(female.remove());
        }
        while (!male.isEmpty()) {
            listSort.add(male.remove());
        }

        System.out.println("Danh sách sắp xếp theo ngày tháng năm sinh và giới tính: ");
        for (Personnel personnel : listSort) {
            System.out.println(personnel.toString());
        }
    }
}
