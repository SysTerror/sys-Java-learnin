package cn.sysror.Demo223DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoMain {
    public static void main(String[] args) throws ParseException { // 抛略模式异常
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = new Date();
        String dateFormat = simpleDateFormat.format(date1); // format 方法
        System.out.println(dateFormat);
        Date date2 = simpleDateFormat.parse("2022-10-22 10:23:20"); // parse 方法
        System.out.println(date2);
    }
}
