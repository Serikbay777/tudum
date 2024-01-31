import java.util.ArrayList;
import java.util.Scanner;
public class UserInfo {
    String  name;
    int age, balance;
    ArrayList<String> orders;
    public UserInfo() {
        this.name = name;
        this.age = age;
        this.balance = balance;
        orders = new ArrayList<>();
    }
    public void adduser (String namee, int agee, int balancee) {
        name = namee;
        age = agee;
        balance = balancee;
    }
    public void del (int id) {
        orders.remove(id);
    }
    public void addorder (String ticket) {
        orders.add(t§icket);
    }
}
