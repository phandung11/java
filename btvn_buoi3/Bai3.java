package bai3;
/**Hiển thị Menu với nội dung như bên dưới:

1 Tạo và nhập mảng mới với n số nguyên
2 Hiển thị mảng vừa tạo
3 Thêm một phần tử vào vị trí thứ k
4 Xóa một phần tử ở vị trí thứ k
5 Đảo ngược mảng:
VD: {3,1,2,4,5} -> {5,4,2,1,3}
6 Hiển thị số a[1] và các số chia hết cho a[1]
7 Thoát.
⚠️ Sử dụng vòng lặp, switch case, hàm và mảng để làm bài tập này.**/
import java.util.Scanner;
public class Bai3 {
    static int n;
    static int []a;
    static Scanner sc=new Scanner(System.in);
    static void nhap(){
        System.out.print("Nhập số phần tử: ");
        n=sc.nextInt();
        a=new int[n+100];
        for(int i=0;i<n;i++) {
            System.out.print("a["+i+"]= ");
            a[i]=sc.nextInt();
        }
    }
    static void in(){
        System.out.print("mảng: ");
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
        System.out.println();
    }
    static void them(){
        int k,x;
        System.out.print("nhập vị trí chèn: ");
        k=sc.nextInt();
        System.out.print("nhập phần tử cần chèn: ");
        x=sc.nextInt();
        for(int i=n;i>k;i--) a[i]=a[i-1];
        a[k]=x;
        n++;
        in();
    }
    static void xoa(){
        int k;
        System.out.print("nhập vị trí xóa: ");
        k=sc.nextInt();
        for(int i=k;i<n-1;i++) a[i]=a[i+1];
        n--;
        in();
    }
    static void đảo_ngược(){
        for(int i=0;i<n/2;i++){
            int x=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=x;
        }
        in();
    }
    static void cau6(){
        System.out.print("các số chia hết cho "+a[1]+"(a[1]):");
        for(int i=0;i<n;i++) if(a[i]%a[1]==0) System.out.print(a[i]+" ");
        System.out.println();
    }
    static void t(){
        //em dùng hàm này để dừng màn hình xem kết quả
        int x;
        do{
            System.out.print("ấn 0 để tiếp tục");
            x=sc.nextInt();
        }
        while(x!=0);
    }
    public static void main(String[] args) {
        int x=0;
        while(x!=7){
            System.out.println("menu:\n"+"1 Tạo và nhập mảng mới với n số nguyên\n" +
    "2 Hiển thị mảng vừa tạo\n" +
    "3 Thêm một phần tử vào vị trí thứ k\n" +
    "4 Xóa một phần tử ở vị trí thứ k\n" +
    "5 Đảo ngược mảng:\n" +
    "6 Hiển thị số a[1] và các số chia hết cho a[1]\n" +
    "7 Thoát.");
            System.out.print("nhập 1 số: ");
            x=sc.nextInt();
            switch(x){
                case 1:nhap();t();break;
                case 2:in();t();break;
                case 3:them();t();break;
                case 4:xoa();t();break;
                case 5:đảo_ngược();t();break;
                case 6:cau6();t();break;
            }
        }
    }
    
}
