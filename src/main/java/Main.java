// keymaps
// psvm - public static void main(String[] args) {}
// sout - System.out.println();

import java.time.LocalDateTime;

public class Main {
    // ta mateoda uruchamia się automatycznie po kompilacji
    public static void main(String[] args) {
        System.out.println("Hello oop");
        // utworzenie obiektu
        // new - nowa instancja
        // Type() - default constructor
        User user1 = new User();
//        user1.name = "Michał";
        user1.setName("Michał");
        System.out.println(user1.getName());

        User user2 = new User(1, "X", "X", "X", "X", true,
                10_000.50, LocalDateTime.now());

        System.out.println(user2.getName());

        System.out.println(user1);
        System.out.println(user2);
//        TestClass tc = new TestClass();

        // utworzenie obiektu user3 na podstawie obiektu user2
        User user3 = user2;
        user3.setName("Adam");
        System.out.println(user3);
        System.out.println(user2);
        User user4 = new User();
        User user5 = new User();
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user4.hashCode());
        System.out.println(user5.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());


    }
}
