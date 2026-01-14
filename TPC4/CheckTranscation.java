package TPC4;

interface Transaction {
    void pay(int amount);
}

class UPI implements Transaction{
    public void pay(int amount){
        System.out.println("paid"+amount+"using UPI");
    }
}

public class CheckTranscation{
    public static void main(String[] args) {
        Transaction obj=new UPI();
        obj.pay(1230);
    }
}
