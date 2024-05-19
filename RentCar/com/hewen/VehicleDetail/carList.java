package com.hewen.VehicleDetail;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class carList {
    private ArrayList<LinkedList> allVehicle;
    private List<Car> allCarList ;
    private List<Bus> allBusList ;
    private List<Trunk> allTrunkList ;

    public carList() throws IOException, ClassNotFoundException {
        File file=new File("D:\\AllVehicleList.txt");
        if(file.exists()){
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\AllVehicleList.txt"));
            allVehicle= (ArrayList<LinkedList>) objectInputStream.readObject();
            allCarList=allVehicle.get(0);
            allBusList=allVehicle.get(1);
            allTrunkList=allVehicle.get(2);
            objectInputStream.close();
        }
        else {
            file.createNewFile();
            allVehicle=new ArrayList<LinkedList>();
            allCarList=new LinkedList<Car>();
            allBusList=new LinkedList<Bus>();
            allTrunkList=new LinkedList<Trunk>();
            allCarList=allCarInfo();
            allBusList=allBusInfo();
            allTrunkList=allTrunkInfo();
            allVehicle.add((LinkedList) allCarList );
            allVehicle.add((LinkedList) allBusList);
            allVehicle.add((LinkedList) allTrunkList);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\AllVehicleList.txt"));
            objectOutputStream.writeObject(allVehicle);
            objectOutputStream.close();
        }
    }

    public ArrayList<LinkedList> getAllVehicle() {
        return allVehicle;
    }

    public List<Car> getAllCarList() {
        return allCarList;
    }

    public List<Bus> getAllBusList() {
        return allBusList;
    }

    public List<Trunk> getAllTrunkList() {
        return allTrunkList;
    }

    public List allCarInfo() {//全部轿车信息存储
        //轿车
        allCarList.add(new Car("宝马", "宝马-X6", 800, "京NY28588"));
        allCarList.add(new Car("宝马", "宝马-550i", 600, "京CNY3284"));
        allCarList.add(new Car("别克", "别克-林荫大道", 300, "京NT37465"));
        allCarList.add(new Car("别克", "别克-GL8", 600, "京NT96968"));
        return allCarList;
    }
    public List allBusInfo() {//全部车辆信息存储
        //客车
        allBusList.add(new Bus("金杯", "金杯-16座", 800, "京6566754", 34));
        allBusList.add(new Bus("金杯", "金杯-16座", 800, "京8696997", 16));
        allBusList.add(new Bus("金龙", "金龙-34座", 1500, "京9696996", 34));
        allBusList.add(new Bus("金龙", "金龙-34座", 1500, "京8696998", 34));
        return allBusList;
    }
    public List allTrunkInfo(){//全部车辆信息存储
        //货车

        allTrunkList.add( new Trunk("五菱","五菱-荣光新卡",200,"京888888",6));
        allTrunkList.add( new Trunk("东风","东风-柳汽乘龙",350,"京846456",14));
        allTrunkList.add( new Trunk("中国重汽","中国重汽-豪沃 TH7",800,"京586648",100));
        return allTrunkList;
    }
    public void SaveAllVehicleList() throws IOException {//加所有汽车集合保存在文件中
        allVehicle.set(0, (LinkedList) allCarList);
        allVehicle.set(1, (LinkedList) allBusList);
        allVehicle.set(2, (LinkedList) allTrunkList);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\AllVehicleList.txt"));
        objectOutputStream.writeObject(allVehicle);
        objectOutputStream.close();
    }
}