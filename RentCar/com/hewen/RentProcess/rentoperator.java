package com.hewen.RentProcess;

import Log.Order;
import Log.VipUser;
import Tools.Tools;
import VehicleDetail.Vehicle;
import VehicleDetail.carList;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class rentOperator {
    VipUser vipUser;
    HashSet<String> brandVehicleSet = new HashSet<>();//所有车型品牌集合
    Scanner sc = new Scanner(System.in);

    public rentOperator(VipUser vipUser) {
        this.vipUser = vipUser;
    }

    public synchronized void leaseOutFlow() throws IOException, ClassNotFoundException {//租车流程
        System.out.println("********************欢迎光临腾飞汽车租赁公司*********************");
        boolean status = true;//运行状态
        while (status) {
            System.out.println("请选择功能!");
            System.out.println("1.查看车辆信息 2.租赁 3.还车 4.查看历史订单 5.退出系统");
            int choice1;
            choice1 = sc.nextInt();
            switch (choice1) {
                case 1:
                    checkOutGarage();
                    break;
                case 2:
                    //int choice2 = rentMain();
                    System.out.println("**********************欢迎下次光临*****************************");
                    System.out.println("1.轿车 2.客车 3.卡车");
                    System.out.println("请选择您要租赁的汽车类型");
                    int choice = sc.nextInt();
                    rentVehicle(choice);
                    break;
                case 3:
                    returnVehicle();
                    break;
                case 4:
                    CheckOrderList();
                    break;
                case 5:
                    status = false;//退出循环
                    break;
            }
        }
        System.out.println("*******************谢谢您的使用,欢迎您下次光临***************************");
    }


    public void CheckOrderList(){//查看历史订单
        System.out.println("尊敬的 "+vipUser.getUsername()+" 用户，您的历史订单如下：");
        for (Object o :vipUser.getOrderList()) {
            Order order=(Order) o;
            StringBuffer stringBuffer = new StringBuffer(o.toString());
            stringBuffer.delete(9,14);
            System.out.println(stringBuffer);
        }
    }
    public void checkOutGarage() throws IOException, ClassNotFoundException {//查看车辆信息
        System.out.println("***************本店全部车辆如下**********");
        carList carInfo = new carList();
        System.out.println("轿车:");
        Tools.Traversal_randomAllVehicleList_setIndex(carInfo.getAllCarList());
        System.out.println("客车:");
        Tools.Traversal_randomAllVehicleList_setIndex(carInfo.getAllBusList());
        System.out.println("货车:");
        Tools.Traversal_randomAllVehicleList_setIndex(carInfo.getAllTrunkList());
        System.out.println("***************************************");
    }

    public static ArrayList<Integer> indexes = new ArrayList<>();

    public void rentVehicle(int choice) throws IOException, ClassNotFoundException {//租赁 选择车型
        carList carInfo = new carList();
        switch (choice) {
            case 1:
                Tools.t(this, carInfo.getAllCarList());
                break;
            case 2:
                Tools.t(this, carInfo.getAllBusList());
                break;
            case 3:
                Tools.t(this, carInfo.getAllTrunkList());
                break;
            default:
                System.out.println("请输入正确的选项!");
                break;
        }
        carInfo.SaveAllVehicleList();
    }

    public List<? extends Vehicle> rentVehicleByBrand(List<? extends Vehicle> allVehicleList)//根据品牌索引选择车辆
    {
        brandVehicleSet.clear();
        for (int i = 0; i < allVehicleList.size(); i++) {

            brandVehicleSet.add(allVehicleList.get(i).getBrand());
        }
        System.out.println("本店该车型所有品牌如下:");

        Iterator<String> iterator = brandVehicleSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("请输入你要选择的品牌:");
        String brand = sc.next();
        int num = 0;
        for (int i = 0; i < allVehicleList.size(); i++) {
            if (brand.equals(allVehicleList.get(i).getBrand())) {
                //indexes[num] = i;
                indexes.add(i);
                num++;
                allVehicleList.get(i).setIndex(num);
                System.out.println(allVehicleList.get(i).toString());
            }
        }
        return allVehicleList;
    }


    public void chooseVehicle(List<? extends Vehicle> allVehicleList, int index) {//选择车辆序号  并确认订单 若无误则支付账单
        if (allVehicleList.get(index).isRentStatus()) {
            System.out.println("车辆已被出租");
        } else {
            discountVehicle();
            System.out.println("请输入你要租赁的租赁天数");
            allVehicleList.get(index).setRentDays(sc.nextInt());
            System.out.println("分配给您的租赁车辆牌照是:" + allVehicleList.get(index).getVehicleid());
            System.out.println("您需要去前台支付租赁金额共:" + allVehicleList.get(index).calRent(allVehicleList.get(index).getRentDays()) + "元!");
            System.out.println("这是您的租赁的车辆信息请检查:" + allVehicleList.get(index).toString());
            System.out.println("若订单无误是否支付账单");
            System.out.println("1.是 2.否");
            if(sc.nextInt()==2)
                return;
            allVehicleList.get(index).setRentStatus(true);//
            System.out.println("支付成功你的订单信息如下!");
            allVehicleList.get(index).toString();
            Date date = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);//设置起时间
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
            String time=sdf.format(date);
            System.out.print("租赁时间为:");
            System.out.println(time);
            vipUser.getOrderList().add(new Order(allVehicleList.get(index),date));
            cal.add(Calendar.DATE, allVehicleList.get(index).getRentDays());//增加perRentDay天
            date=cal.getTime();
            sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
            time = sdf.format(date);
            System.out.println("归还时间为:" + time);
            System.out.println("请及时归还!");
        }
    }

    public void returnVehicle() throws IOException, ClassNotFoundException { //还车
        boolean status = true;
        while (status) {
            System.out.println("1.退出还车系统 任意键返回还车菜单");
            if (sc.nextInt() == 1) {
                status = false;
                break;
            }
            System.out.println("*******************************************");
            System.out.println("你好,你一共租赁" + vipUser.getOrderList().size() + "辆");
            if(vipUser.getOrderList().size()==0)
                return;
            int num = 1;
            System.out.println("租赁信息如下:");
            for (int i = 0; i < vipUser.getOrderList().size(); i++) {
                StringBuffer stringBuffer = new StringBuffer(vipUser.getOrderList().get(i).getVehicle().toString());
                stringBuffer.delete(1,5);
                System.out.println("序号："+num++ + stringBuffer);
            }
            System.out.println("*******************************************");
            System.out.println("请输入你要还车的序号");
            int choice = sc.nextInt();
            int index = choice - 1;
            System.out.println("请确认你所还车的车辆信息:");
            try {
                StringBuffer stringBuffer = new StringBuffer(vipUser.getOrderList().get(index).getVehicle().toString());
                stringBuffer.delete(1,5);
                System.out.println(stringBuffer);
            } catch (Exception e) {
                System.out.println("非法车辆序号输入");
                return;
            }
            System.out.println("请输入:1.确定 任意键:返回还车菜单");
            if (sc.nextInt() == 1) {
                Tools.JudgeVehicleList(vipUser.getOrderList().get(index).getVehicle());    //
                vipUser.getOrderList().get(index).getVehicle().setRentStatus(false);
                System.out.println("还车成功!");
            }
        }
    }

    public List<? extends Vehicle> sort(List<? extends Vehicle> allVehicleList) { //选择价格排序方式
        System.out.println("1.价格升序 2.价格降序 任意键默认");
        switch (sc.nextInt()) {
            case 1:
                return perRentAscending(allVehicleList);
            case 2:
                return perRentDescending(allVehicleList);
            default:
                return sortByBrand(allVehicleList);
        }
    }

    public List<? extends Vehicle> perRentAscending(List<? extends Vehicle> allVehicleList) {//价格升序
        Collections.sort(allVehicleList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                int a = o1.getPerRent();
                int b = o2.getPerRent();
                return a < b ? -1 : a == b ? 0 : 1;    //当a<b返回-1，a==b返回0，a>b返回1
            }
        });
        return allVehicleList;
    }

    public List<? extends Vehicle> perRentDescending(List<? extends Vehicle> allVehicleList) {//价格降序
        Collections.sort(allVehicleList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                int a = o1.getPerRent();
                int b = o2.getPerRent();
                return a > b ? -1 : a == b ? 0 : 1;    //当a>b返回-1，a==b返回0，a>b返回1
            }
        });
        return allVehicleList;
    }

    public List<? extends Vehicle> sortByBrand(List<? extends Vehicle> allVehicleList) {//品牌降序(默认排序)
        Collections.sort(allVehicleList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                String a = o1.getBrand();
                String b = o2.getBrand();
                return a.compareTo(b) > 0 ? -1 : a == b ? 0 : 1;    //当a>b返回-1，a==b返回0，a>b返回1
            }
        });
        return allVehicleList;
    }
    //租车福利
    public void discountVehicle() {
        System.out.println("福利多多!!!");
        discountCar();
        discountBus_and_Trunk();
    }

    public void discountCar() {
        System.out.println("活动期间轿车");
        System.out.println("0<=租车天数<=7天   原价");
        System.out.println("7<租车天数<=30天   九折");
        System.out.println("30<租车天数<=150天 八折");
        System.out.println("租车天数>150天     七折");
    }

    public void discountBus_and_Trunk() {
        System.out.println("活动期间客车和货车");
        System.out.println("0<=租车天数<3天    原价");
        System.out.println("3<=租车天数<7天    九折");
        System.out.println("7<=d租车天数<30天  八折");
        System.out.println("30<=租车天数<150天 七折");
        System.out.println("租车天数>=150天    六折");
    }
}