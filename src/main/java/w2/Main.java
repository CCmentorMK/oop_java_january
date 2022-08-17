package w2;

import java.time.LocalDateTime;

public class Main {

    private static boolean compareUsers(BasicController bc1, BasicController bc2){
        return bc1.getClass().getName().equals(bc2.getClass().getName());
    }

    public static void main(String[] args) {
//        UserControllerImpl userController = new UserControllerImpl();
//        userController.getAllUsers();
//
//        AdminControllerImpl adminController = new AdminControllerImpl();
//        adminController.addUser(new User());
//        adminController.addUser(new User("M","M","@","sss", false, 10000, LocalDateTime.now(), RoleName.ADMIN));
//        adminController.getAllUsers();
//
//        // polimorfizm - wielopostaciowość
//        BasicController user = new UserControllerImpl();
//        BasicController user2 = new UserControllerImpl();
//        BasicController admin = new AdminControllerImpl();
//        System.out.println(user.getClass().getName());
//        System.out.println(admin.getClass().getName());
//
//        System.out.println(compareUsers(user, admin));
//        System.out.println(compareUsers(user, user2));
//
//        Object object = new AdminControllerImpl();
//        ((AdminControllerImpl) object).getAllUsers();
//
//        UserDto u1 = new UserDto("X","X","X");
//        UserDto u2 = new User("M","M","@","sss", false, 10000, LocalDateTime.now(), RoleName.ADMIN);
//        System.out.println(u1.toString());
//        System.out.println(u2.toString());

        UserDto userDto = new SuperUser();
        userDto.field="X";
    }
}
