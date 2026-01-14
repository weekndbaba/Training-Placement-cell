import java.util.Scanner;

class Basic{
    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        float f = 1.3f;
        Boolean c = true;
        String d = "nigg";
        char e = 'c';
        
        int add = a+b;
        System.out.println(add);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println("Module : " + a%2);
        if (c){
            System.out.println("yes");

        }
        System.out.println(d.toLowerCase());
        System.out.println(d.toUpperCase());
        System.out.println(d.charAt(2));
        d = d.replace("N", "e");
        System.out.println(d);

        int[][] marks1 = {{2,1,3},{2,2,2}};
        int[][] marks2 = {{2,1,3},{2,2,2}};
        int[][] sum = new int[2][3];
        
        for(int i = 0; i<=1;i++){
            for(int j = 0; j<=2;j++){
            System.out.print(marks1[i][j] +" ");
            }
            System.out.println("");
        }
        for(int i = 0; i<=1;i++){
            for(int j = 0; j<=2;j++){
            System.out.print(marks2[i][j]);
            }
            System.out.println("");
        }
        
        for(int i = 0; i<=1;i++){
            for(int j = 0; j<=2;j++){
                sum[i][j] = marks1[i][j] + marks2[i][j];
            
            }
        }
        for(int i = 0; i<=1;i++){
            for(int j = 0; j<=2;j++){
            System.out.print(sum[i][j]);
            }
            System.out.println("");
        }
        int p = 100;
        int fp = p+ (int)18.0;
        System.out.println(fp);
        double radius,area;
        radius = 3.00;

        area = radius*radius*3.14159;
        System.out.println("area" + area + "radius"+radius);

        Scanner scan = new Scanner();

        System.out.println("enter radius");
        double r = scan.nextDouble();
        double area_c = r*r*3.14159;
        System.out.println(area_c);

        System.out.println("enter l, b");
        int l = scan.nextInt();
        int b = scan.nextInt();
        int area_r = l*b; 
        System.out.println("area" + area_r);

        System.out.println("enter radius");
        double r_sphere = scan.nextDouble();
        double suraface_area_sphere = 4*3.14159*r_sphere*r_sphere;
        System.out.println(suraface_area_sphere);

        System.out.println("enter side a ");
        int a_side = scan.nextInt();
        int  area_side = a*a;
        System.out.println(area_side);

        System.out.println("enter b,h");
        double brea = scan.nextDouble();
        double hei = scan.nextDouble();
        double tri = (1/2)*brea*hei;
        System.out.println(tri);

        System.out.println("enter side a ");
        int a_side = scan.nextInt();
        int area_side = a*a;
        System.out.println(area_side);

        




    }
}