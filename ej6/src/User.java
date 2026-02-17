public class User {

    private int id;
    private String username;
    private String email;
    private String password;

    public User(int id, String username, String email, String password){
        this.username = username;
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return String.format("User{username=%s, email=%s", username, email);
    }



}
