package javax.mail;

public final class PasswordAuthentication {
    private final String password;
    private final String userName;

    public PasswordAuthentication(String str, String str2) {
        this.userName = str;
        this.password = str2;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUserName() {
        return this.userName;
    }
}
