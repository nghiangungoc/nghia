/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;
/**
 *
 * @author Admin
 */
public class bai_1 {

    /**
     * @param args the command line arguments
     */
    public static void bai_1(){
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        System.out.println("Bài 1: Phương trình bật nhất.");
        System.out.println("Nhập a: ");
        a = sc.nextInt();
        System.out.println("Nhập b: ");
        b =sc.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("phương trình vô sô nghiệm");
            }else{
                System.out.println("phương trình vô nghiệm");
            }
        }else{
            double kq=(double)-b/a;
            System.out.println("phương trình có nhiệm x= "+kq);
        }
    }
    public static void bai_2(){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Bài 2: Phương trình bật hai");
        System.out.println("Nhập a: ");
        a = sc.nextInt();
        System.out.println("Nhập b: ");
        b = sc.nextInt();
        System.out.println("Nhập c: ");
        c = sc.nextInt();
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phương trình vô sô nghiệm");
                }else{
                    System.out.println("Phương trình vô nghiệm");
                }
            }else{
                System.out.println("Phương trình có nghiệm x= "+(float)(-c/b));
            }
        }else{
            double kq = Math.pow(b,2)-4*a*c;
            System.out.println("delta= "+kq);
            if(kq<0){
                System.out.println("Phương trình vô nghiệm");
            }else if(kq==0){
                System.out.println("Phương trình cso nghiệm kép"+-b/(2*a));
            }else{
                System.out.println("Phương trình có 2 nghiệm x1="+((-b+Math.sqrt(kq))/(2*a)));
                System.out.println("Phương trình có 2 nghiệm x2="+((-b-Math.sqrt(kq))/(2*a)));
            }                   
            }
    }
    public static void bai_3(){
        Scanner sc=new Scanner(System.in);
        int sodien;
        do{
            System.out.println("Bài 3: Tính tiền điện");
            System.out.println("Nhạp số điện");
            sodien = sc.nextInt();
            int kq=0;
            if(sodien<50){
                kq=sodien*1000;
                System.out.println("Số tiền là: "+kq);
            }else{
                kq=((sodien-50)*1200)+50*1000;
                System.out.println("Số tiền điện là: "+kq);
            }
        }while(sodien<0);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("Bài 1: phương trình bật nhất.");
            System.out.println("Bài 2: Phương trình bật hai");
            System.out.println("Bài 3: Tính tiền điện");
            System.out.println("Nhập 0 để thoát chương trình");
            System.out.print("======>");
            menu = sc.nextInt();
            switch(menu){
                case 1:{
                    bai_1();
                   break; 
                }
                case 2:{
                    bai_2();             
                    break;
                    }
                case 3:{
                    bai_3();
                    break;
                }
                case 0:{
                    System.out.println("Hẹn găp lại");
                    break;
                }
                default:{
                    System.out.println("Nhập sai vui lòng nhập lại");
                    
                    break;
                }
            }
        }while(menu!=0);
        
        }
        sc.close();
        }
        
        
   
