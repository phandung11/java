/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
public class sinhvien {
    Scanner sc=new Scanner(System.in);
    private String tensv;
    private String msv;
    private String sdt;
    private int sotietnghi;
    public void nhap(){
        System.out.print("nhap tên: ");tensv=sc.nextLine();
        System.out.print("nhap msv: ");msv=sc.nextLine();
        System.out.print("nhap sdt: ");sdt=sc.nextLine();
        System.out.print("nhap so tiet nghi: ");sotietnghi=sc.nextInt();
    }

    public Scanner getSc() {
        return sc;
    }

    public String getTensv() {
        return tensv;
    }

    public String getMsv() {
        return msv;
    }

    public String getSdt() {
        return sdt;
    }

    public int getSotietnghi() {
        return sotietnghi;
    }
    
}
