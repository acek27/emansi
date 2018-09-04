package emansi;

public class session {

    static String id_user = "";

    public session() {
    }

    public void setString(String xxx) {
        id_user = xxx;
    }

    public String get() {
        return id_user;
    }
}
