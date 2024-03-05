import entity.User;

public class Main {
    public static void main(String[] args) {
        User api = User.getInstance(1, "A_Pi", 32);
        api.setName("Naicha_SDNC"); // 包含 SDNC，改不成
        System.out.println(api.getName());
    }
}