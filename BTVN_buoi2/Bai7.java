package bai7;
import java.util.Scanner;
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("max= "+Math.max(a,Math.max(b,c)));
        System.out.println("max= "+Math.min(a,Math.min(b,c)));
    }
}
