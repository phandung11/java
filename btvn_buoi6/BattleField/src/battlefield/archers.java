package battlefield;
public class archers {
    float hp=150;
    float mp=150;
    float amor=10;
    public int hit(){
        return 1;
    }
    public int aim(){
        if(mp>=30) {
            mp=mp-30;
            return 2;
        }
        else System.out.println("ko đủ MP");
        return 0;
    }
    public void get_dame(){
        if(amor<30) {
            hp=hp-30+amor;
            amor=0;
        }
        else amor=amor-30;
    }
    public boolean dead(){
        return hp<=0;
    }
    public void show_info(){
        System.out.println("----------archers's turn----------");
        System.out.println("archers's HP: "+hp);
        System.out.println("archers's MP: "+mp);
        System.out.println("archers's AMOR: "+amor);
    }
    public void show_skill(){
        System.out.println("----------archers skill----------");
        System.out.println("0 - attack (mana=0; dame=30; arp=0)");
        System.out.println("1 - Spray and Pray (mana=30; dame=100; arp=10)");
    }
}
