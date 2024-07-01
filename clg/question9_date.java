package clg;

import java.util.Scanner;
class Date{
    int dd;
    int mm;
    int yy;
    Date(int d, int m, int y){
        this.dd = d;
        this.mm = m;
        this.yy = y;
    }
    public static Date add(Date d1, Date d2){
        int res_day=0, res_mon=0, res_year= 0;
        res_day = (d1.dd + d2.dd);
        res_mon = (d1.mm + d2.mm);
        res_year = (d1.yy + d2.yy);
        if (res_day > 31){
            res_day = res_day - 31;
            res_mon += 1;
        }
        if (res_mon > 12){
            res_mon = res_mon - 12;
            res_year +=1;
        }
        return new Date(res_day, res_mon, res_year);
    }
    public void display(){
        System.out.print("Date: ");
        System.out.println(dd+":"+mm+":"+yy);
    }
}

public class question9_date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date dta[] = new Date[2];
        for(int i=0;i<2;i++){
            System.out.print("Enter the value of dd in date object "+(i+1)+": ");
            int day = sc.nextInt();
            System.out.print("Enter the value of mm in date object "+(i+1)+": ");
            int mon = sc.nextInt();
            System.out.print("Enter the value of yy in date object "+(i+1)+": ");
            int year = sc.nextInt();
            dta[i] = new Date(day, mon, year);
        }
        Date res = Date.add(dta[0], dta[1]);
        dta[0].display();
        dta[1].display();
        System.out.println("After adding: ");
        res.display();
        sc.close();
    }
}
