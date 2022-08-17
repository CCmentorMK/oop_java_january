package w2;

import java.time.LocalDateTime;

public class User extends UserDto {
    public static int lastInsertId; // przy utworzeniu nowego obiektu pole jest zawsze inicjalizowane = 0
    private int userId;                         // init 0
    private String imagePath;
    private boolean status;                     // init false
    private double salary;                      // init 0.0
    private LocalDateTime registerDateTime;     // data + czas
    private char symbol;                        // init ???
    private RoleName roleName;
    // default constructor
    public User() {
        super();
        lastInsertId++;
        this.userId = lastInsertId;
        System.out.println("Jestem w user");

    }
    public User(
            String name,
            String email,
            String password,
            String imagePath,
            boolean status,
            double salary,
            LocalDateTime registerDateTime,
            RoleName roleName
    ) {
        // zawsze musi być jako pierwsza linijka w konstruktorze
        super(name, email, password); // wywołanie konstuktora klasy nadrzędnej - rozszerzanej
        lastInsertId++;
        this.userId = lastInsertId;
        this.imagePath = imagePath;
        this.status = status;
        this.salary = salary;
        this.registerDateTime = registerDateTime;
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId + '\'' +
                "userName='" + super.getName() +
                ", imagePath='" + imagePath + '\'' +
                ", status=" + status +
                ", salary=" + salary +
                ", registerDateTime=" + registerDateTime +
                ", symbol=" + symbol +
                ", roleName=" + roleName +
                "} " + super.toString();
    }

    public static int getLastInsertId() {
        return lastInsertId;
    }

    public static void setLastInsertId(int lastInsertId) {
        User.lastInsertId = lastInsertId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDateTime getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(LocalDateTime registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public RoleName getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }
}
