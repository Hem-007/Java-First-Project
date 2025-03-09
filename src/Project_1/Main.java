package Project_1;

public class Main {

    public static void main(String[] args) {

        Customer customer_1 = new Customer(7, "hem", "jkalf@gmail.er");
        customer_1.setId(88);
        customer_1.setName("jsdf");

        String email = customer_1.getEmail();

        System.out.println(email);

    }

}