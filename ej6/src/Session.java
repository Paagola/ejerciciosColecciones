import java.sql.Date;

public class Session {
    private User user;
    private Date loginTime;
    private long expiration;
    String token;

    public Session(User user, long expirationTimeInMilis, String token) {
        this.user = user;
        this.token = token;
        this.expiration = expirationTimeInMilis;
        this.loginTime = new Date(System.currentTimeMillis());
    }

    public User getUser() {
        return user;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public long getExpiration() {
        return expiration;
    }

    public String getToken() {
        return token;
    }
}
