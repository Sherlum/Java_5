import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task3 {

    public static void main(String[] args) {

        Map<String, String> unsortMap = new HashMap<String, String>();
        unsortMap.put("0", "вы");
        unsortMap.put("1", "об");
        unsortMap.put("2", "вы");
        unsortMap.put("3", "это");
        unsortMap.put("4", "если");
        unsortMap.put("5", "этом");
        unsortMap.put("6", "можете");
        unsortMap.put("7", "можете");
        unsortMap.put("8", "мечтать");
        unsortMap.put("9", "сделать");
    
    System.out.println("Если вы можете мечтать об этом вы можете это сделать\n");

        Map<String, String> treeMap = new TreeMap<String, String>(unsortMap);
        printMap(treeMap);
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

}