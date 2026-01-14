package TPC4;

public class Error {
    public static void main(String[] args) {
        int a=10,b=5,c=5,x,y;
        try{
            x=a/(b-c)
        }catch(ArithmeticException e){
            System.out.println("divisoion by 0");
        }
        
    }
}
