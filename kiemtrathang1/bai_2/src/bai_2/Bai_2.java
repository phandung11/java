
package bai_2;
import java.util.Scanner;
public class Bai_2 {
    static void in(float []a,int n){
        System.out.print("mảng a: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    static boolean check(int x){
        int s=0;
        for(int i=1;i<=x/2;i++){
            if(x%i==0) s+=i;
        }
        if(s==x) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("nhập số lượng phần tử của mảng: ");
        n=sc.nextInt();
        float []a=new float[n+100];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i]=sc.nextFloat();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++)
                if(a[i]<a[j]){
                    float x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
        }
        in(a,n);
        int x=sc.nextInt();
        if(check(x)){
            a[n]=x;
            n++;
        }
        else{
            System.out.println(x+"ko phải số hoàn hảo");
        }
        in(a,n);
    }
}
