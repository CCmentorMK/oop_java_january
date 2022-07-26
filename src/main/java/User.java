import java.time.LocalDateTime;
import java.util.Date;

// klasa modelu - determinuje strukturę danych
// model java beans
// -> pola prywatne
// -> publiczne metody dostępowe get / set
// -> konstruktory
// -> toString()
public class User {
    // składowe statyczne -> nie są inicjalizowane przy utworzeniu kolejnych instancji, związana z klasą a nie obiektem
    public static int lastInsertId; // przy utworzeniu nowego obiektu pole jest zawsze inicjalizowane = 0
    // pola klasowe -> prywatne -> niestatyczne
    private int userId;                         // init 0
    private String name;                        // init null
    private String email;
    private String password;
    private String imagePath;
    private boolean status;                     // init false
    private double salary;                      // init 0.0
    private LocalDateTime registerDateTime;     // data + czas
    private char symbol;                        // init ???
    // default constructor
    public User() {
        System.out.println("default constructor");
        lastInsertId++;
        this.userId = lastInsertId;
    }
    // konstruktor -> all args
    public User(
                String name,
                String email,
                String password,
                String imagePath,
                boolean status,
                double salary,
                LocalDateTime registerDateTime) {
        lastInsertId++;
        this.userId = lastInsertId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.imagePath = imagePath;
        this.status = status;
        this.salary = salary;
        this.registerDateTime = registerDateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", status=" + status +
                ", salary=" + salary +
                ", registerDateTime=" + registerDateTime +
                ", symbol=" + symbol +
                '}';
    }

    // metoda statyczna jest związana tylko z klasą i nie wymaga utwozenia nowej instancji
    // -> możemy tutaj odwoływać się tylko do składowych statycznych
    public static int getLastInsertId() {
        // logka aplikacji ...
        return lastInsertId;
    }
    // gettery & settery -> ALT + Ins
    public int getUserId() {
        return userId;
    }
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }

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
