package dailyleetcode;

import  java.util.*;
public class Main39 {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<Integer> combine = new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(candidates);

            dfs(combine, result, target, 0, candidates);
            return result;
        }

        public void dfs(List<Integer> combine, List<List<Integer>> result, int target,
                        int idx, int[] candidates){
            if(idx == candidates.length){
                return;
            }

            if(target == 0){
                result.add(new ArrayList<>(combine));
                return;
            }

            // decide whether we use this number
            // we don't use this number
            dfs(combine, result, target, idx + 1, candidates);

            // if we use this number
            // first check if we can use this number
            if(target >= candidates[idx]){
                combine.add(candidates[idx]);
                dfs(combine, result, target - candidates[idx], idx, candidates);
                combine.remove(combine.size() - 1);
            }

        }
    }
}
