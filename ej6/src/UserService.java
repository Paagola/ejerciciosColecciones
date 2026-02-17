import java.util.HashMap;
import java.util.List;

public class UserService implements SignIn, SignUp, Me {


    private static int nextId;
    HashMap<String, Session> sessions = new HashMap<>();
    HashMap<String, User> usersByEmail;
    ProfileService profileService;

    public UserService(ProfileService profileservive) {
        this.profileService = profileservive;
        List<User> users = List.of(
            new User(1, "jlopez", "juan.lopez@gmail.com", "123456"),
            new User(2, "mgarcia",  "maria.garcia@email.com", "password"),
            new User(3, "pcastro",  "pedro.castro@email.com", "qwerty"),
            new User(4, "lfernandez",  "laura.fernandez@email.com", "abc123"),
            new User(5, "aramos",  "ana.ramos@email.com", "admin"),
            new User(6, "cnavarro",  "carlos.navarro@email.com", "secret"),
            new User(7, "smartin",  "sofia.martin@email.com", "sofia123"),
            new User(8, "druiz",  "david.ruiz@email.com", "ruizpass")
        );
        nextId = users.size() + 1;

        this.usersByEmail = new HashMap<>();
        for (User user : users) {
            usersByEmail.put(user.getEmail(), user);
        }
    }


    @Override
    public User me(String token) {
        return sessions.get(token).getUser();
    }

    @Override
    public String register(String username, String name, String surname,  String email, String bio, String pictureUrl, String password) {
        if (usersByEmail.containsKey(email)){
            return null;
        }
        if (this.profileService.create(new Profile(nextId, name, surname, bio, pictureUrl ))) {
            User user = new User(nextId, username, email, password);
            this.usersByEmail.put(email, user);
            nextId++;
            return login(email, password);
        }
        return null;
    }

    private int getRandomValueBetween(int min, int max){
         return (int)(Math.random()*(max-min+1)+min);
    }

    private String generateToken(){
        String token = "";
        for (int i = 0; i < 32; i++) {
            int selection =  (int)(Math.random()*3);
            switch (selection) {
                case 0:
                    token += (char)(getRandomValueBetween(48, 57));
                    break;
                case 1: 
                    token += (char)(getRandomValueBetween(65, 90));
                    break;
                case 2: 
                    token += (char)(getRandomValueBetween(97, 122));
                    break;
                default:
                    break;
            }
        }
        return token;
    }

    @Override
    public String login(String email, String password) {
        if (usersByEmail.containsKey(email)){
            User user = usersByEmail.get(email);
            boolean ret = user.getPassword().equals(password);
            if (ret) {
                String token = generateToken();
                Session session  = new Session(user, 3600000, token);
                sessions.put(token, session);
                return token;
            }
        }
        return null;
    }

    @Override
    public boolean logout(String token) {
        if (sessions.containsKey(token)) {
            sessions.remove(token);
            return true;
        }
        return false;
    }

}
