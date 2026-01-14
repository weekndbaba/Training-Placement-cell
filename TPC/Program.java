import java.util.Scanner;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // System.out.println("Enter Number 1 : ");
        // int num1 = scan.nextInt();
        // // 1
        // if(num1 < 10){
        //     System.out.println("number is less then 10");
        // }else{
        //     System.out.println("number is more then 10");
        // }
        
        // System.out.println("Enter Number 2 : ");
        // int num2 = scan.nextInt();
        // // 2
        // if(num1 == num2){
        //     System.out.println("number is equal");
        // }else{
        //     System.out.println("number is not equal");
        // }

        // // 3
        // System.out.println("Enter age : ");
        // int age = scan.nextInt();

        // if(age >= 18){
        //     System.out.println("You are eleigble for voting");
        // }else{
        //     System.out.println("You are eleigble for voting");
        // }

        // // 4
        // System.out.println("Enter num : ");
        // int num3 = scan.nextInt();

        // if(num3%2==0){
        //     System.out.println("num even");
        // }else{
        //     System.out.println("num odd");
        // }

        // // 5
        // System.out.println("Enter angles : ");
        // int an1 = scan.nextInt();
        // int an2 = scan.nextInt();
        // int an3 = scan.nextInt();
        // int a_sum = an1+an2+an3;

        // if(a_sum == 180){
        //     System.out.println("triangle");
        // }else{
        //     System.out.println("not traiangle");
        // }

        // // 6
        // System.out.println("Enter marks : ");
        // int math = scan.nextInt();
        // int eng = scan.nextInt();
        // int phy = scan.nextInt();
        // int total_marks = math+eng+phy;
        // double per = ((double)total_marks/3)*100;

        // System.out.println("marks"+total_marks+"per"+per);


        // // 7
        // System.out.println("Enter yaer : ");
        // int year = scan.nextInt();

        // if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
        //     System.out.println("leap year");
        // }else{
        //     System.out.println("not leap year");
        // }

        // // 8
        // System.out.println("Enter yaer : ");
        // int num4 = scan.nextInt();

        // if(num4 == 0 ){
        //     System.out.println("0");
        // }else if(num4> 0){
        //     System.out.println("positive");
        // }else{
        //     System.out.println("negative");
        // }

        // // 9
        // System.out.println("enter three number");
        // int num5 = scan.nextInt();
        // int num6 = scan.nextInt();
        // int num7 = scan.nextInt();
        // if(num5 >= num6 && num5 >= num7){
        //     System.out.println("num5 is greator");

        // }else if(num6 >= num5 && num6 >= num7){
        //     System.out.println("num6 is greator");

        // }else{
        //     System.out.println("num7 is greator");
        // }

        // // 10
        // System.out.println("enter grade, salary, allowwances, bonus, perks, enter 0 if none");
        // int salary = scan.nextInt();
        // int perk = scan.nextInt();
        // int pf = scan.nextInt();
        // int gross = salary;
        // if(perk !=0){
        //     gross += perk;
        // }if(pf != 0){
        //     gross += pf;
        // }
        // System.out.println("gross"+gross);

        // // 11
        // System.out.println("enter percentage");
        // int per1 = scan.nextInt();
        // if(per1 == 100){
        //     System.out.println("distinction");
        // }
        // else if(per1 >= 60){
        //     System.out.println("A+");
        // }else if(per1 >= 40){
        //     System.out.println("A");
        // }else if(per1 >= 20){
        //     System.out.println("B");
        // }else{
        //     System.out.println("fail");
        // }

        // // 17
        // System.out.println("Enter Number 1 : ");
        // int num8 = scan.nextInt();
        // int num9 = scan.nextInt();
        // int num10 = scan.nextInt();
        // int sums = num8+num9+num10; 
        // // 1
        // if(sums > 10){
        //     System.out.println("sum is more then 10");
        // }else{
        //     System.out.println("sum is less then 10");
        // }

        // // 18
        // System.out.println("enter single digit number");
        // int single = scan.nextInt();
        // switch(single){
        //     case 1:
        //     System.out.println("one");
        //     break;
        //     case 2:
        //     System.out.println("two");
        //     break;
        //     case 3:
        //     System.out.println("three");
        //     break;
        //     case 4:
        //     System.out.println("four");
        //     break;
        //     default:
        //     System.out.println("range");
        // }

        // // 19
        // System.out.println("enter  digit number");
        // int num11 = scan.nextInt();
        // int[] n = new int[10];
        // int temp = num11;
        // int i = 0;
        // while(temp > 0){
        //     n[i] = temp % 10;
        //     temp /= 10;
        //     i++;
        // } i--;

        // for (int y = i; y >= 0; y--){
        //     switch(n[y]){
        //     case 1:
        //     System.out.print("one ");
        //     break;
        //     case 2:
        //     System.out.print("two ");
        //     break;
        //     case 3:
        //     System.out.print("three ");
        //     break;
        //     case 4:
        //     System.out.print("four ");
        //     break;
        //     case 5:
        //     System.out.print("five ");
        //     break;
        //     case 6:
        //     System.out.print("six ");
        //     break;
        //     case 7:
        //     System.out.print("seven ");
        //     break;
        //     case 8:
        //     System.out.print("eight ");
        //     break;
        //     case 9:
        //     System.out.print("nine ");
        //     break;
        //     case 0:
        //     System.out.print("zero ");
        //     break;
        //     default:
        //     System.out.println("range");
        // }
        // }

        // // 20
        // System.out.print("enter table for : ");
        // int tablen = scan.nextInt();
        // for(int p = 1; p <= 10;p++){
        //     System.out.println(tablen+" * "+p+" = "+tablen*p);
        // }

        // // 21
        // for(int i = 1; i<=5;i++){
        //     for(int j = 1; j<=i;j++){
        //     System.out.print("* ");
        // }
        // System.out.println("");
        // }



        // // 21
        // for(int i = 5; i>=0;i--){
        //     for(int j = i; j>=0;j--){
        //     System.out.print("* ");
        // }
        // System.out.println("");
        // }
        
        // // 22
        // for(int i = 1; i<=5;i++){
        //     for(int j = 1; j<=i;j++){
        //     System.out.print(j);
        // }
        // System.out.println("");
        // }

        // // 23
        // for(int i = 1; i<=5;i++){
        //     for(int j = 1; j<=i;j++){
        //     System.out.print(i);
        // }
        // System.out.println("");
        // }

        // // 24
        // int z= 1;
        // for(int i = 1; i<=5;i++){
        //     for(int j = 1; j<=i;j++){
        //     System.out.print(z);
        //     z++;
        // }
        // System.out.println("");
        // }

        // char c = 'A';
        // for(int i = 1; i<=5;i++){
        //     c = 'A';
        //     for(int j = 1; j<=i;j++){
        //     System.out.print(c);
        //     c++;
        // }
        // System.out.println("");
        // }

        // c = 'A';
        // for(int i = 1; i<=5;i++){
            
        //     for(int j = 1; j<=i;j++){
        //     System.out.print(c);
            
        // }
        // c++;
        // System.out.println("");
        // }

        // // 28
        // for(int i = 1; i<=5;i++){
        //     for(int j = 1; j<=i;j++){
        //     System.out.print("* ");
        // }
        // System.out.println("");
        // }
      //rees
        // // 2
        // for(int i = 1; i<=5;i++){
        //     for (int z = 1; z <= 5-i; z++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i;j++){
        //     System.out.print("* ");
        // }
        // System.out.println("");
        // }

    //     // 30
    //     int q = 0;
    //     for (int i = 1; i<=5; i=i+2){
    //         for(int j = 1; j <= i;j++ ){
    //             System.out.print("*");
                
    //         }
    //         System.out.println("");
    //     }for (int i = 3; i>=1; i=i-2){
    //         for(int j = 1; j <= i;j++ ){
    //             System.out.print("*");
    //         }
    //         System.out.println("");
    //     }


    // }

    // // 3
    // System.out.println("enter n");
    // int n = scan.nextInt();
    // int sum;
    // for(int i = 1; i<=n;i++){
    //     if(i%2==0){
    //     sum += i;
    //     }
    // }

    // // 4
    // System.out.println("enter n");
    // int n2 = scan.nextInt();
    // int facotiral;
    // for(int i = 1; i<=n2;i++){
    //     facotiral += i;
    // }
    // System.out.println(""+facotiral);

    // //5
    // System.out.println("enter n");
    // int n3 = scan.nextInt();
    // ;
    // for(int i = 1; i<=n2;i++){
    //     facotiral += i;
    // }
    // System.out.println(""+facotiral);

    // // 
    // System.out.println("enter first term, commom ratio, number of terms : ");
    // int a = scan.nextInt();
    // int r = scan.nextInt();
    // int n = scan.nextInt();
    // int term =a ;
    // System.out.println("geomatric sequnce : ");
    // for(int i = 1;i<=n;i++){
    //     System.out.println(term +"");
    //     term = term*r;
    // }

    // // 
    // System.out.println("enter first term, commom ratio, number of terms : ");
    // int a2 = scan.nextInt();
    // int r2 = scan.nextInt();
    // int n2 = scan.nextInt();
    // int term2 =a2 ;
    // System.out.println("arithmatic sequnce : ");
    // for(int i = 1;i<=n2;i++){
    //     System.out.println(term2 +"");
    //     term2 = term2+r2;
    // }

    // // 
    // System.out.println("enter self derivative , terms : ");
    // int a3 = scan.nextInt();
    // int n3 = scan.nextInt();
    // int series;
    // int pow = 0;
    // int facotiral = 1;
    // System.out.println("expontial series : ");
    // for(int i = 1;i<=n3;i++){
    //     for(int j = 1; j<=i;j++){
    //         pow *= pow;
    //     }for (int z = 1; j<=i;i++){
    //             facotiral += i;
    //     }
    //     System.out.print();
    //     series += pow/facotiral;
        
        
    // }


    // System.out.println("enter two string ");
    // String s1= "listen";
    // String s2= "silent";

    // char[] s1_1 = s1.toLowerCase().toCharArray();
    // char[] s2_2 = s2.toLowerCase().toCharArray();

    // Arrays.sort(s1_1);
    // Arrays.sort(s2_2);

    // if(Arrays.equals(s1_1,s2_2)){
    //     System.out.println("yes anagram");
    // }else{
    //     System.out.println("no anagram");
    // }

    // System.out.println("enter string : ");
    // String str1 = "i love programing";
    
    // String[] words = str1.split("") ;
    // String longest = "";
    // for(String word :words){
    //     if(word.length() > longest.length()){
    //         longest = word;
    //     }

    // }
    // System.out.println("longest "+longest);
    

    //
    String str4 = "bcaa";

    String smallest = str4;
    for (int i = 1; i<str4.length();i++){
        String rotation = str4.substring(i)+str4.substring(0,i);
        if (rotation.compareTo(smallest)<0){
            smallest=rotation;
        }
    }
    System.out.println(smallest);
    
    String pan = "";
    for(char c :pan.toLowerCase().toCharArray()){
        
    }

    }   
}
