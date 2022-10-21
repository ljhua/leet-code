package me.junhua.lc17;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> letterCombinations(String digits) {

        String[] mappingString = new String[]{
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz", // 9
        };

        List<String> result = new ArrayList<>();
        String s;

        if (digits.length() == 0) {
            return result;
        }
//        backtracking();
        return null;
    }
}
