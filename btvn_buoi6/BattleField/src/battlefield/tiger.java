package battlefield;
public class tiger {
    float hp=500;
    float amor=20;
    public void fire_blowwing(){
        
    }
    public void get_dame(int x){
        if(x==1){
            if(amor<30){
                hp=hp-30+amor;
                amor=0;
            }
            else amor=amor-30;
            return;
        }
        if(x==2){
            if(amor>=10) amor=amor-10;
            else amor=0;
            if(amor<100){
                hp=hp-100+amor;
                amor=0;
            }
            else amor=amor-100;
            return;
        }
        if(x==3){
            if(amor<40){
                hp=hp-40+amor;
                amor=0;
            }
            else amor=amor-40;
            return;
        }
        if(x==4){
            if(amor>=30) amor=amor-30;
            else amor=0;
            if(amor<100){
                hp=hp-100+amor;
                amor=0;
            }
            else amor=amor-100;
            return;
        }
    }
    public boolean dead(){
        return hp<=0;
    }
    public void show(){
        System.out.println("----------tiger's turn----------");
        System.out.println("tiger's HP: "+hp);
        System.out.println("tiger's AMOR: "+amor);
        System.out.println("----------tiger skill----------");
        System.out.println("0 - attack (mana=0; dame=30; arp=0)");
    }

    void get_dame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
