package com.hewen.Tools;

import Log.VipUser;
import RentProcess.rentOperator;
import VehicleDetail.*;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tools {
    static Scanner sc = new Scanner(System.in);
    public static void Traversal_randomAllVehicleList(List<? extends Vehicle> randomAllVehicleList){
        for (Object o :randomAllVehicleList) {
            Vehicle vehicle=(Vehicle) o;
            System.out.println(vehicle.toString());
        }
    }
    public static void Traversal_randomAllVehicleList_setIndex(List<? extends Vehicle> randomAllVehicleList){
        int num=1;
        for (int i = 0; i < randomAllVehicleList.size(); i++) {
            randomAllVehicleList.get(i).setIndex(num++);
            System.out.println(randomAllVehicleList.get(i).toString());
        }
    }

    public static void JudgeVehicleList(Vehicle vehicle) throws IOException, ClassNotFoundException {//区别汽车所属种类集合
        carList carList = new carList();
        if (vehicle instanceof Car)
            ModifyRentStatus(vehicle.getVehicleid(), carList.getAllCarList());
        else if (vehicle instanceof Bus) {
            ModifyRentStatus(vehicle.getVehicleid(), carList.getAllBusList());
        } else if (vehicle instanceof Trunk) {
            ModifyRentStatus(vehicle.getVehicleid(), carList.getAllTrunkList());
        }
        carList.SaveAllVehicleList();
    }

    public static void ModifyRentStatus(String string, List<? extends Vehicle> randomAllVehicleList) {//修改集合中对应车牌车辆状态
        for (Object o : randomAllVehicleList) {
            Vehicle vehicle = (Vehicle) o;
            if (string.equals(vehicle.getVehicleid())) {
                vehicle.setRentStatus(false);
                break;
            }
        }
    }

    public static void t(rentOperator rentOperator, List<? extends Vehicle> randomAllVehicleList) {
        System.out.println("是否进行品牌索引 y/n");
        char c = sc.next().charAt(0);
        if (c == 'y') {
            List<? extends Vehicle> allVehicleList =rentOperator.sort(randomAllVehicleList);
            allVehicleList=rentOperator.rentVehicleByBrand(allVehicleList);
            System.out.println("请选择你要租赁的租车车辆序号:");
            int choice_1 = sc.nextInt();
            int index = choice_1 - 1;
            try {
                index = rentOperator.indexes.get(index);
            } catch (Exception e) {
                System.out.println("非法车辆序号输入");
                rentOperator.indexes.clear();
                return;
            }
            rentOperator.chooseVehicle(allVehicleList, index);
            rentOperator.indexes.clear();
            return;
        }
        List<? extends Vehicle> allVehicleList =rentOperator.sort(randomAllVehicleList);
        System.out.println("请选择你要租赁的租车车辆序号:");
        Tools.Traversal_randomAllVehicleList_setIndex(allVehicleList);
        int choice_2 = sc.nextInt();
        int index = choice_2 - 1;
        try {
            rentOperator.chooseVehicle(allVehicleList, index);
        } catch (Exception e) {
            System.out.println("非法车辆序号输入");
        }
    }
}