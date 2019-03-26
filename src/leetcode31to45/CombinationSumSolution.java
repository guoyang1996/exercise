package leetcode31to45;

import java.util.*;

/**
 * @program: exercise
 * @description: 拆分整数为候选集中的数
 * @author: guoyang
 * @create: 2019-03-24 10:01
 **/
public class CombinationSumSolution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        HashSet[] answers = new HashSet[target];
        for (int i = 1; i <= target; i++) {
            answers[i - 1] = new HashSet<ArrayList<Integer>>();
            for (int j = 0; j < candidates.length; j++) {
                if (candidates[j] > i) {
                    break;
                } else if (candidates[j] == i) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(i);
                    answers[i - 1].add(list);
                } else {
                    int subTarget = i - 1 - candidates[j];
                    for (Object list : answers[subTarget]) {
                        ArrayList<Integer> newList = new ArrayList<>();
                        newList.add(candidates[j]);
                        newList.addAll((ArrayList) list);
                        answers[i - 1].add(newList);

                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(answers[target - 1]);
        return ans;
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combinationSum2(candidates, 0, target);
    }

    List<List<Integer>> combinationSum2(int[] candidates, int index, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = index; i < candidates.length; i++) {
            if (target == candidates[i]) {
                List<Integer> list = new ArrayList<>();
                list.add(target);
                ans.add(list);

            } else if (target > candidates[i]) {
                List<List<Integer>> lists = combinationSum2(candidates, i + 1, target - candidates[i]);
                for (List<Integer> list : lists) {
                    List<Integer> nlist = new ArrayList<>(list);
                    nlist.add(candidates[i]);
                    ans.add(nlist);
                }
            } else {
                break;
            }
        }
        List<List<Integer>> ansL = new ArrayList<>();
        ansL.addAll(ans);
        return ansL;

    }

    public static void main(String[] args) {
        System.out.println(new CombinationSumSolution().combinationSum2(new int[]{1, 1, 3, 5, 6, 7}, 7));
    }


}
