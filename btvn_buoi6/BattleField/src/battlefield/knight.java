package battlefield;
public class knight {
    float hp=150;
    float mp=100;
    float amor=20;
    public int hit(){
        return 3;
    }
    public int shield(){
        if(mp>=50) {
            mp=mp-50;
            return 4;
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
        System.out.println("----------knight's turn----------");
        System.out.println("knight's HP: "+hp);
        System.out.println("knight's MP: "+mp);
        System.out.println("knight's AMOR: "+amor);
    }
    public void show_skill(){
        System.out.println("----------knight skill----------");
        System.out.println("0 - attack (mana=0; dame=40; arp=0)");
        System.out.println("1 - demacian justice (mana=50; dame=100; arp=30)");
    }
}
