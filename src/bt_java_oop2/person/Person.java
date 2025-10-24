package bt_java_oop2.person;

import bt_java_oop2.company.Company;

public class Person {
    public static void main(String[] args) {
        Company company = new Company("Nguyễn Thị Hoa mai Lan", 24, "Nữ", "Số 1 phạm hùng", "0385336711");
        //company.showAllInFo();
        System.out.println("==========Hiển thị thông tin nhân viên từ package Company");
        System.out.println("Họ tên: " + company.name);
        System.out.println("Tuổi: " + company.age);
        System.out.println("Giới tính: " + company.gender);

    }
}
