package bai6;
import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1,m1;
        n1=sc.nextInt();
        m1=sc.nextInt();
        int s1=n1+m1;
        sc.nextLine();
        String s;
        s=sc.nextLine();
        float n2 = new Float(s).floatValue();
        s=sc.nextLine();
        float m2= new Float(s).floatValue();
        float s2=n2+m2;
        float s3=n1+n2;
        System.out.println("n1+m1="+s1);
        System.out.println("n2+m2="+s2);
        System.out.println("n1+n2="+s3);
    }
}
