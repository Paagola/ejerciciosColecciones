public interface SignIn {
    public String login(String email, String password);
    public boolean logout(String token);
}
