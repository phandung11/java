package bai4;

/*đề bài:Một chuỗi được gọi là thân thiện khi nó có hello trong chuỗi. Bạn được 
phép bỏ đi 1 kí tự bao nhiêu lần cũng được cho đến khi nào tìm thấy hoặc không 
tìm thấy chữ hello. Hãy in ra Yes nếu có thể bỏ các kí tự và tìm được chữ hello
trong chuỗi và No nếu ngược lại.*/
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a="hello";
        String b=sc.nextLine();
        int j=0;
        for(int i=0;i<b.length();i++){
                if(b.charAt(i)==a.charAt(j)) j++;
                if(j==a.length()) break;
        }
        if(j==a.length()) System.out.println("YES");
        else System.out.println("NO");
    }
}
