package test39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Test {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        List<Integer> combine = new ArrayList<Integer>();

        Arrays.sort(candidates);

        dfs(list,target,candidates,combine,0);
        return list;
    }

    public static void dfs(List<List<Integer>> list,int target,int[] candidates,List<Integer> combine,int idx){
        if (idx == candidates.length){
            return;
        }
        if (target == 0){
            list.add(new ArrayList<>(combine));
            return;
        }
        dfs(list, target, candidates, combine, idx + 1);
        if (target-candidates[idx]>=0){
            combine.add(candidates[idx]);
            dfs(list,target-candidates[idx],candidates,combine,idx+1);
            combine.remove(combine.size()-1);
        }

    }


    public String test1(){


        return "";
    }



}
