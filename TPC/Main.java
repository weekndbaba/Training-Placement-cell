package TPC;

import java.util.*;


public class Main {
    // 1
    // public void maximum_subarray(int[] arr, int n){
    //     int max_sum = arr[0], current_sum= arr[0];
    //     for(int i = 1;i<n;i++){
    //         // current_sum = Math.max(current_sum+arr[i],arr[i]);
    //         // max_sum = Math.max(max_sum,current_sum);
    //         if(current_sum + arr[i]>arr[i]){
    //             current_sum += arr[i];
    //         }else{
    //             current_sum = arr[i];
    //         }
    //         if(current_sum>max_sum){
    //             max_sum = current_sum;
    //         }
    //         }
    //         System.out.println("Maximum subarray sum : "+max_sum);
    //     }

        // 2
        public int maxProduct(int[] nums) {
        int max_product = nums[0],current_product = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(current_product*nums[i]>nums[i]){
                current_product = current_product*nums[i];
            }else{
                current_product = nums[i];
            }
            if(current_product>max_product){
                max_product = current_product;
            }
        }
        return max_product;
    }

    // 3
    public void findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] num3 = new int[nums1.length + nums2.length];
    int i = 0;
    double median = 0.00;

    for (i = 0; i < nums1.length; i++) {
        num3[i] = nums1[i];
    }

    for (int j = 0; j < nums2.length; j++) {
        num3[i + j] = nums2[j];
    }

    for (int y = 0; y < num3.length; y++) {
        System.out.println(num3[y]);
    }
    Arrays.sort(num3); 
    if(num3.length%2 != 0){ 
    median = num3[num3.length/2];
    }else{
        median = (double)(num3[num3.length/2]+num3[num3.length/2 - 1])/2;
    }
    System.out.println("median : "+median);
    // 0 1 2 3 4 5
    
}

    // 4
    public void highest_factor(int[] nums1){
        int max = 0;

        for(int i:nums1){
            int current = 1;
            for(int j = 2;j<=i/2;j++){
                if(i%j==0){
                    current = j;
                }
                if(current > max){
                    max = current;
                }
            }
        }
        System.out.println("highest facotr :"+max);
    }

    // 5
    public void rotate(int[] nums, int k){
        
        int n = nums.length;
        if (n <= 1) return;

        k = k % n;  

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
        // 1 2 3 4 5 
        // 4 5 1 2 3

        // 1 2 3 
        // 1 3 2
        // 3 2 1 
        // 2 1 3
        //

    }
    //
    public static void lexio(int[] nums){
        int n=nums.length,i = n-2;
        while(i>=0&& nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = n-1;
            while (nums[j]<=nums[i]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]=temp;
        }

        int left = i+1,right =n-1;
        while(left<=right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        for(int j:nums){
            System.out.print(j+" ");
        }
    }

    //4
    public void move_zero(int[] nums){
        int n = nums.length,left=0,right=n-1;
        int[] res = new int[n];
        for(int i = 0;i<n;i++){
            if(nums[i]==0){
                res[right]=nums[i];
                right--;
            }else{
                res[left]=nums[i];
                left++;
            }
        }
        for(int i:res){
            System.out.print(i+" ");
        }
    }
    // 0 0 1 2 
    // 1 2 0 0

    // 5
    public void missing(int[] nums){
        int n = nums.length,miss = 0;
        Arrays.sort(nums);
        for(int i =0;i<n-1;i++){
            if(Math.abs(nums[i] - nums[i+1]) != 1){
                System.out.println(nums[i]+1);
                break;
            }
        }
    }
    // 1 2 3 4 

    // 6
    public void dup(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0;i<n;i++){
            
        }
    }

    // 7
    void leader(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0;i<n;i++){
            int j = 0;
            int count = 0;
            for(j = i+1; j<n;j++){
                if(nums[i]<=nums[j]){
                    break;
                }
                count = 1;
            }
            if(count == 1){
            System.out.print(nums[i]+" ");
            }
        }
    }
    // 5 4 2 2

    // 8
    void sorted(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0;i<n;i++){
            res[i] = nums[i];
        }
        Arrays.sort(res);
        for(int i = 0;i<n;i++){
        if(res[i] != nums[i]){
            System.out.println("not sorteed in ascending");
            return;
        }
        }
        System.out.println("sorted innascending");
    }

    //9
    void sum(int[] nums){
        int n = nums.length,left = 0,right =n-1,sumL=0,sumR=0;
        while (left <= right) {
            sumL += nums[left];
            sumR += nums[right];
            left++;
            right--;
            if(sumL==nums[left]&&sumR==nums[right]) {
                System.out.println(nums[left]);
                return;
            }
        }
    }

//     //10
//     void reverse(int[] nums, int k) {
//     int n = nums.length;

//     int left = 0, right = k - 1;
//     while (left < right) {
//         int temp = nums[left];
//         nums[left] = nums[right];
//         nums[right] = temp;
//         left++;
//         right--;
//     }

//     left = k;
//     right = n - 1;
//     while (left < right) {
//         int temp = nums[left];
//         nums[left] = nums[right];
//         nums[right] = temp;
//         left++;
//         right--;
//     }

//     for (int i : nums) {
//         System.out.print(i + " ");
//     }
// }

    //11
    void pair_sum(int[] nums){
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(i!=j){

                }
            }
        }
    }

    // 1
    void subsum1(int[] nums){
    int max = nums[0];

    for(int i = 0; i < nums.length; i++){
        int current = 0;
        for(int j = i; j < nums.length; j++){
            current += nums[j];
            if(current > max){
                max = current;
            }
        }
    }
    System.out.println("sum = " + max);
}

    //-2,1,-3,4,-1}

    //2
    void reverve_group(int[] nums){
         int n = nums.length;
         int left = 0, right = n-1;
        while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }
    for (int i : nums) {
        System.out.print(i + " ");
    }
    }

    //3
    void reverse(int[] nums, int k) {
    int n = nums.length;

    int left = 0, right = k - 1;
    while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }

    left = k;
    right = n - 1;
    while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }

    for (int i : nums) {
        System.out.print(i + " ");
    }
}

    void arr_n(){
        int sum=0,mul=0;
        for(int i = 0;i<=10;i++){
        if(i%2==0){
            sum += i;
            
        }else{
            mul *= i;
            }
        }
        double frac1 = (double)sum/mul;
        int frac = (int)frac1;
        int num = frac;
        int reverse = 0;
        int sum2 = 0;
        int mul2 = 0;
        int n = Integer.toString(num).length();;
        while(num != 0){
            int digit = num%10;
            for(int i = 0;i<n;i++){
                mul2 *= digit;
            }
            sum2 += mul2;
            reverse *= 10 +digit;
            num = num /10;  
        }
        if(sum2 == reverse){
                System.out.println("armsstrong");
        }else{
            System.out.println("not armsstrong");
        }
        


    }
    //
    void  profit_max(int[] nums){
        int max_profit = 0,max_price=Integer.MIN_VALUE,min_price=Integer.MAX_VALUE;
        for(int i =1;i<nums.length;i++){
            if(nums[i]<min_price){
                min_price=nums[i];
                max_price=0;
                for(int j = i+1;j<nums.length;j++){
                    if(nums[j]>max_price){
                        max_price=nums[j];
                    }
                }
            
            }
            else{
                max_profit = Math.max(max_profit,max_price-min_price);
            }

            }
            System.out.println("Profit = "+max_profit);
        }

    public void rotate_by_one(int[] nums){
        
        int n = nums.length;
        if (n <= 1) return;  

        int[] res = new int[n];

        
        for (int i = 0; i < n; i++) {
            res[(i + 1) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i]+" ");
        }
    }

    void max_min(int[] nums){
        int max = Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }else if(min>nums[i]){
                min = nums[i];
            }
        }
        if(min==max){
            System.out.println("min and max = "+max);
        }else{
            System.out.println("min = "+min);
            System.out.println("max = "+max);
        }
    }

    void sum_ave(int[] nums){
        int sum = 0;
        double average= 0.00;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        average = (double)sum/nums.length;
        System.out.println("sum = "+sum+", average = "+average);
    }
    
    public void rotate_left(int[] nums,int k){
        
        int n = nums.length;
        if (n <= 1) return;  

        int[] res = new int[n];

        
        for (int i = 0; i < n; i++) {
            res[(i - k+n) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i]+" ");
        }
    }

    void palindrome_check(String s1){
        String res =  s1.toLowerCase().replaceAll("[^a-z0-9]","");
        int left = 0,right = res.length()-1;
        while(left<=right){
            if(res.charAt(left) != res.charAt(right)){
                System.out.println(res+"not palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println(res+"Palindrome");
    }

    void non_repeating(String s){
        int[] res = new int[256];
        for(int i = 0;i<s.length();i++){
            res[s.charAt(i)]++;
        }
        for(int i = 0;i<s.length();i++){
            if(res[s.charAt(i)]!=1){
                System.out.println(s.charAt(i));
                return;
            }
        }
            System.out.println("-1");
    }
    // 2
    void anagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return;
        }
        Map<Character ,Integer> map = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            if(!map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),1);
            }else{
            map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            }
        }
         for(int i = 0;i<s1.length();i++){
            if(!map.containsKey(s2.charAt(i))){
                System.out.println("not anagram");
                return;
            }
        }
        System.out.println("Anangram");
    }
    //14
    void group_anagram(String[] str){
        Map<String,List<String>> map = new HashMap<>();
        for(String i:str){
            char[] s = i.toLowerCase().toCharArray();
            int[] alpha = new int[26];
            for(char c:s){
                alpha[c-'a']++;
            }
            StringBuffer st = new StringBuffer();
            for(int j = 0;j<alpha.length;j++){
                st.append("#");
                st.append(alpha[j]);
            }
            String n = st.toString();
            if(!map.containsKey(n)){
                map.put(n,new ArrayList<>());
            }
            map.get(n).add(i);
        }
        System.out.println(map.values());
    }

    // 5
    void ch(String[] str){

        for(String i:str){
            char[] c = i.toCharArray();
            int[] alpha = new int[26];

        }

    }
    // void print(int[][] nums){
    //     Arrays.sort(nums);

    //     for(int i = 0; i<nums.length;i++){
    //         Arrays.sort(nums[i]);
    //         for(int j = 0;j<nums[i].length;j++){
    //                 if(nums[i][j] == 0){iop[k,m ]
    //                     int temp = nums[i][2];
    //                     nums[i][2] = nums[i][j];

                        
    //                 }
    //                 System.out.print(nums[i][j]);
    //         }
    //         System.out.println();
    //     }
    // }
    void prime(int n){
        if(n==0){
            System.out.println("0 is not prime");
            return;
        }
        if(n<=1){
            System.out.println("1 is prime"); 
            return;
        }
        for(int i = 2;i<n/2;i++){
            if(n%i == 0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }



    // 1,2,3,4,5,6
    // 3,2,1,6,5,4
    // Main


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main obj = new Main();
    //     // System.out.println("Enter size : ");
    //     // int n = scan.nextInt();
    //     int[] arr = {1,2,3,4,5,6,7};
    //     int[] arr1 = {3,2,1};
    //     //0 1 2 3 4 5 
    //     // for(int i = 0;i<n;i++){
    //     //     System.out.println("Enter arr["+i+"]");
    //     //     arr[i] = scan.nextInt();
    //     // }
    //     // obj.maximum_subarray(arr, n);
    //    // obj.findMedianSortedArrays(arr, arr1);
    //     // obj.highest_factor(arr);

    //     //obj.rotate(arr,3);
    //     //obj.lexio(arr1);

    //     // int[] arr3 = {0,2,0,3,1,4,};
    //     // obj.move_zero(arr3);

    //     int[] arr4 = {5,4,1,2};
    //     //obj.missing(arr4);

    //     //obj.leader(arr4);

    //     int[] arr5 = {1,2,4,5};
    //     // obj.sorted(arr5);

    //     int[] arr6 = {2,2,4,3,1};
    //     // obj.sum(arr6);

    //     int[] arr7 = {1,2,3,4,5,6};
    //     // obj.reverse(arr7, 3);

        int[] arr8 = {-2,1,-3,4,-1};
        // obj.subsum1(arr8);

        //obj.arr_n();
        int[] arr9 = {7,1,4,5,6,4};
        //obj.profit_max(arr9);
        //obj.rotate_by_one(arr9);
        // obj.max_min(arr9);
        // obj.sum_ave(arr9);
        //obj.rotate_left(arr9,3);
       // obj.non_repeating("Gooble");
        //obj.palindrome_check("a man, a plan, a canal:Panama");
        //obj.anagram("tea", "ate");
        // String[] words = {"tea", "ate", "hat", "cat"};
        // obj.group_anagram(words);
        // int [][] ns = { {5, 2, 0, 1}, {1, 2, 0, 5}, {0, 5, 2, 1},{2, 1, 5, 0} };
        // obj.print(ns);
        obj.prime(4);
    }
}
