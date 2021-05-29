package controllers;

import manager.ManagerServices;

import java.util.Scanner;

public class MainController {
    static ManagerServices managerServices=new ManagerServices();
    public static void displayMainMenu(){
//        menu tùy chọn chức năng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu: \n" +
                "1. Add New Services \n" +
                "2. Show Services \n" +
                "3. Add New Customer \n " +
                "4. Show Information of Customer \n" +
                "5. Add New Booking \n" +
                "6. Show Information of Employee \n" +
                "7. Exit");
        Scanner input = new Scanner(System.in);
        int chooseService= Integer.parseInt(input.nextLine());
        switch (chooseService){
            case 1:
                addService();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
//                exit
        }
    }

    private static void addService() {
        System.out.println("Menu: \n" +
                "1. Add New Villa \n" +
                "2. Add New House \n" +
                "3. Add New Room \n " +
                "4. Back to menu \n" +
                "5. Exit \n");

        Scanner input = new Scanner(System.in);
        int chooseService= Integer.parseInt(input.nextLine());
        switch (chooseService){
            case 1:
//                managerServices.addVilla();
                break;
            case 2:
                managerServices.addRoom();
                break;
            case 3:
                managerServices.addHouse();
                break;
            case 4:
                break;
            case 5:
                break;
            default:
//                exit
        }
    }
}
