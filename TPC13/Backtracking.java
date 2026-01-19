package TPC13;


import java.util.*;
public class Backtracking {
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }


    private static void backtrack(int[] nums, boolean[] used, List<Integer> curr, List<List<Integer>> result){
        if(curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                used[i]=true;
                curr.add(nums[i]);
                backtrack(nums, used, curr, result);
                curr.remove(curr.size()-1);
                used[i]=false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++) nums[i] = sc.nextInt();

        List<List<Integer>> ans = permute(nums);

        for(List<Integer> list:ans){
            System.out.println(list);
        }

        sc.close();
    }
}
