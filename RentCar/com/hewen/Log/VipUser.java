package com.hewen.Log;

import VehicleDetail.Vehicle;

import java.util.LinkedList;

public class VipUser extends Person{
    private LinkedList<Order> OrderList;//VIP用户包含订单属性
    public VipUser(String username, String password) {
        super(username, password);
        super.setIdentity("VIP用户");
        OrderList=new LinkedList<Order>();
    }
    public LinkedList<Order> getOrderList() {
        return OrderList;
    }
    public Double AllOrderMoney(){//该用户所有订单的成交额
        double sum=0;
        for (Object o :OrderList) {
            Order order=(Order) o;
            sum+=order.getMoney();
        }
        return sum;
    }

}