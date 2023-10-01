import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TokenStore {
    private static final Map<String, Boolean> tokenStore = new ConcurrentHashMap<>();

    public static void addToken(String token) {
        tokenStore.put(token, true);
    }

    public static void removeToken(String token) {
        tokenStore.remove(token);
    }

    public static boolean isTokenPresent(String token) {
        return tokenStore.containsKey(token);
    }
}
