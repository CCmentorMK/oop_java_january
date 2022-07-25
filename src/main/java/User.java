import java.time.LocalDateTime;
import java.util.Date;

// klasa modelu - determinuje strukturę danych
// model java beans
// -> pola prywatne
// -> publiczne metody dostępowe get / set
// -> konstruktory
// -> toString()
public class User {
    // pola klasowe -> prywatne
    private int userId;
    private String name;
    private String email;
    private String password;
    private String imagePath;
    private boolean status;
    private double salary;
    private LocalDateTime registerDateTime;     // data + czas
    // default constructor
    public User() {
        System.out.println("default constructor");
    }
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", status=" + status +
                ", salary=" + salary +
                ", registerDateTime=" + registerDateTime +
                '}';
    }
    // konstruktor -> all args
    public User(int userId,
                String name,
                String email,
                String password,
                String imagePath,
                boolean status,
                double salary,
                LocalDateTime registerDateTime) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.imagePath = imagePath;
        this.status = status;
        this.salary = salary;
        this.registerDateTime = registerDateTime;
    }

    // gettery & settery -> ALT + Ins
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
