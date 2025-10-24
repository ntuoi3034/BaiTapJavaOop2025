package bt_java_oop2.company;

public class Company {
    public String name;
    public int age;
    public String gender;
   private String address;
   private String phone;

    public Company(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    //Hàm hiển thị tất cả thông tin
    public void showAllInFo(){
        System.out.println("====Thông tin cá nhân=====");
        System.out.println("Họ tên: " + name );
        System.out.println("Tuổi: "+ age);
        System.out.println("Giới tính: "+ gender);
        System.out.println("Địa chỉ: "+ address);
        System.out.println("Số điện thoại:" + phone);
    }
}
