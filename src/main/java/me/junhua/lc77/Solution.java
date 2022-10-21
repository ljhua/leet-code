package me.junhua.lc77;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合
 */
public class Solution {

    public List<List<Integer>> combine(int n, int k) {

        // 存放符合条件结果的集合
        List<List<Integer>> result = new ArrayList<>();

        // 用来存放符合条件的结果
        Deque<Integer> path = new ArrayDeque<>();

        backtracking(n, k, 1, path, result);
        return result;
    }

    private void backtracking(int n, int k, int startIndex, Deque<Integer> path, List<List<Integer>> result) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        // 控制树的横向遍历
//        for (int i = startIndex; i <= n; i++) {
        // 剪枝操作
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            // 处理节点
            path.addLast(i);

            // 递归：控制树的纵向遍历，注意下一层搜索要从i+1开始
            backtracking(n, k, i + 1, path, result);

            // 回溯，撤销处理的节点
            path.removeLast();
        }
    }
}
