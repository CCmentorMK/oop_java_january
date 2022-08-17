package w2;
// typ wyliczeniowy
// składowe stałe
// determinuje obiekty do wyboru
// zachowuje się jak tablica -> elmenty są uporządkowane po indeksach
public enum RoleName {
    USER("Użytkownik", "1000"),       // index 0
    ADMIN("Administrator", "1111");       // index 1

    private final String roleName;
    private final String priv;

    RoleName(String roleName, String priv) {
        this.roleName = roleName;
        this.priv = priv;
    }
    public String getRoleName() {
        return roleName;
    }
    public String getPriv() {
        return priv;
    }
}
