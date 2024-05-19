package com.hewen.shoppingbook;

public class Order {
    public static class order {
        private String  orderid;
        private OrderItem[] items =new OrderItem[3];
        private int total;

        public order() {
        }

    //    public order(String orderid, orderItem[] or, int total) {
    //        this.orderid = orderid;
    //        this.or = or;
    //        this.total = total;
    //    }

        public String getOrderid() {

            return orderid;
        }

        public void setOrderid(String orderid) {

            this.orderid = orderid;
        }

        public OrderItem[] getOr() {
            return items;
        }

        public void setOr(int i, OrderItem item) {
            items[i]=item;
        }

        public void setItems(int i, OrderItem item) {
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }
}
