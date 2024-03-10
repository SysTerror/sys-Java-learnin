package cn.sysror.Demo126ArrayList;

import java.util.ArrayList;

public class Demo128ArrayListBasic {
	public static void main(String[] args) {
		ArrayList<Integer> listInt = new ArrayList<>();
		listInt.add(514); // 直接传 int（自动装箱，JDK 1.5+）
		int num = listInt.get(0); // 直接用 int 接收（自动拆箱，JDK 1.5+）
        System.out.println(num);
	}
}