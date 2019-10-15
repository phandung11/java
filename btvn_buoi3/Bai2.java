package bai2;
//Đề bài: Nhập vào một chuỗi bất kì, hiển thị ra tổng các số trong chuỗi.
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int t=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57)
                t+=s.charAt(i)-48;
        }
        System.out.println(t);
    }
    
}
