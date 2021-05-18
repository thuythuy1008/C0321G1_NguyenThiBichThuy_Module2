package bai11_java_collection_framework.bai_tap.bai_tap_Dem_So_Lan_Xuat_Hien__Cua_Ki_Tu_Trong_Chuoi;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String str = "abcabcabde";
        String[] arr = str.split("");
        String key = "";
        Integer value;
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
//Cách hiển thị 1:
        System.out.println("Số lần xuất hiện của kí tự trong chuỗi là: ");
        System.out.println("Cách 1: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Kí tự '" + entry.getKey() + "' xuất hiện " + entry.getValue() + " lần");
        }
//Cách hiển thị 2:
        System.out.println("-----------------------------");
        System.out.println("Cách 2: ");
        Set<String> set = map.keySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            key = (String) i.next();
            System.out.println("Kí tự '" + key + "' xuất hiện " + map.get(key) + " lần");
        }
    }
}
