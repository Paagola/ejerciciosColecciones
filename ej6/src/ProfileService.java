import java.util.HashMap;
import java.util.List;

public class ProfileService implements CRUD<Profile>{

    HashMap<Integer, Profile> profilesById = new HashMap<Integer, Profile>();

    public ProfileService() {
        List<Profile> profiles = List.of(
            new Profile(
                1, 
                "Juan", "López", 
                "Desarrollador Java Backend, amante del código limpio",
                "https://example.com/images/jlopez.png"
            ),
            new Profile(
                 2,
                "María", "García",
                "Frontend developer con pasión por UX/UI.",
                "https://example.com/images/mgarcia.jpg"
            ),
            new Profile(
                3,
                "Pedro", "Castro",
                "Ingeniero de software y fan del clean code.",
                "https://example.com/images/pcastro.png"
            ),
            new Profile(
                4,
                "Laura", "Fernández",
                "Full stack developer. Café primero, código después ☕",
                "https://example.com/images/lfernandez.jpg"
            ),
            new Profile(
                5,
                "Ana", "Ramos",
                "QA tester con ojo clínico para los bugs 🐞",
                "https://example.com/images/aramos.png"
            ),
            new Profile(
                6,
                "Carlos", "Navarro",
                "Arquitecto de software y entusiasta de microservicios.",
                "https://example.com/images/cnavarro.jpg"
            ),
            new Profile(
                7,
                "Sofía", "Martín",
                "Desarrolladora mobile y curiosa por nuevas tecnologías.",
                "https://example.com/images/smartin.jpg"
            ),
            new Profile(
                8,
                "David", "Ruiz",
                "Backend developer especializado en APIs REST.",
                "https://example.com/images/druiz.png"
            )
        );
    }

    @Override
    public boolean create(Profile object) {
        if (profilesById.containsKey(object.getUserById())){
            return false;
        }
        return profilesById.put(object.getUserById(), object) == null;
    }

    @Override
    public Profile[] requestAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'requestAll'");
    }

    @Override
    public Profile requestById(int id) {
        return profilesById.get(id);
    }

    @Override
    public Profile update(int id, Profile object) {
       if (!profilesById.containsKey(object.getUserById())) {
        return null;
       }

       Profile prevObject = profilesById.get(object.getUserById());
       Profile newObject = new Profile(
        object.getUserById(), 
        object.getName().isEmpty()?prevObject.getName():object.getName(), 
        object.getSurname().isEmpty()?prevObject.getSurname():object.getSurname(),
        object.getBio().isEmpty()?prevObject.getBio():object.getBio(),
        object.getProfilePictureUrl().isEmpty()?prevObject.getProfilePictureUrl():object.getProfilePictureUrl());

        return profilesById.put(object.getUserById(), newObject);

    }

    @Override
    public Profile delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }


}
