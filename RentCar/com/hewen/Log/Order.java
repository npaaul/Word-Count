package com.hewen.Log;

import  VehicleDetail.*;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order implements Serializable {//订单类
    private Vehicle vehicle;//订单车辆信息
    private Date date;      //订单日期
    //private int RentDays;//订单期限天数
    private Double money;//该订单的租金

    public Order(Vehicle vehicle, Date date) {
        this.vehicle = vehicle;
        this.date = date;
        setMoney();
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String time=sdf.format(date);
        return "租赁车辆信息：\n"+vehicle+"\n订单日期："+time+"\n实际付款："+money;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney() {
        this.money =(double) vehicle.calRent(vehicle.getRentDays());
    }
}