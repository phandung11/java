package bai1;
/*Tạo class Person như bảng trên và thực hiện yêu cầu:

Person
    =====Thuộc tính=====
    private String name
    private int age
    private String hobby
    private String sex
=====Phương thức====
    Không có
Trong class Person
Tạo getter, setter cho các thuộc tính.
Tạo class RunMain có hàm main trong đó
Tạo ra 2 đối tượng Person SonNghien và Person TuBueDe.
Dùng Setter truyền vào giá trị thông tin cho 2 đối tượng (Không phải nhập).
Hiển thị thông tin 2 đối tượng.*/
public class person {
    private String name;
    private int age;
    private String hobby;
    private String sex;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getHobby() {
        return hobby;
    }
    public String getSex() {
        return sex;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    void in() {
        System.out.println("tên:" +name);
        System.out.println("tuổi:" +age);
        System.out.println("Hobby:" +hobby);
        System.out.println("sex:" +sex);
    }
}

