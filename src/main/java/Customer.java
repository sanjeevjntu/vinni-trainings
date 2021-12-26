public class Customer {

    private String name;
    private String mobile;
    private String address;
    private String password;

    //getter() setter() and toAString()

    public void setName(String nameFromAmazon) {
        this.name = nameFromAmazon;//this keyword is current instance
    }

    public void setMobile(String mobileFromAmazonScreen) {
        this.mobile = mobileFromAmazonScreen;//this keyword is current instance
    }
    public void setAddress(String addressFromAmazon) {
        this.address = addressFromAmazon;//this keyword is current instance
    }

    public String getName(){
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String vinnieOwnMethod() {

        String nameAndAddress = "Hello " + this.getName() ;
        return nameAndAddress;
    }

    public String getCustomerPhoneNumberIds(){
        String phonenumbers = "2345 ," + "4456 ," + "12345";
        return phonenumbers;
    }

}
