/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class menu {

    public menu() throws Exception {}
    
    public void m(){
        int choice;
        readfile rd = new readfile();
        CauHoi ch;
        rd.addFromFile(); //gọi phương thức đọc dữ liệu từ file text vào list
        do {
            System.out.printf("======MENU=======\n");
            System.out.printf("1/In danh sach cau hoi\n");
            System.out.printf("2/lam bai trac nghiem\n");
            System.out.printf("3/them cau hoi\n");
            System.out.printf("4/xoa cau hoi\n");
            System.out.printf("5/sua cau hoi\n");
            System.out.printf("6/Thoát\n");
            System.out.printf("------------------\n");
            System.out.printf("Chọn chức năng thực hiện:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    rd.incauhoi();
                    break;
                case 2:
                    rd.random();
                    break;
                case 3:
                    rd.nhap1cauhoi();
                    break;
                case 4:
                    rd.xoa1cauhoi();
                    break;
                case 5:
                    rd.suacauhoi();
                    break;
                case 6: ;
                    return ;
                    
                default:
                    System.out.println("Chọn sai chức năng\n");
            }
        } while (choice != 6);

    }
}
