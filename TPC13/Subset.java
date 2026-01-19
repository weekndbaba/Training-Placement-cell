package TPC13;

import java.util.*;
public class Subset {
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(),result);
        return result;
    }

    private static void backtrack(int index, int[] nums, List<Integer> curr, List<List<Integer>> result){
        result.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(i+1, nums, curr, result);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++) nums[i]=sc.nextInt();

        List<List<Integer>> ans = subsets(nums);

        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
}
