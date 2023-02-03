/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class readfile {

    ArrayList<CauHoi> list;
    Scanner sc = new Scanner(System.in);

    public readfile() {
        list = new ArrayList<CauHoi>();
    }

    public void add(CauHoi ch) {
        list.add(ch);
    }

    public void read() {
        File f = new File("cauhoi.txt");
        try {
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < list.size(); i++) {
                pw.println(list.get(i).toString());
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void addFromFile() {
        File f = new File("cauhoi.txt");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String value[] = line.split(";");
                list.add(new CauHoi(value[0], value[1], value[2], value[3], value[4], value[5]));
            }
            System.out.println("Doc File Thanh cong");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void random() {
        Random rd = new Random();
        Scanner sc2 = new Scanner(System.in);
        int num = 0;
        int socau = 0;
        System.out.println("Nhap so cau muon in ra");
        socau = sc.nextInt();
        for (int i = 0; i < socau; i++) {
            num = rd.nextInt(list.size());
            System.out.println(list.get(num));
            System.out.printf("chon cau tra loi:");
            String ans = sc2.nextLine();
            if (ans.compareToIgnoreCase(list.get(num).getAns()) == 0) {
                System.out.println("Ban da tra loi dung");
            } else {
                System.out.println(" ngulon ");
            }
        }
    }

    public void incauhoi() {
        for (CauHoi x : list) {
            System.out.printf("%s%s%s%s%s\n", x.getAns(), x.getQues(), x.getAans(), x.getBans(), x.getCans(), x.getDans());
        }
    }

    void nhap1cauhoi() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
            for (CauHoi x : list) {
                writer.write(x.getAns() + ";" + x.getAans() + ";" + x.getBans() + ";" + x.getCans() + ";" + x.getDans());
                writer.newLine(); //Xuống hàng mới
            }
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void xoa1cauhoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vi tri cua cau hoi muon xoa:");
        int k;
        try {
            do {
                k = sc.nextInt();
            } while (k < 0 || k > list.size());
            System.out.println("Da xoa vi tri " + k);
            list.remove(k);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " xoa khong thanh cong");
        }

    }

    void xoaList() {
        list.clear();
    }

    void suacauhoi() {
        CauHoi ch = new CauHoi();
        ch.nhapCauHoi();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vi tri muon sua:");
        int a;
        try {
            do {
                a = sc.nextInt();
            } while (a < 0 || a > list.size());
            System.out.println("da them vi tri" + a);
            list.add(a, ch);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "sua khong thanh cong");
        }
    }

}
