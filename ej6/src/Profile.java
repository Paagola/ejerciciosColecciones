public class Profile {
    private int userId;
    private String name;
    private String surname;
    private String bio;
    private String profilePictureUrl;

    public Profile(int userId, String name, String surname, String bio, String profilePictureUrl) {        
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.bio = bio;
        this.profilePictureUrl = profilePictureUrl;
    }

    public int getUserById() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBio() {
        return bio;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    
}
