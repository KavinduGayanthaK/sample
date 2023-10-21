package lk.ijse.sample.model;

public class CustomerModel {
    private String id;
    private String name;
    private String address;
    private String number;

    public CustomerModel( String name, String address,String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public String getId() {
        return id;
    }
    public  void setId(String id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public  String  getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
}
