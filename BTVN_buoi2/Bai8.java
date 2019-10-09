package bai8;
import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("max= "+Math.max(a,b));
        System.out.println("max= "+Math.min(a,b));
    }
}
