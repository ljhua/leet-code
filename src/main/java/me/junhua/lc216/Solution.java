package me.junhua.lc216;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 本题就是在[1,2,3,4,5,6,7,8,9]这个集合中找到和为n的k个数的组合
 */
public class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        backtracking(n, k, 0, 1, path, result);
        return result;
    }

    private void backtracking(int targetSum, int k, int sum, int startIndex, Deque<Integer> path, List<List<Integer>> result) {
        if (sum > targetSum) {
            return;
        }

        if (path.size() == k) {
            if (sum == targetSum) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            sum += i;
            path.addLast(i);
            backtracking(targetSum, k, sum, i + 1, path, result);
            sum -= i;
            path.removeLast();
        }
    }
}
