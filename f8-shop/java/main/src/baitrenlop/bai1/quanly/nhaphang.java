package bai1.quanly;

import java.util.ArrayList;
import java.util.Scanner;





public class nhaphang {
    String tem;
    String ma;
    int soluong;
    float dongia;
    private ArrayList ds=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void nhap(){
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
    
    public void xuat(){
        System.out.println("Danh sách");
        for(int i=0;i<ds.size();i++){
            System.out.println(ds);
        }
    }
    public static void main(String[] args) {
        ds.nhap();
    }
    public nhaphang(String tem, String ma, int soluong, float dongia) {
        this.tem = tem;
        this.ma = ma;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    public String getTem() {
        return tem;
    }
    public void setTem(String tem) {
        this.tem = tem;
    }
    public String getMa() {
        return ma;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public float getDongia() {
        return dongia;
    }
    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

}
