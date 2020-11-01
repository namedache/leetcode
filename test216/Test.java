package test216;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description: 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 * @author: zhoukun
 * @create: 2020-09-11 13:04
 **/
public class Test {




    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, new ArrayList<>(), k, 1, n);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> list, int k, int start, int n){
        //递归终止的必要条件
        if (list.size()==k || n<= 0 ){
            if (list.size() == k && n==0){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        //通过循环，分别遍历9个子树
        for (int i = start; i <=9; i++) {
            list.add(i);

            dfs(res,list,k,i+1,n-i);

            list.remove(list.size()-1);
        }
    }



}
