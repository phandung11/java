package bai1;
import java.util.Scanner;
class person{
    String hoten;
    String ngaysinh;
    String quequan;
}
class kysu extends person{
    String nganh;
    int namtn;
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.print("nhập họ tên: ");hoten=sc.nextLine();
        System.out.print("nhập ngày sinh: ");ngaysinh=sc.nextLine();
        System.out.print("nhập quê quán: ");quequan=sc.nextLine();
        System.out.print("nhập ngành: ");nganh=sc.nextLine();
        System.out.print("nhập năm TN: ");namtn=sc.nextInt();
        sc.nextLine();
    }
    public void in(){
        System.out.print("họ tên: "+hoten+", ");
        System.out.print("ngày sinh: "+ngaysinh+", ");
        System.out.print("quê quán: "+quequan+", ");
        System.out.print("ngành: "+nganh+", ");
        System.out.println("năm TN: "+namtn);
    }
}
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int x = 0;
        kysu a[] = new kysu[n];
        for(int i=0;i<n;i++){
            a[i]=new kysu();
            System.out.println("-nhập thông tin kỹ sư thứ "+(i+1));
            a[i].nhap();
            x=Math.max(x,a[i].namtn);
        }
        for(int i=0;i<n;i++){
            System.out.println("-thông tin kỹ sư thứ "+(i+1));
            a[i].in();
        }
        System.out.println("thong tin các kỹ sư tốt nghiệp gần đây nhất: ");
        for(int i=0;i<n;i++){
            if(a[i].namtn==x) a[i].in();
        }
    }
}
