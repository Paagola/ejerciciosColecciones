
public class App {
    public static void main(String[] args) throws Exception {
        ProfileService profileService = new ProfileService();
        UserService usersService = new UserService(profileService);
        int option = 0;
        String token = "";

        do {
            if (option == 0) {
                menu();
                option = readOption();
            }
            switch (option) {
                case 1:
                    if (token == null || token.isEmpty()) {
                        String email = System.console().readLine("Email: ");
                        String password = System.console().readLine("Password: ");
                        token = usersService.login(email, password);
                    }
                    if (token != null) {
                        do {
                            submenu();
                            switch (option = readOption()) {
                                case 1: {
                                    User user = usersService.me(token);
                                    System.out.print(profileService.requestById(user.getId()).getName());
                                }

                                    break;
                                case 2: {
                                    User user = usersService.me(token);
                                    System.out.println("Editar perfil:");
                                    String name = System.console().readLine("Nombre: ");
                                    String surname = System.console().readLine("Apellidos: ");
                                    String bio = System.console().readLine("Bio: ");
                                    profileService.update(user.getId(),
                                            new Profile(user.getId(), name, surname, bio, ""));
                                }
                                    break;
                                
                                case 3: {
                                    usersService.logout(token);
                                    token = null;
                                    System.out.println("Hasta pronto...");
                                }

                                default:
                                    break;
                            }
                        } while (option != 3);
                    }
                    break;
                case 2:
                    System.out.println("Registro");
                    String username = System.console().readLine("Username: ");
                    String name = System.console().readLine("Nombre: ");
                    String surname = System.console().readLine("Apellidos: ");
                    String email = System.console().readLine("Email: ");
                    String bio = System.console().readLine("Bio: ");                    
                    String pictureUrl = System.console().readLine("URL de la foto de perfil: ");
                    String password = "";
                    String password2 = "";

                    do{
                        password = System.console().readLine("Password: ");
                        password2 = System.console().readLine("Repetir password: ");
                    }while(!password.equals(password2));

                    if ((token = usersService.register(username, name, surname, email, bio, pictureUrl, password)) != null) {
                        System.out.println("Registro exitoso. Bienvenido " + username);
                        option = 1;
                    }
                    else {
                        option = 0;
                    }

                    break;

                    case 3:
                        break;

                        default:
                    break;
            }
        } while (option!= 3);
    }

    public static void menu() {
        System.out.println("""
                    1. Iniciar Sesion
                    2. Registrarse
                    3. Salir
                """);
    }

    public static void submenu() {
        System.out.println("""
                1. Ver perfil
                2. Editar Perfil
                3. Cerrar Sesion
                """);
    }

    public static int readOption() {
        System.out.print("Seleccione una opción: ");
        return Integer.parseInt(System.console().readLine());
    }

}
