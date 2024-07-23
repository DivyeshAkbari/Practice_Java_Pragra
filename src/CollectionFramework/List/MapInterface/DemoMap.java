package src.CollectionFramework.List.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        // Create a HashMap to store license plates
        Map<String, String> licensePlateMapper = new HashMap<>();

        licensePlateMapper.put("DL", "DL1234");
        licensePlateMapper.put("MH", "MH5678");
        licensePlateMapper.put("KA", "KA9101");
        licensePlateMapper.put("TN", "TN1121");
        licensePlateMapper.put("WB", "WB3141");

        System.out.println("DL: " + licensePlateMapper.get("DL"));
        System.out.println("MH: " + licensePlateMapper.get("MH"));

        Set<String> keys = licensePlateMapper.keySet();
        System.out.println("All keys: " + keys);

        for (String key : keys) {
            licensePlateMapper.put(key, "AAA111");
        }

        System.out.println("Updated map: " + licensePlateMapper);

        licensePlateMapper.putIfAbsent("DL","DL12345");

        System.out.println(licensePlateMapper);
    }
}

