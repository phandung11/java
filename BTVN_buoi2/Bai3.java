package bai3;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        String s;
        n=sc.nextInt();
        sc.nextLine();
        s=sc.nextLine();
        float m = new Float(s).floatValue()
        System.out.println("so nguyen : "+n);
        System.out.println("so thuc : "+m);
    }
}
