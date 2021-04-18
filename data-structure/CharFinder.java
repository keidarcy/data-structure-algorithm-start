package com.xyh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    public char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();

        for (var ch: chars){
//            if(map.containsKey(ch)) {
//                var count = map.get(ch);
//                map.put(ch, count + 1);
//            } else {
//                map.put(ch, 1);
//            }

            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        System.out.println(map);

        for (var ch: chars) {
            if(map.get(ch) ==1) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }

    public char findFirstRepeatedChar(String str) {
        var chars = str.toCharArray();

        Set<Character> set = new HashSet<>();
        for(var ch: chars) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
