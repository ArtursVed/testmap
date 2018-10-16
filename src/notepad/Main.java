package notepad;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<String, String> translation = new TreeMap<>();


        translation.put("two", "два");
	    translation.put("one", "один");
        translation.put("home", "дом");
        translation.put("mouse", "мышь");

        System.out.println(translation.get("home"));

        System.out.println(translation.size());

        for(String k : translation.keySet()){
            System.out.printf("%s ---> %s\n", k,translation.get(k));

        }
    }
}
