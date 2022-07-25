import java.time.LocalDateTime;

public class MainForController {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser(new User());
        uc.addUser(new User(1, "X", "X", "X", "X", true,
                10_000.50, LocalDateTime.now()));
        uc.addUser(new User());
        uc.addUser(new User());

        uc.getAllUsers();

    }
}
