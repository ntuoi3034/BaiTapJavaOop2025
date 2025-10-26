package bt_java_oop3.testcases;

import bt_java_oop3.common.BaseTest;

public class TestCases extends BaseTest {

    // Thuộc tính thông tin đăng nhập
    private String url;
    private String email;
    private String password;

    // Getter và Setter
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    void dataLogin(String url, String email, String password){
        setUrl(url);
        setEmail(email);
        setPassword(password);
    }
    // ==============================
    // Test case 1: Đăng nhập hệ thống
    // ==============================
    public void TC_Login() {
        createDriver();
        System.out.println("===== Test Case: LOGIN =====");
        System.out.println("Step 1: Truy cập vào URL: " + getUrl());
        System.out.println("Step 2: Verify URL hiển thị đúng." + getUrl());
        System.out.println("Step 3: Verify header hiển thị đúng: 'Login'");
        System.out.println("Step 4: Nhập email: " + getEmail());
        System.out.println("Step 5: Nhập mật khẩu: " + getPassword());
        System.out.println("Step 6: Click button Login.");
        System.out.println("Step 7: Verify đã đăng nhập thành công và hiển thị Dashboard.");
        closeDriver();
    }

    // Test case 2: Thêm mới Category
    public void TC_AddCategory() {
        createDriver();
        System.out.println("===== Test Case: ADD CUSTOMER =====");
        System.out.println("Step 1: Truy cập vào đường link: " + getUrl());
        System.out.println("Step 2: Verify URL hiển thị đúng: " + getUrl());
        System.out.println("Step 3: Verify header hiển thị đúng: 'Login'");
        System.out.println("Step 4: Nhập email: " + getEmail());
        System.out.println("Step 5: Nhập mật khẩu: " + getPassword());
        System.out.println("Step 6: Click button Login");
        System.out.println("Step 7: Verify đăng nhập thành công và hiển thị trang Dashboard");

        System.out.println("Step 8: Truy cập menu Customers");
        System.out.println("Step 9: Verify header hiển thị đúng: 'Customers Summary'");
        System.out.println("Step 10: Nhấn button 'New Customer'");
        System.out.println("Step 11: Verify trang title hiển thị đúng: 'Customer Details'");
        System.out.println("Step 12: Nhập thông tin hợp lệ đầy đủ các trường");
        System.out.println("Step 13: Click button Save");
        System.out.println("Step 14: Verify hiển thị thông báo 'Customer added successfully' tại tab Customer Details ở chức năng View");

        System.out.println("Step 15: Truy cập lại menu Customers");
        System.out.println("Step 16: Verify header hiển thị đúng: 'Customers Summary'");
        System.out.println("Step 17: Nhập dữ liệu tìm kiếm của bản ghi vừa thêm mới thành công");
        System.out.println("Step 18: Verify bản ghi mới hiển thị trong danh sách 'Customers Summary'");
        closeDriver();
    }

    // Hàm main chạy kiểm thử
    public static void main(String[] args) {
        TestCases test = new TestCases();
        test.dataLogin("https://crm.anhtester.com/admin/authentication", "admin@example.com","123456" );
        test.TC_Login();
        System.out.println("====================================================");
        test.TC_AddCategory();
    }
}
