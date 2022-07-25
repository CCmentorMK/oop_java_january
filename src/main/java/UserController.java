import java.util.ArrayList;
import java.util.List;

// klasa kontrolera -> kontrola dostępu do danych
public class UserController {
    private List<User> users = new ArrayList<>();
    // dodawanie użytkowników
    public void addUser(User user){
        users.add(user);
    }
    // wyświetlanie użytkowników
    public void getAllUsers(){
//        for (User user : users) {
//            System.out.println(user.toString());
//        }
        // CTRL + Space -> generate predicate
        users.forEach(user -> System.out.println(user));
    }
}
