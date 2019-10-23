package bai1;
public class runmain {
    public static void main(String[] args){
        person SonNghien=new person();
        person TuBueDe=new person();
        SonNghien.setName("Sơn");
        SonNghien.setAge(21);
        SonNghien.setHobby("..");
        SonNghien.setSex("..");
        TuBueDe.setName("Tú");
        TuBueDe.setAge(20);
        TuBueDe.setHobby("..");
        TuBueDe.setSex("..");
        SonNghien.in();
        TuBueDe.in();
    }
}
