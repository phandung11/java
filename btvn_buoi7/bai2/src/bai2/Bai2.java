package bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        oto ot=new oto();
        moto mt=new moto();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập thông tin xe oto: ");
        System.out.print("nhập nhãn hiệu: "); ot.nhanhieu=sc.nextLine();
        System.out.print("nhập hãng: "); ot.hang=sc.nextLine();
        System.out.print("nhập năm sản xuất: "); ot.namsx=sc.nextInt();
        System.out.print("nhập số chỗ ngồi: "); ot.sochongoi=sc.nextInt();
        System.out.print("nhập dung tích: "); ot.dungtich=sc.nextInt();
        sc.nextLine();
        System.out.println("nhập thông tin xe moto: ");
        System.out.print("nhập nhãn hiệu: "); mt.nhanhieu=sc.nextLine();
        System.out.print("nhập hãng: "); mt.hang=sc.nextLine();
        System.out.print("nhập năm sản xuất: "); mt.namsx=sc.nextInt();
        System.out.print("nhập phân khối: "); mt.phankhoi=sc.nextInt();
        System.out.println("thông tin xe oto: ");
        System.out.print("nhãn hiệu: "+ot.nhanhieu+", ");
        System.out.print("hãng: "+ot.hang+", ");
        System.out.print("năm sản xuất: "+ ot.namsx+", ");
        System.out.print("số chỗ ngồi: "+ot.sochongoi+", ");
        System.out.println("dung tích: "+ot.dungtich+", ");
        System.out.println("thông tin xe moto: ");
        System.out.print("nhãn hiệu: "+mt.nhanhieu+", ");
        System.out.print("hãng: "+mt.hang+", ");
        System.out.print("năm sản xuất: "+ mt.namsx+", ");
        System.out.print("phân khối: "+mt.phankhoi+", ");
    }
    
}
