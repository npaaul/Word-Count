package com.hewen.Log;

import VehicleDetail.Bus;
import VehicleDetail.Car;
import VehicleDetail.Trunk;
import VehicleDetail.carList;
import Tools.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

    public class Administrator extends Person {

        public Administrator(String username, String password) {
            super(username, password);
            super.setIdentity("管理员");
        }
        public void Administrator_ViewVehicle() throws IOException, ClassNotFoundException {//管理员查看车辆信息
            System.out.println("全部轿车如下：");
            carList carList = new carList();
            Tools.Traversal_randomAllVehicleList_setIndex(carList.getAllCarList());
            System.out.println("全部客车如下：");
            Tools.Traversal_randomAllVehicleList_setIndex(carList.getAllBusList());
            System.out.println("全部货车如下：");
            Tools.Traversal_randomAllVehicleList_setIndex(carList.getAllTrunkList());
        }
        public void Administrator_AddVehicle() throws IOException, ClassNotFoundException {//管理员加入车辆
            carList carList = new carList();
            boolean flag=true;
            while (flag) {
                System.out.println("请选择要加入的车辆类型：(按0退出,按1继续)");
                Scanner scanner = new Scanner(System.in);
                int piece=scanner.nextInt();
                if(piece==0) {
                    flag = false;
                    break;
                }
                System.out.println("1.轿车2.客车3.货车");
                int key = scanner.nextInt();
                switch (key) {
                    case 1:
                        //String brand, String type, int perRent, String vehicleid
                        System.out.println("请输入车辆信息：(品牌，型号，日租金，车牌号)");
                        String VehicleInfo = scanner.next();
                        String[] strings = VehicleInfo.split(",");
                        Car car = new Car(strings[0], strings[1], Integer.parseInt(strings[2]), strings[3]);
                        carList.getAllCarList().add(car);
                        carList.getAllVehicle().set(0, (LinkedList) carList.getAllCarList());
                        carList.SaveAllVehicleList();
                        System.out.println("车辆加入成功");
                        break;
                    case 2:
                        //String brand, String type, int perRent, String vehicleid, int seatsNum
                        System.out.println("请输入车辆信息：(品牌，型号，日租金，车牌号，座位数)");
                        VehicleInfo = scanner.next();
                        strings = VehicleInfo.split(",");
                        Bus bus = new Bus(strings[0], strings[1], Integer.parseInt(strings[2]), strings[3], Integer.parseInt(strings[4]));
                        carList.getAllBusList().add(bus);
                        carList.getAllVehicle().set(1, (LinkedList) carList.getAllBusList());
                        carList.SaveAllVehicleList();
                        System.out.println("车辆加入成功");
                        break;
                    case 3:
                        //String brand, String type, int perRent, String vehicleid, double load
                        System.out.println("请输入车辆信息：(品牌，型号，日租金，车牌号，承载量)");
                        VehicleInfo = scanner.next();
                        strings = VehicleInfo.split(",");
                        Trunk trunk = new Trunk(strings[0], strings[1], Integer.parseInt(strings[2]), strings[3], Double.parseDouble(strings[4]));
                        carList.getAllTrunkList().add(trunk);
                        carList.getAllVehicle().set(2, (LinkedList) carList.getAllTrunkList());
                        carList.SaveAllVehicleList();
                        System.out.println("车辆加入成功");
                        break;
                    default:
                        System.out.println("非法输入,请重试");
                        break;
                }
            }
        }
        public void  Administrator_DelVehicle() throws IOException, ClassNotFoundException {//管理员删除车辆
            carList carList = new carList();
            Scanner scanner = new Scanner(System.in);
            boolean flag = true;
            while (flag) {
                System.out.println("请选择要删除的车辆类型：(按0退出,按1继续)");
                int piece = scanner.nextInt();
                if(piece==0){
                    flag=false;
                    break;
                }
                System.out.println("1.轿车2.客车3.货车");
                int key = scanner.nextInt();
                switch (key) {
                    case 1:
                        System.out.println("目前轿车有如下车辆可删除：");
                        Tools.Traversal_randomAllVehicleList_setIndex(carList.getAllCarList());
                        System.out.println("请输入你想删除的车辆序号：");
                        int anIndex = scanner.nextInt();
                        System.out.println("是否确认删除以下车辆？ y/n");
                        try {
                            System.out.println(carList.getAllCarList().get(anIndex-1).toString());
                        } catch (Exception e) {
                            System.out.println("非法车辆序号输入,请重试");
                            break;
                        }
                        char judge = scanner.next().charAt(0);
                        if (judge == 'n')
                            break;
                        System.out.println("已成功删除以下车辆\n" + carList.getAllCarList().remove(anIndex-1).toString());
                        carList.getAllVehicle().set(0, (LinkedList) carList.getAllCarList());
                        carList.SaveAllVehicleList();
                        break;
                    case 2:
                        System.out.println("目前客车有如下车辆可删除：");
                        Tools.Traversal_randomAllVehicleList_setIndex(carList.getAllBusList());
                        System.out.println("请输入你想删除的车辆序号：");
                        anIndex = scanner.nextInt();
                        System.out.println("是否确认删除以下车辆？ y/n");
                        try {
                            System.out.println(carList.getAllBusList().get(anIndex-1).toString());
                        } catch (Exception e) {
                            System.out.println("非法车辆序号输入,请重试");
                            break;
                        }
                        judge = scanner.next().charAt(0);
                        if (judge == 'n')
                            break;
                        System.out.println("已成功删除以下车辆\n" + carList.getAllBusList().remove(anIndex-1).toString());
                        carList.getAllVehicle().set(1, (LinkedList) carList.getAllBusList());
                        carList.SaveAllVehicleList();
                        break;
                    case 3:
                        System.out.println("目前货车有如下车辆可删除：");
                        Tools.Traversal_randomAllVehicleList_setIndex(carList.getAllTrunkList());
                        System.out.println("请输入你想删除的车辆序号：");
                        anIndex = scanner.nextInt();
                        System.out.println("是否确认删除以下车辆？ y/n");
                        try {
                            System.out.println(carList.getAllTrunkList().get(anIndex-1).toString());
                        } catch (Exception e) {
                            System.out.println("非法车辆序号输入,请重试");
                            break;
                        }
                        judge = scanner.next().charAt(0);
                        if (judge == 'n')
                            break;
                        System.out.println("已成功删除以下车辆\n" + carList.getAllTrunkList().remove(anIndex-1).toString());
                        carList.getAllVehicle().set(2, (LinkedList) carList.getAllTrunkList());
                        carList.SaveAllVehicleList();
                        break;
                }
            }
        }
        public void Administrator_CheckTrade() throws IOException, ClassNotFoundException {//管理员查看营业额
            double sum=0;
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\UserList.txt"));
            ArrayList arrayListPerson = (java.util.ArrayList) objectInputStream.readObject();
            for (int i = 1; i < arrayListPerson.size(); i++) {
                VipUser vipUser = (VipUser) arrayListPerson.get(i);
                sum+=vipUser.AllOrderMoney();
            }
            System.out.println("总营业额为："+sum);
        }
        public void Administrator_ModifyVehicle() throws IOException, ClassNotFoundException {//管理员修改车辆信息
            carList carList = new carList();
            boolean flag=true;
            while (flag) {
                System.out.println("请选择要修改的车辆类型：(按0退出,按1继续)");
                Scanner scanner = new Scanner(System.in);
                int piece=scanner.nextInt();
                if(piece==0) {
                    flag = false;
                    break;
                }
                System.out.println("1.轿车2.客车3.货车");
                int key = scanner.nextInt();
                switch (key) {
                    case 1:
                        System.out.println("所有轿车如下：");
                        Tools.Traversal_randomAllVehicleList_setIndex(carList.getAllCarList());
                        System.out.println("请选择你要修改的车辆序号：");
                        int anIndex = scanner.nextInt();
                        //String brand, String type, int perRent, String vehicleid
                        System.out.println("请输入该车辆的新信息：(品牌，型号，日租金，车牌号)");
                        String VehicleInfo = scanner.next();
                        String[] strings = VehicleInfo.split(",");
                        carList.getAllCarList().set(anIndex,new Car(strings[0], strings[1], Integer.parseInt(strings[2]), strings[3]));
                        carList.getAllVehicle().set(0, (LinkedList) carList.getAllCarList());
                        carList.SaveAllVehicleList();
                        System.out.println("车辆修改成功");
                        break;
                    case 2:
                        System.out.println("所有客车如下：");
                        Tools.Traversal_randomAllVehicleList_setIndex(carList.getAllBusList());
                        System.out.println("请选择你要修改的车辆序号：");
                        anIndex = scanner.nextInt();
                        //String brand, String type, int perRent, String vehicleid, int seatsNum
                        System.out.println("请输入该车辆的新信息：(品牌，型号，日租金，车牌号，座位数)");
                        VehicleInfo = scanner.next();
                        strings = VehicleInfo.split(",");
                        carList.getAllBusList().set(anIndex,new Bus(strings[0], strings[1], Integer.parseInt(strings[2]), strings[3],Integer.parseInt(strings[4])));
                        carList.getAllVehicle().set(0, (LinkedList) carList.getAllBusList());
                        carList.SaveAllVehicleList();
                        System.out.println("车辆修改成功");
                        break;
                    case 3:
                        System.out.println("所有货车如下：");
                        Tools.Traversal_randomAllVehicleList_setIndex(carList.getAllTrunkList());
                        System.out.println("请选择你要修改的车辆序号：");
                        anIndex = scanner.nextInt();
                        //String brand, String type, int perRent, String vehicleid, double load
                        System.out.println("请输入该车辆的新信息：(品牌，型号，日租金，车牌号，承载量)");
                        VehicleInfo = scanner.next();
                        strings = VehicleInfo.split(",");
                        carList.getAllTrunkList().set(anIndex,new Trunk(strings[0], strings[1], Integer.parseInt(strings[2]), strings[3],Double.parseDouble(strings[4])));
                        carList.getAllVehicle().set(0, (LinkedList) carList.getAllTrunkList());
                        carList.SaveAllVehicleList();
                        System.out.println("车辆修改成功");
                        break;
                }
            }
        }
    }

