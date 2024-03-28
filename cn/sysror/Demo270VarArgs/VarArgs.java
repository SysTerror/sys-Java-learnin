package cn.sysror.Demo270VarArgs;

public class VarArgs {
    public static void main(String[] args) {
        int res = sum(10, 20, 213, 92613);
        System.out.println(res);
    }

    public static int sum(int...arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

}
