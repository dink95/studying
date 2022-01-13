package backtracking;

import java.util.*;

public class Permutation {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(new Permutation().solve(nums));
    }

    public List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backtrack(result, tempList, nums);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {


        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));//이유는 모르겠지만 넣을때 new로 넣어죽;ㅣ
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) {
                    continue;
                }//중복 수 제거

                //가지고 있지 않다면 추가
                tempList.add(nums[i]);
                backtrack(result, tempList, nums); //다시 보내기 갯수가 맞나
                tempList.remove(tempList.size() - 1);//끝까지 갔다면 제거~
            }
        }
    }
}