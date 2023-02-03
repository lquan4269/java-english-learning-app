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
public class CauHoi {
    String ans;
    String ques;
    String aans;
    String bans;
    String cans;
    String dans;
    public CauHoi() {
        
    }

    public CauHoi(String ans, String ques, String aans, String bans, String cans, String dans) {
        this.ans = ans;
        this.ques = ques;
        this.aans = aans;
        this.bans = bans;
        this.cans = cans;
        this.dans = dans;
    }

    public String getAns() {
        return ans;
    }

    public String getQues() {
        return ques;
    }

    public String getAans() {
        return aans;
    }

    public String getBans() {
        return bans;
    }

    public String getCans() {
        return cans;
    }

    public String getDans() {
        return dans;
    }
    public void setAns(String ans) {
        this.ans = ans;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public void setAans(String aans) {
        this.aans = aans;
    }

    public void setBans(String bans) {
        this.bans = bans;
    }

    public void setCans(String cans) {
        this.cans = cans;
    }

    public void setDans(String dans) {
        this.dans = dans;
    }

    public void nhapCauHoi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap dap an");
        this.ans=sc.nextLine();
        System.out.println("Nhap cau hoi");
        this.ques=sc.nextLine();
        System.out.println("Nhap dap an a");
        this.aans=sc.nextLine();
        System.out.println("Nhap dap an b");
        this.bans=sc.nextLine();
        System.out.println("Nhap dap an c");
        this.cans=sc.nextLine();
        System.out.println("Nhap dap an d");
        this.dans=sc.nextLine();
    }
    
    @Override
    public String toString()
    {
        return ques+"\n"+aans+"\t"+bans+"\n"+cans+"\t"+dans;
    }

    /**
     *
     * @return
     */

    
}
