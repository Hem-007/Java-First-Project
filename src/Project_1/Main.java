package Project_1;

public class Main {

    public static void main(String[] args) {

        Customer customer_1 = new Customer(7, "hem", "jkalf@gmail.er");

        String email = customer_1.getEmail();
        Order order = new Order(7,true,72000);
        System.out.println(order.getIsDelivered());

        System.out.println(email);

    }

}