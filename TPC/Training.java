import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;


public class Training {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // // frequency of word
        // String str1 = "banana";
        // char[] str2 = str1.toCharArray();
        // int[] alpa = new int[26];
        // for(int i = 0;i<str2.length; i++){
        //     alpa[str2[i]-'a']++;
        // }
        // for(int i = 0; i<alpa.length;i++){
        //     if(alpa[i] !=0){
        //         System.out.println("Frequency of "+(char)('a'+i)+" : "+alpa[i]);
        //     }
        // }
        // for(int i = 0; i<alpa.length;i++){
        //     if(alpa[i] ==1){
        //         System.out.println("Frequency of "+(char)('a'+i)+" : "+alpa[i]);
        //         break;
        //     }
        // }

        // HashMap<String,Integer> map = new HashMap<>();


        // // substring
        // String s1 = "abc";
        // char[] st1 = s1.toCharArray();
        // String s2 = "abcxbyc";
        // char[] st2 = s2.toCharArray();

        // int j = 0;
        // for(int i = 0; i<st2.length; i++){
        //     if(st2[i]==st1[j]){
        //             j++;
        //         }
        //         if(j==st1.length){
        //     System.out.println("yes");
        // }
        // }

        // // print a with occureence digits
        // String s3 = "aaabbc";
        // char[] st3= s3.toCharArray();
        // int[] alpa = new int[26];
        // for(int i = 0;i<st3.length; i++){
        //     alpa[st3[i]-'a']++;
        // }
        // for(int i = 0; i<alpa.length;i++){
        //     if(alpa[i] !=0){
        //         System.out.print((char)('a'+i)+""+alpa[i]);
        //     }
        // }
        

        // // covert the cases
        // String s4 = "yAYa";
        // String s5 = "";
        // for(int i = 0; i<s4.length();i++){
        //     char b = s4.charAt(i);
        //     if(b>= 'A'&& b <= 'Z'){
        //         s5 += (char)(b+32);
        //     }else if(b >= 'a' && b <= 'z'){
        //         s5 += (char)(b-32);
        //     }else{
        //         s5 += b;
        //     }
        // }
        // System.out.println(s5);

        // // spaces
        // String s6 = "hi my name is";
        // System.out.println(s6.replace(" ",""));

        // // highest occusrence

        // String s7 = "testcase";
        // char[] st7 = s7.toCharArray();
        // int[] alpa = new int[26];
        // for(int i = 0; i<st7.length;i++){
        //     alpa[st7[i]-'a']++;
        // } 
        // int max = 0;
        // int j;
        // int z = 0;
        // for(j = 0;j<alpa.length;j++){
        //     if(alpa[j] >= max ){
        //         max = alpa[j];
        //         z = j;
        //     }
        // }
        // System.out.println((char)('a'+z));

    //     //isogram
    //     String s8 = "machine";
    //     char[] st8 = s8.toCharArray();
    //     int[] alpa = new int[26];
    //     Boolean check = false;
    //     for(int i = 0; i<st8.length;i++){
    //         alpa[st8[i]-'a']++;
    //     } 
        
    //     for(int j = 0;j<alpa.length;j++){
    //         if(alpa[j] > 1 ){
    //             System.out.println("not isogram");
    //             check=true;
    //             break;
    //         }
    //     }
    //     if(check == false){
    //         System.out.println("isogram");
    //     }
    //     // remove digits
    //     String s4 = "pyth0n1234";
    //     String s5 = "";
    //     for(int i = 0; i<s4.length();i++){
    //         char b = s4.charAt(i);
    //         if(b>= 'A'&& b <= 'Z'|| b >= 'a' && b <= 'z'){
    //             s5 += (char)(b);
    //     }
    // }
    //     System.out.println(s5);
    
        // // 1 Reverse a String
        // String s = "hello";
        // String r = "";
        // for(int i = s.length()-1;i>=0;i--){
        //     r += s.charAt(i);
        // }
        // System.out.println(r);

        // // 2 Check Palindrome String
        // String s = "hello";
        // String r = "";
        // for(int i = s.length()-1;i>=0;i--){
        //     r += s.charAt(i);
        // }
        // if(s.equals(r)){
        //     System.out.println("palindrome");
        // }else{
        //     System.out.println("not palindrome");
        // }
        // // 3 Count Vowels in a String
        // String s = "education"; 
        // int count = 0; for(char c :s.toLowerCase().toCharArray()) { 
        //     if("aeiou".indexOf(c) != -1) count++; 
        // }
        // System.out.println(count);

        // //4 count words
        // String s = "hi my name";
        // String [] word = s.trim().split(//s);

        //strkimngs 

        // //
        // int i = 1;
        // String v = String.valueOf(i);
        // System.out.println(v);

        // //
        // int n[] = {1,2,3,4,5};
        // int sum = 0;
        // int max = 0,min = 0;
        // for(int i:n){
        //     sum +=i;
        // }
        // System.out.println(sum);

        // //
        // min = n[0];
        // for(int i:n){
        //     if(i>max){
        //         max = i;
        //     }
        //     if(i<min){
        //         min = i;
        //     }
        // }
        // System.out.println("min : "+min+"max :"+max);

        // //
        // int n[] = {1,2,3,4,5};
        // System.out.println("enter num : ");
        // int num1 = scan.nextInt();
        // int low = 0,mid= 0;
        // int high = n.length - 1;
        // while(low<=high){
        //     mid = (low+high)/2;
        //     if(mid == num1){
        //         System.out.println("found at : "+(mid-1));
        //         break;
        //     }else if(mid >= high){
        //         high = mid - 1;
        //     }else{
        //         low = mid +1;
        //     }
        // }

        // //
        // int n[] = {1,2,3,4,5};
        // int[] n2 = new int[n.length];
        // int j = 0;
        // for(int i = n.length-1; i>=  0;i--){
        //     if(j<n2.length){
        //     n2[j] = n[i];
        //     j++;
        //     }
        // }
        // for(int i:n2){
        // System.out.println(i);
        // }

        //
        int n3[] = {1,2,2,2,3,3,3,4};
        int[] n4 = new int[n3.length];
        Arrays.sort(n3);
        int j = 1;
        for(int i = 0;i<n3.length;i++){
            j = i+1;
            if(n3[i]!=n3[j]){
                n4[i] = n3[i];
                i++;
                j++;
            }
        }
        for(int i:n4){
            if()
            System.out.print(i);
        }
        

    }
}
