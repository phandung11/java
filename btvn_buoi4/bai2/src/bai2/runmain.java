package bai2;
/*Tạo class runmain và thực hiện yêu cầu:
=========Thuộc tính========
    private String name
    private int MP=100
=========Phương thức=======
    public void InputName(String name)
    public void ShowMP()
    public void Bark ()
Trong class runmain
Phương thức InputName: sẽ cho phép truyền tên vào. (hàm này sẽ giống như setter).
Phương thức ShowMP: hiển thị ra MP.
Phương thức Bark: sẽ in ra màn hình Tên + sủa (Lưu ý ko đặt tên trùng với các leader hoặc sp ko ăn án tử nhé :v), đồng thời mất 20 MP. Nếu chưa điền tên sẽ hiển thị Xin lỗi bạn chưa điền tên.
Tạo class RunMain có hàm main trong đó
Tạo ra 1 đối tượng.
Cho đối tượng thực hiện 3 lần phương thức Bark(), sau mỗi lần sử dụng sẽ gọi ra phương thức ShowMP() để kiểm tra số MP còn lại
VD: a.Bark() -> a.ShowMP() -> a.Bark() -> a.ShowMP() -> ....*/
public class runmain {
    public static void main(String[] args) {
        Dog dt=new Dog();
        dt.InputName("kk");
        for(int i=0;i<3;i++){
            dt.Bark();
            dt.ShowMP();
        }
    }
    
}
