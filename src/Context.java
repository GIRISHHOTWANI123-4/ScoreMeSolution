import java.util.*;
public class Context {
    private final Map<String,Boolean> processDataMap = new HashMap<>();

    public void set(String key, Boolean value) {
        processDataMap.put(key, value);
    }
    public boolean get(String key) {
        return processDataMap.get(key);
    }
}
