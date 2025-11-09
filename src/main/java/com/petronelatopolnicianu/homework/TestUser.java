public class TestUser {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();

        //User valid
        try {
            repository.addUser(new User("testuser", 25));
            System.out.println("Utilizator adăugat: testuser");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        //AdminUser valid
        try {
            repository.addUser(new AdminUser("admin", 30, "full_access"));
            System.out.println("AdminUser adăugat: admin");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        //User cu username prea scurt
        try {
            repository.addUser(new User("ab", 22));
            System.out.println("Utilizator adăugat: ab");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        //User cu age negativ
        try {
            repository.addUser(new User("baduser", -5));
            System.out.println("Utilizator adăugat: baduser");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        //Afișare toți utilizatorii adăugați cu succes
        System.out.println("Utilizatori adăugați:");
        for (User user : repository.getUsers()) {
            System.out.println(user);
        }
    }
}