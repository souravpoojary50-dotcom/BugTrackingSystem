import java.util.*;

public class LoginSystem {
    private static Map<String, String> users = new HashMap<>();

    static {
        users.put("admin", "1234");
        users.put("dev", "1234");
    }

    public static boolean login(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}