package TPC;
import java.util.Scanner;


public class exam {
    private String username="",password="";
    exam(String username,String password){
        this.username = username;
        this.password = password;
    }

    void login(String username,String password){
        if(this.username.equals(username)&&this.password.equals(password)){
            System.out.println("login successfull");
        }else{
            System.out.println("login unsuccessfull");
        }
    }
}

class st extends exam{
    st(String username, String password) {
    super(username, password);
}

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        st obj = new st("weekndbaba","12345678");
        System.out.println("enter username");
        String username = scan.nextLine();
        System.out.println("enter password");
        String password = scan.nextLine();
        obj.login(username, password);
    }
}
