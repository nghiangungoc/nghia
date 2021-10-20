package bai1.quanly;

import java.util.ArrayList;
import java.util.Scanner;

public class danhsach {
    public static void main(String[] args) {
        private ArrayList<danhsach> ds=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public static void nhap(){
        System.out.println("Nhập tên sản phẩm");
        tem=sc.nextLine();
        ds.add(tem);
        System.out.println("Nhập mã sản phẩm");
        ma=sc.nextLine();
        ds.add(ma);
        System.out.println("Nhập số lượng");
        soluong=sc.nextInt();
        ds.add(soluong);
        System.out.println("Nhập đơn giá");
        dongia=sc.nextFloat();
        ds.add(dongia);
    }
    
    public static void xuat(){
        System.out.println("Danh sách");
        for(int i=0;i<ds.size();i++){
            System.out.println(ds);
        }
    }
    } //main
}//class
