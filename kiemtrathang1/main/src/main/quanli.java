
package main;
import java.util.Scanner;
public class quanli {
    Scanner sc= new Scanner(System.in);
    mon m=new mon();
    sinhvien []a;
    private int n;
    public void nhap(){
        System.out.print("nhap số sinh viên: "); n=sc.nextInt();
        a=new sinhvien[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("nhập sv thứ "+(i+1)+": ");
            a[i].nhap();
        }
        m.nhap();
    }
    public void in(){
        System.out.println("môn "+m.getTenmon());
        System.out.println("mã môn "+m.getMamon());
        System.out.println("số tiết "+m.getSotiet());
        for(int i=0;i<n;i++){
            System.out.println("sinh viên thứ "+(i+1)+": ");
            System.out.print("tên: "+a[i].getTensv());
            System.out.print("msv: "+a[i].getMsv());
            System.out.print("sdt: "+a[i].getSdt());
            System.out.print("so tiet nghi: "+a[i].getSotietnghi());
            if(a[i].getSotietnghi()>=m.getSotiet()/3) System.out.println("cấm thi");
            else System.out.print("ko cấm thi");
        }
    }
}
