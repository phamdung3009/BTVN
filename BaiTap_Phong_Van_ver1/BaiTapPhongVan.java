package org.example.ontap.baitapvenha.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaiTapPhongVan {
    public List<String> listString(String input) {
        String[] arr = input.split(" ");
        List<String> list = new ArrayList<>();
        for (String sub : arr) {
            list.add(sub);
        }
        System.out.println("Sau khi tach ra thanh 1 list::: ");
        System.out.println(list);
        return list;
    }
    public Map<String, Integer> countSubstring(String input) {
        List<String> list = listString(input);
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }
    public static void main(String[] args) {
        String input = "hello hi my name hello hi my hihe";
        MapSubString mapSubString = new MapSubString();
        mapSubString.listString(input);
        Map<String, Integer> map = mapSubString.countSubstring(input);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
