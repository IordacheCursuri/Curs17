package record;

import java.util.Objects;

public class User1 {

    private String username;
    private int varsta;


    public User1(String username, int varsta) {
        this.username = username;
        this.varsta = varsta;
    }

    public String getUsername() {
        return username;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1 user1 = (User1) o;
        return varsta == user1.varsta && Objects.equals(username, user1.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, varsta);
    }

    @Override
    public String toString() {
        return "User1{" +
                "username='" + username + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
