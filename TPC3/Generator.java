package TPC3;

abstract class Encryption{
    protected String pass = "";
    Encryption(String a){
        pass = a;
    }
    abstract void encryption();
}

class Shift extends Encryption{
    protected int shift = 0;
    Shift(String a, int k){
        super(a);
        shift = k;
    }
    
    @Override
    void encryption(){
        int n = pass.length();
        char[] res = new char[n];
        for(int i=0;i<n;i++){
            res[i+shift%n] = pass.charAt(i);
        }
    }
}


public class Generator {
    
}
