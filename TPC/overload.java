package TPC;


class MathOperaction{
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}

public class overload{
    public static void main(String[] args) {
        MathOperaction obj = new MathOperaction();
        System.out.println("sum(int.int) = "+obj.add(8,9));
        System.out.println("sum(double.double) = "+obj.add(8.6,9.9));
        System.out.println("sum(int.inyt.int) = "+obj.add(8,9,77));

    }
}