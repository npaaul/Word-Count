package com.hewen.VehicleDetail;

public class Car extends Vehicle {

    public Car() {
        super.setCarType("轿车");
    }

    public Car(String brand, String type, int perRent, String vehicleid) {
        super(brand, type, perRent, vehicleid);
        super.setCarType("轿车");
    }


    @Override
    public float calRent(int days) {
        float price = 0;
        if(days >= 0 && days <= 7){//0<=days<=7天原价
            price = (float) (super.getPerRent() * days);
        }
        else if(days > 7 && days <= 30){//7<days<=30九折
            price = (float) (super.getPerRent() * days * 0.9);
        }
        else if(days > 30 && days <= 150){//30<days<=150八折
            price = (float) (super.getPerRent() * days * 0.8);
        }
        else if(days > 150){//days>150天7折
            price = (float) (super.getPerRent() * days * 0.7);
        }
        else System.out.println("天数输入有误!");//days<0
        return price;
    }

    @Override
    public String toString() {
        return "[" +
                "序号'" + super.getIndex() + '\'' +
                "汽车类型为'" + super.getCarType() + '\'' +
                ", 品牌:" + super.getBrand() + '\'' +
                ", 型号:'" + super.getType() + '\'' +
                ", 牌照:'" + super.getVehicleid() + '\'' +
                ", 日租金:'" + super.getPerRent() + "元"+'\'' +
                ", 租赁状态:" + super.isRentStatus() + '\'' +
                ']';
    }
}