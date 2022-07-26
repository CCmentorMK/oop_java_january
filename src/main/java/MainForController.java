import java.time.LocalDateTime;

public class MainForController {
    public static void main(String[] args) {
        System.out.println("Before objects creation: " + User.getLastInsertId());
        UserControllerImpl uc = new UserControllerImpl();
        uc.addUser(new User());
        uc.addUser(new User("X", "X", "X", "X", true, 10_000.50, LocalDateTime.now()));
        uc.addUser(new User("Y", "Y", "Y", "Y", true, 10_000.50, LocalDateTime.now()));
        uc.addUser(new User());
        uc.addUser(new User());
        System.out.println("Get user with id = 2 :" + uc.getUserById(2));
        uc.getAllUsers();
        System.out.println("After objects creation: " + User.getLastInsertId());
        System.out.println("Call by field: " + User.lastInsertId);

    }
}
