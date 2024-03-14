package cn.sysror.Demo224HowLongYouLive;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DemoMain {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的出生日期：(yyyy-MM-dd)");
        Date birthdayDate = new SimpleDateFormat("yyyy-MM-dd").parse(sc.next());
        long liveTimeMS = new Date().getTime() - birthdayDate.getTime();
        System.out.println("【恭喜】你已经活了 " + liveTimeMS / 1000 / 60 / 60 / 24 + " 天！");
    }
}
