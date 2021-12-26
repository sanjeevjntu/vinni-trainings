public class Amazon {

    public static void main(String[] args) {

     Customer customer = new Customer();// JVM 10001 customer

        customer.setName("XXXXX Mattam");
        customer.setMobile("+1 248-XXX-XXXX");
        customer.setAddress("2344, Himaynagar, Hyderabad");
        customer.setPassword("vinni1234");

        System.out.println(customer.getName());
        System.out.println(customer.getMobile());
        System.out.println(customer.getAddress());


      //  System.out.println(customer.vinnieOwnMethod());
        System.out.println(customer.getCustomerPhoneNumberIds());

    }

}
