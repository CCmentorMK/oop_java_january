import java.util.ArrayList;
import java.util.List;

// nie posiada implementacji a tylko determinuje architekture
public interface UserController {
    public static final List<User> users = new ArrayList<>();

    public abstract void addUser(User user); //-> może być też tak
//    void addUser(User user); // każda metoda w interfejsie jest publiczna i abstrakcyjna
    void getAllUsers();
    User getUserById(int userId);
    boolean updateUserById(int userId, User newUser);
    void removeUserById(int userId);
}
