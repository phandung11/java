package bai2;
public class Dog {
    private String name;
    private int MP=100;
    public void InputName(String Name){
        name=Name;
    }
    public void ShowMP(){
        System.out.println(MP);
    }
    public void Bark (){
        MP-=20;
        if(name==null) System.out.println("xin lỗi bạn chưa điền tên");
        else System.out.println(name+" sủa");
    }
}
