package bai3;

/*
 Tạo class Student và class JavaClass với:

Student
    =====Thuộc tính=====
    private String name
    private String code
    private int age
=====Phương thức====
    public void InputInfo()
    public void ShowInfo()
JavaClass
=====Thuộc tính=====
    private Student stdList[]
    private int ratingStar
=====Phương thức====
    private void InputStudent()
    private void ShowStudent()
    public void InputClassInfo()
    public void ShowClassInfo()
Trong class Student
    Phương thức InputInfo: Nhập tất cả dữ liệu của Student.
    Phương thức ShowInfo: Hiển thị tất cả thông tin của Student trên một dòng.
VD: "Tên: Thụ, mã sv: 2017602543, tuổi: 20"
Trong class JavaClass
    Phương thức InputStudent: Trong phương thức này có nhập n là số sinh viên trong lớp, dùng for để nhập từng thành viên trong lớp.
    Phương thức ShowStudent: Sử dụng vòng for để hiển thị ra tất sinh viên trong lớp.
    Phương thức InputClassInfo: Nhập tên leader, đánh giá chất lượng ratingStar cho lớp đồng thời gọi phương thức InputStudent.
    Phương thức ShowClassInfo: Hiển thị tên leader và đánh giá ratingStar rồi gọi phương thức ShowStudent.
Tạo class RunMain có hàm main trong đó
Tạo ra 1 đối tượng JavaClass.
Nhập và xuất ra class đó.
 */
public class runmain {
    public static void main(String[] args) {
        javaclass dt=new javaclass();
        dt.InputClassInfo();
        dt.ShowClassInfo();
    }
}
