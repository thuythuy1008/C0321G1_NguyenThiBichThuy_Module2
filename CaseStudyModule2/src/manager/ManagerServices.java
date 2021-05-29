package manager;

import commons.FuncWriteRead;
import commons.ValidateService;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerServices {
    static Scanner scanner=new Scanner(System.in);
    static List<House> listHouse = new ArrayList();
    static List<Room> listRoom = new ArrayList();

    //    các chức năng quản lí CRUD
    public static String inputServiceName(){
        String inputServiceName;
        while (true){
            try {
                System.out.println("Nhập tên dịch vụ: ");
                inputServiceName = scanner.nextLine();
                ValidateService.checkIdVilla(inputServiceName);
                return inputServiceName;
            }catch (ValidateService e ){
//                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }

    public void addRoom() {
//        nhập từ bàn phím
//        validate dữ liệu
    }

    public void addHouse() {
//        nhập từ bàn phím
//        validate dữ liệu
        Villa villa=new Villa();
        FuncWriteRead.writeVillaToCSV(villa);
    }
}
