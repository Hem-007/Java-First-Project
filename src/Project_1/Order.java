package Project_1;

public class Order {
    int orderId;
    double amount;
    boolean isDelivered;
    Order(int id,boolean isDelivered,double amount){
        this.orderId = id;
        this.amount = amount;
        this.isDelivered = isDelivered;
    }

    void setOrderId(int id){this.orderId = id;}
    void setIsDelivered(boolean isDelivered){this.isDelivered = isDelivered;}
    void setAmount(double amount){this.amount = amount;}
    boolean getIsDelivered(){return isDelivered;}
    double getAmount(){return amount;}
    int getOrderId(){return orderId;}
}
