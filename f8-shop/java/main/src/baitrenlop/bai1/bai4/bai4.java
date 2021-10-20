package bai4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;




public class bai4 {

    Scanner sc= new Scanner(System.in);
    public static double tinhtong(double a, double b){
    return a+b;
    }
    public static void nhan() {
    int a=8,b=9
    System.out.println(a*b);
    }
    public static void main(String[] args){
        ArrayList<sinhvien> dssv=new ArrayList<>();
        sinhvien sv1= new sinhvien("pk02174", "abc", 10);
        dssv.add(sv1);
        dssv.add(new sinhvien("pk02174","nguyen van nghia", 0));
        System.out.println(dssv.get(0).masv);
        System.out.println(dssv.get(0).tensv);
        System.out.println(dssv.get(0).tuoi);
        for(int i=0;i<dssv.size();i++){
            System.out.println(dssv.get(i).masv);
            System.out.println(dssv.get(i).tensv);
            System.out.println(dssv.get(i).tuoi);
        }
        // int nhap;
        // do{
        //     System.out.println("nhập tên sv: ");
            

        // }while(nhap!=0);
        //tạo 1 đối tượng sv xong add vào dssv
        



       /* ArrayList<Integer> mangso= new ArrayList<Integer>();
        mangso.add(6);
        mangso.add(5);
        mangso.add(8);
        mangso.add(10);

        mangso.size();
        mangso.remove(2);
        mangso.set(0,30);//lệnh thay thế
        System.out.println(mangso);//xuất mảng*/
    }
}
