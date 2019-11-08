/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
public class mon {
    Scanner sc=new Scanner(System.in);
    private String mamon;
    private String tenmon;
    private int sotiet;
    public void nhap(){
        System.out.print("nhap mamon: ");mamon=sc.nextLine();
        System.out.print("nhap tenmon: ");tenmon=sc.nextLine();
        System.out.print("nhap so tiet: ");sotiet=sc.nextInt();
    }

    public Scanner getSc() {
        return sc;
    }

    public String getMamon() {
        return mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public int getSotiet() {
        return sotiet;
    }
    
}
