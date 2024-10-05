package example.behaviouralDesignPatterns.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context
{
    private Map<String, Integer> contextMap =  new HashMap<>();
    public void put(String key, int value) {
        contextMap.put(key, value);
    }
    public int get(String key) {
        return contextMap.get(key);
    }
}
