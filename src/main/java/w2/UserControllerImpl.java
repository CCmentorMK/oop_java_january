package w2;

public class UserControllerImpl implements RoleUserController {
    @Override
    public void getAllUsers(){
        users.forEach(user -> System.out.println(user));
    }
}
