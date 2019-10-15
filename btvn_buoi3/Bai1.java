package bai1;
//Đề bài: Nhập n số nguyên. Tìm phần tử lớn thứ 3 (lớn gần nhất, chỉ nhỏ hơn 2 số) trong mảng.
import java.util.Scanner;
import java.util.Arrays;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Arrays.sort(a);
        int dem=0;
        int i=n-1;
        while(i>0)
        {
            if(a[i]!=a[i-1]) dem++;
            if(dem==2) break;
            i--;
        }
        System.out.println(a[i-1]);
    }
    
}
