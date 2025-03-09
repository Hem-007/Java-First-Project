package Project_1;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    int id;
    String name;
    String email;

    List<Order> orderList;

    Customer(int id,String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
        this.orderList = new ArrayList<>();
    }

    void setId(int id){this.id = id;}
    void setName(String name){this.name = name;}
    void setEmail(String email){this.email = email;}
    String getName(){return name;}
    String getEmail(){return email;}
    int getId(){return id;}

}
