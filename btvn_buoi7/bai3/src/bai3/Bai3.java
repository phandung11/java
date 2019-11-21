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
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("nhập số sinh viên trong lớp: ");n=sc.nextInt();
        lophoc b=new lophoc();
        b.a=new sinhvien[n];
        sc.nextLine();
        int dem=0;
        System.out.print("nhập mã lớp học: ");b.malh=sc.nextLine();
        System.out.print("nhập tên lớp học: ");b.tenlh=sc.nextLine();
        System.out.print("nhập ngày mở: ");b.ngaymo=sc.nextLine();
        System.out.print("nhập giáo viên: ");b.giaovien=sc.nextLine();
        for(int i=0;i<n;i++){
            b.a[i]=new sinhvien();
            System.out.println("nhập thông tin sing viên thứ "+(i+1));
            b.a[i].nhap();
            System.out.print("nhập mã sinh viên: ");b.a[i].msv=sc.nextLine();
            System.out.print("nhập ngành: ");b.a[i].nganh=sc.nextLine();
            System.out.print("nhập khóa học: ");b.a[i].khoa=sc.nextInt();
            sc.nextLine();
            if(b.a[i].khoa==11) dem++;
        }
        
        for(int i=0;i<n;i++){
            System.out.println("thông tin sing viên thứ "+(i+1));
            b.a[i].xuat();
            System.out.print("mã sinh viên: "+b.a[i].msv+", ");
            System.out.print("ngành: "+b.a[i].nganh+", ");
            System.out.println("khóa học: "+b.a[i].khoa);
        }
        
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++){
                if(b.a[i].khoa>b.a[j].khoa){
                    sinhvien x=new sinhvien();
                    x=b.a[i];
                    b.a[i]=b.a[j];
                    b.a[j]=x;
                }
            }
        
        System.out.println("số sinh viên khóa 11 là: "+dem);
        for(int i=0;i<n;i++){
            System.out.println("thông tin sing viên thứ "+(i+1));
            b.a[i].xuat();
            System.out.print("mã sinh viên: "+b.a[i].msv+", ");
            System.out.print("ngành: "+b.a[i].nganh+", ");
            System.out.println("khóa học: "+b.a[i].khoa);
        }
    }

}
