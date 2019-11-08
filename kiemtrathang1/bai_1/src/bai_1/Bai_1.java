/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;
import java.util.Scanner;
public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int dem=0,t=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57 && s.charAt(i)%2==0){
                dem++;
                t+=s.charAt(i)-48;
            }
        }
        System.out.println("số các số chẵn là: "+dem);
        System.out.println("tổng các số chẵn là: "+t);
    }
    
}
