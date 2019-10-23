package bai3;
import java.util.Scanner;
public class student {
    Scanner sc=new Scanner(System.in);
    private String name;
    private String code;
    private int age;
    public void InputInfo(){
        System.out.print("nhap tên: ");
        name=sc.nextLine();
        System.out.print("nhap MSV: ");
        code=sc.nextLine();
        System.out.print("nhap tuổi: ");
        age=sc.nextInt();
    }
    public void ShowInfo(){
        System.out.println("Tên: "+name+", mã sv: "+code+", tuổi: "+age);
    }
}
