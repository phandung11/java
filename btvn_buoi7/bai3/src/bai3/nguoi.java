/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class nguoi {
    String hoten;
    String ngaysinh;
    String quequan;
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.print("nhập họ tên: ");hoten=sc.nextLine();
        System.out.print("nhập ngày sinh: ");ngaysinh=sc.nextLine();
        System.out.print("nhập quê quán: ");quequan=sc.nextLine();
    }
    public void xuat(){
        System.out.print("họ tên: "+hoten+" ,");
        System.out.print("ngày sinh: "+ngaysinh+" ,");
        System.out.print("quê quán: "+quequan+", ");
    }
}
