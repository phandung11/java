package bai5;
/*đề bài: Tính tổng a+b (a<=100000000000000000000000000000000000000000, 
b<=100000000000000000000000000000000000000000). Hiển thị kết quả a+b*/
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a,b;
        String ans="";
        a=sc.nextLine();
        b=sc.nextLine();
        if(a.length()<b.length()){
            String x=a;
            a=b;
            b=x;
        }
        int i=a.length()-1;
        int j=b.length()-1;
        int nho=0;
        while(j>=0){
                ans+=((a.charAt(i)-48)+(b.charAt(j)-48)+nho)%10;
                nho=((a.charAt(i)-48)+(b.charAt(j)-48)+nho)/10;
                //System.out.println(ans);
                j--;
                i--;
            }
        while(i>=0){
            ans+=((a.charAt(i)-48)+nho)%10;
            nho=((a.charAt(i)-48)+nho)/10;
            i--;
        }
        for(i=ans.length()-1;i>=0;i--){
            System.out.print(ans.charAt(i));
        }
           
    }
    
}
