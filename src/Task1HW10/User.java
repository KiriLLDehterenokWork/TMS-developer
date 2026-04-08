package Task1HW10;

import java.util.Objects;

public class User {
    private String email;
    private int id;

    public User(int id, String email){
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Task1HW10.User (id = " + id + ", email = " + email + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return id == user.id && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, id);
    }
}
