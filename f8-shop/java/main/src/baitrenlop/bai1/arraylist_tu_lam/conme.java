package arraylist_tu_lam;

import java.util.ArrayList;
import java.util.Scanner;

public class conme {//khai báo class
    private ArrayList<Double> list=new ArrayList<>();
    //định nghĩa phương thúc nhập
    public void nhap(){
        Scanner s=new Scanner(System.in);//khai báo luồn nhập dữ liệu
        String qd;//quyết định nhập
        boolean yn=true; //biên điều khiển nhập
        while(yn){
            System.out.println("mời nhập số: ");
            Double x= Double.parseDouble( s.nextLine());//nhập số từ bàn phím
            //dua so vua nhap
            list.add(x);
            System.out.println("Enter->nhập tiếp: n+Enter->thoát");
            qd=s.nextLine();
            switch(qd){
                case "y":{
                    yn=true;
                    break;
                }
                case "n":{
                    yn=false;
                    break;
                }
                //  default:
                //  System.out.println("nhập lại");
            }
        }
    }
    public void xuat(){//định nghĩa hàm xuất
        System.out.println("Danh sách các phần tử vừa nhập");
        double tong=0;
        for(double i: list){//lấy ra phần tử trong list
            tong+=i;
        }
        System.out.println(list);
        System.out.println("Tổng là: "+tong);
    }
}
