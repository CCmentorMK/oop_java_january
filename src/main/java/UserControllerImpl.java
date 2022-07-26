// klasa kontrolera -> kontrola dostępu do danych
public class UserControllerImpl implements UserController {
    // dodawanie użytkowników
    @Override
    public void addUser(User user){
        users.add(user);
    }
    // wyświetlanie użytkowników
    @Override
    public void getAllUsers(){
//        for (User user : users) {
//            System.out.println(user.toString());
//        }
        // CTRL + Space -> generate predicate
        users.forEach(user -> System.out.println(user));
    }
    @Override
    public User getUserById(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId){
                return user;
            }
        }
        return null;
    }
    @Override
    public boolean updateUserById(int userId, User newUser) {
        User user = getUserById(userId);
        if(user != null){
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
            user.setSalary(newUser.getSalary());
            user.setStatus(newUser.isStatus());
            // reszta pól tak samo
        }
        return false;
    }
    @Override
    public void removeUserById(int userId) {

    }
}
