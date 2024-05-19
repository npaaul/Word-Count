package com.hewen.VehicleDetail;


public class Trunk extends Vehicle {

    private double load;


    public Trunk(String brand, String type, int perRent, String vehicleid, double load) {
        super(brand, type, perRent, vehicleid);
        this.load = load;
        super.setCarType("货车");
    }



    public double getLoad() {
        return load;
    }
    public void setLoad(double load) {
        this.load = load;
    }
    public Trunk() {
        super.setCarType("货车");
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
                "汽车类型为:'" + super.getCarType() + '\'' +
                ", 品牌:" + super.getBrand() + '\'' +
                ", 型号:'" + super.getType() + '\'' +
                ", 最大载重:'" + load + "吨" +'\'' +
                ", 牌照:'" + super.getVehicleid() + '\'' +
                ", 日租金:'" + super.getPerRent() + "元"+'\'' +
                ", 租赁状态:" + super.isRentStatus() + '\'' +
                ']';
    }
}