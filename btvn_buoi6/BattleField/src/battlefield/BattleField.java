package battlefield;
import java.util.Scanner;
public class BattleField {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("chọn nhân vật: ");
        System.out.println("1: Archers");
        System.out.println("2: Knight");
        int a,x;
        a=sc.nextInt();
        if(a==1){
            archers player=new archers();
            tiger monster=new tiger();
            System.out.println("chọn người chơi trước: ");
            System.out.println("1: player");
            System.out.println("2: monster");
            a=sc.nextInt();
            int i;
            if(a==1) i=0;
            else i=1;
            boolean t=false;
            while(!player.dead() && !monster.dead()){
                if(i%2==0){
                    player.show_info();
                    int z=1;
                    while(z>=0){
                        player.show_skill();
                        System.out.println("choose skill:");
                        x=sc.nextInt();
                        if(x==0) {
                            monster.get_dame(player.hit());
                            z=player.hit();
                        }
                        else {
                            z=player.aim();
                            if(z==2) {
                                monster.get_dame(z);
                            }
                        }
                        if(z>0) break;
                    }
                }
                if(monster.dead()){
                    System.out.print("player thắng");
                    break;
                }
                if(i%2==1){
                    monster.show();
                    System.out.println("choose skill:");
                    x=sc.nextInt();
                    player.get_dame();
                }
                if(player.dead()){
                    System.out.print("monster thắng");
                    break;
                }
                i++;
            }
        }
        else {
            knight player=new knight();
            tiger monster=new tiger();
            System.out.println("chọn người chơi trước: ");
            System.out.println("1: player");
            System.out.println("2: monster");
            a=sc.nextInt();
            int i;
            if(a==1) i=0;
            else i=1;
            boolean t=false;
            while(!player.dead() && !monster.dead()){
                if(i%2==0){
                    player.show_info();
                    int z=1;
                    while(z>=0){
                        player.show_skill();
                        System.out.println("choose skill:");
                        x=sc.nextInt();
                        if(x==0) {
                            monster.get_dame(player.hit());
                            z=player.hit();
                        }
                        else {
                            z=player.shield();
                            if(z>0) {
                                monster.get_dame(z);
                            }
                        }
                        if(z>0) break;
                    }
                }
                if(monster.dead()){
                    System.out.print("player thắng");
                    break;
                }
                if(i%2==1){
                    monster.show();
                    System.out.println("choose skill:");
                    x=sc.nextInt();
                    player.get_dame();
                }
                if(player.dead()){
                    System.out.print("monster thắng");
                    break;
                }
                i++;
            }
        }
    }
    
}
