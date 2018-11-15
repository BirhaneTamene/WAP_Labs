import java.util.ArrayList;
import java.util.List;

public class UserDB {
    List<User> userDBS = new ArrayList<>();

    UserDB(){
        userDBS.add(new User("bire","p1"));
        userDBS.add(new User("dixon","p2"));
    }

    public List<User> getUserDBS() {
        return userDBS;
    }
}
