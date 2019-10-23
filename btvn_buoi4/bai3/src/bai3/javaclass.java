package bai3;
import java.util.Scanner;
public class javaclass {
    Scanner sc=new Scanner(System.in);
    private student stdList[];
    private int ratingStar;
    String s;
    private void InputStudent(){
        System.out.print("nhập số sv trong lớp: ");
        int n=sc.nextInt();
        stdList=new student[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("nhập sv thứ "+(i+1)+":");
            stdList[i].InputInfo();
            sc.nextLine();
        }
    }
    private void ShowStudent(){
        for(int i=0;i<stdList.length;i++){
            stdList[i].ShowInfo();
        }
    }
    public void InputClassInfo(){
        System.out.println("Nhập tên leader: ");
        s=sc.nextLine();
        ratingStar=1000000000;
        InputStudent();
    }
    public void ShowClassInfo(){
        System.out.println("tên leader: "+s);
        System.out.println("ratingstar= "+ratingStar);
        ShowStudent();
    }
}
