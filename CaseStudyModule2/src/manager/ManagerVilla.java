package manager;

import commons.FuncWriteRead;
import commons.ValidateService;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerVilla {
    static Scanner scanner=new Scanner(System.in);
    static List<Villa> listVilla = new ArrayList();
    public void addVilla(String file) {
//        nhập từ bàn phím
        System.out.println("Thêm Villa!!! ");
        String id = inputIdVilla();
        String serviceName= ManagerServices.inputServiceName();

        System.out.println("Diện tích sử dụng: ");
        float acreageUser= Float.parseFloat(scanner.nextLine());
        System.out.println("Chi phí thuê: ");
        int totalPrice= Integer.parseInt(scanner.nextLine());
        System.out.println("Số lượng người tối đa: ");
        int totalPeople=Integer.parseInt(scanner.nextLine());
        System.out.println("Kiểu thuê: ");
        int totalDate=Integer.parseInt(scanner.nextLine());
        System.out.println("Tiêu chuẩn phòng: ");
        String roomStandard=scanner.nextLine();
        System.out.println("Mô tả tiện nghi: ");
        String description=scanner.nextLine();
        System.out.println("Diện tích hồ bơi: ");
        float swimmingPoolArea=Float.parseFloat(scanner.nextLine());
        System.out.println("Số tầng:");
        int floors=Integer.parseInt(scanner.nextLine());
        Villa villa=new Villa();
        FuncWriteRead.writeVillaToCSV(villa);
    }
    public static String inputIdVilla(){
        String inputIdVilla;
        while (true){
            try {
                System.out.println("Nhập id: ");
                inputIdVilla = scanner.nextLine();
                ValidateService.checkIdVilla(inputIdVilla);
                return inputIdVilla;
            }catch (ValidateService e ){
//                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }


}
