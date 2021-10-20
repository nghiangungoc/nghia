package lab3;

import java.nio.channels.WritableByteChannel;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

import jdk.internal.joptsimple.internal.Strings;
import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class lab3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int menu;
        do{ 
            System.out.println("1. Kiem tra so nguyen to");
            System.out.println("2. Xuat ra bang cuu chuong");
            System.out.println("3. Nhap mang so nguyen tu ban phim");
            System.out.println("4. Nhap mang ho ten va diem cua sinh vien");
            System.out.print("0.Thoát");
            System.out.println("\nNhập số-->");
            menu = sc.nextInt();
            switch (menu) {
                case 1:{
                    System.out.println("1.Tìm số nguyên tố");
                    int n,dem=0;
                    n= sc.nextInt();
                     for(int i=2;i<n;i++){
                         if(n%i==0){
                             System.out.println(n+" không phải số nguyên tố");
                             dem+=i;
                             break;
                         }
                     }if(dem==0){
                         System.out.println(n+" là số nguyên tố");
                     }  
                    break;
                }
                case 2:{
                    for(int i=1;i<=10;i++){
                        System.out.println("");
                        for(int j=2;j<10;j++){
                            System.out.print(j+"x"+i+"="+i*j+"\t|\t");
                        }
                    }
                    break;
                }
                case 3:{
                    int n,sum=0,tam=0;
                    float tong;
                    do{
                        System.out.println("Nhập n mảng: ");
                        n=sc.nextInt();
                        }while(n<0);
                        //khởi tạo và cấp phát bộ nhớ cho mảng
                        int Array[]=new int[n];
                        for(int i=0;i<n;i++){
                            System.out.print("Phần tử thứ "+i+" :");
                            Array[i]=sc.nextInt();
                        }
                        System.out.println("mảng vừa nhập");
                        for(int i=0;i<n;i++){
                            System.out.print(Array[i]+"\t");
                        }
                        System.out.print("\n");
                        Arrays.sort(Array);
                        System.out.println("Phần tử mảng: "+Arrays.toString(Array));
                        System.out.print("\n");
                        System.out.println("giá trị nhỏ nhất: "+Array[0]);
                        for(int i=0;i<n;i++){
                            if(Array[i]%3==0){
                                sum+=Array[i];
                                tam++;
                            }
                        }
                        tong = (float)sum/tam;
                        System.out.println("Trung bình tổng là: "+tong);
                    break;
                }
                case 4:{
                    int n;
                    n=sc.nextInt();
                    String hoten[]=new String[20];
                    float diem[]=new float[20];
                    String hocLuc[]=new String[20];
                    for(int i=0;i<n;i++){
                        sc.nextLine();
                        System.out.print("mời bạn nhạp họ và tên: ");
                        hoten[i]=sc.nextLine();
                        System.out.print("Nhập điểm: ");
                        diem[i]=sc.nextFloat();
                        if(diem[i]<5){
                            hocLuc[i]="yếu";
                        }else if(diem[i]<6.5){
                            hocLuc[i]="trung bình";
                        }else if(diem[i]<7.5){
                            hocLuc[i]="khá";
                        }else if(diem[i]<9){
                            hocLuc[i]="giỏi";
                        }else{
                            hocLuc[i]="Xuất sắc";
                        }
                    }
                    System.out.println("Mảng mới nhập");
                    for(int i=0;i<n;i++){
                        System.out.printf("Họ Tên: %s; Điểm: %f ;Học Lực: %s\n",hoten[i],diem[i],hocLuc[i]+"\n");
                    }

                    for(int i=0;i<n-1;i++){
                        for(int j=i+1;j<n;j++){
                            if(diem[i]>diem[j]){
                            String ten=hoten[i];
                            hoten[i]=hoten[j];
                            hoten[j]=ten;
                            float tam=diem[i];
                            diem[i]=diem[j];
                            diem[j]=tam;
                            ten=hocLuc[i];
                            hocLuc[i]=hocLuc[j];
                            hocLuc[j]=ten;
                            }
                        }
                    }
                    System.out.println("\nMảng đã xắp sếp");
                    for(int i=0;i<n;i++){
                        System.out.printf("Họ Tên: %s; Điểm: %f ;Học Lực: %s\n",hoten[i],diem[i],hocLuc[i]); 
                    }
                    break;
                }
                case 0:{
                    System.out.println("Hẹn gặp lại");
                    break;
                }
                default:{
                    System.out.println("Nhập sai vui lòng nhạp lại");
                    break;
                }
                    
            }
            
        }while(menu!=0);
    }
}