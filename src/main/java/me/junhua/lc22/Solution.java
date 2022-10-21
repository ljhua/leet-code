package me.junhua.lc22;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String cur = "";
        backtracking(n, result, 0, 0, cur);
        return result;
    }

    private void backtracking(int n, List<String> result, int left, int right, String str) {
        if (right > left) {
            return;
        }
        if (left == n && right == n) {
            result.add(str);
            return;
        }
        if (left < n) {
            backtracking(n, result, left + 1, right, str + "(");
        }
        if (right < left) {
            backtracking(n, result, left, right + 1, str + ")");
        }
    }
}
