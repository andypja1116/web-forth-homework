package cn.bupt.edu.contact;

public class stack {
    private static int id;
    private int current_id;
    private String name;
    private String phone;
    private String email;
    private String qq;
    private String address;

    public stack(String name, String phone, String email, String qq, String address){
        this.current_id=id;
        id++;
        this.email=email;
        this.name=name;
        this.qq=qq;
        this.address=address;
        this.phone=phone;
    }
    public stack(){
        this.current_id=id;
    }
    public stack(int id){
        this.id=id;
        this.current_id=id;
    }

    public int getId(){

        return id;
    }

    public int getCurrent_id(){

        return current_id;
    }

    public void setCurrent_id(int current_id){

        this.current_id=current_id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getPhone() {

        return phone;
    }

    public String getEmail() {

        return email;
    }

    public String getQq() {

        return qq;
    }

    public String getAddress() {

        return address;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setQq(String qq) {

        this.qq = qq;
    }

    public void setAddress(String address) {

        this.address = address;
    }
}
