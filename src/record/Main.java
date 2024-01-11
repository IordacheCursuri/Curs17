package record;

public class Main {
    public static void main(String[] args) {

        User1 user1 = new User1("Gigel", 23);

        System.out.println(user1.getUsername() + " " + user1.getVarsta());

        User2 user2 = new User2("Ana", 40);

        System.out.println(user2.username() + " " + user2.varsta());



    }

}
