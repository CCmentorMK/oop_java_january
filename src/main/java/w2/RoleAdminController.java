package w2;


public interface RoleAdminController extends RoleUserController{
    public abstract void addUser(User user); //-> może być też tak
    User getUserById(int userId);
    boolean updateUserById(int userId, User newUser);
    void removeUserById(int userId);
}
