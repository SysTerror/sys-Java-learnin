package cn.sysror.Demo133String;

public class Demo133String {
	public static void main(String[] args) {
		String strEmpty = new String(); // 引入一个空字符串
		System.out.println(strEmpty);
		
		char[] charArray = {'A', '_', 'P', 'i'};
		String strFromCharArray = new String(charArray); // 从字符数组引入
		System.out.println(strFromCharArray);
		
		byte[] byteArray = {65, 95, 80, 105};
		String strFromByteArray = new String(byteArray); // 从字节数组引入
		System.out.println(strFromByteArray);

		String str = "A_Pi"; // 字串字面常数
		System.out.println(str);
	}
}