package com.hewen.VehicleDetail;

public class Bus extends Vehicle {
    private int seatsNum;


    public Bus(String brand, String type, int perRent, String vehicleid, int seatsNum) {
        super(brand, type, perRent, vehicleid);
        this.seatsNum = seatsNum;
        super.setCarType("客车");
    }


    public Bus() {
        super.setCarType("客车");
    }
    public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }

    @Override
    public float calRent(int days) {
        float price = 0;
        if(days >= 0 && days < 3)//0<=days<3 原价
        {
            price = (float) (super.getPerRent() * days);
        }
        else if(days >= 3 && days <7){//3<=days<7 九折
            price = (float) (super.getPerRent() * days *0.9);
        }
        else if(days >=7 && days < 30){//7<=days<30 八折
            price = (float) (super.getPerRent() * days * 0.8);
        }
        else if(days >=30 && days< 150){//30<=days<150 七折
            price = (float) (super.getPerRent() * days * 0.7);
        }
        else if(days >= 150){//days>=150天6折
            price = (float) (super.getPerRent() * days * 0.6);
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
                ", 座位数:'" + seatsNum + "吨" +'\'' +
                ", 牌照:'" + super.getVehicleid() + '\'' +
                ", 日租金:'" + super.getPerRent() + "元"+'\'' +
                ", 租赁状态:" + super.isRentStatus() + '\'' +
                ']';
    }
}