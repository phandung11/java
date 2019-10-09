package bai9;
import java.util.Scanner;
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s;
        s=sc.nextLine();
        float a = new Float(s).floatValue();
        s=sc.nextLine();
        float b= new Float(s).floatValue();
        if(a==0){
            if(b==0) System.out.println("pt vo so nghiem");
            else System.out.println("pt vo nghiem");
        }
        else {
            System.out.println("pt co nghiem: "+(-b/a));
        }
    }
}
