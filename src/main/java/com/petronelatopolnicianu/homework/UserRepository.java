import java.util.ArrayList;
import java.util.List;
//Clasă care va avea o listă privată de utilizatori
public class UserRepository {

    // Listă privată de utilizatori
    private List<User> users = new ArrayList<>();

    // Metodă publică care adaugă un utilizator în listă și aruncă (throws) excepția InvalidUserDataException dacă una dintre condiții este adevărată
    public void addUser(User user) throws InvalidUserDataException {
        if (user == null) {
            throw new InvalidUserDataException("Userul nu poate fi null");
        }

        if (user.getUsername() == null || user.getUsername().length() < 3) {
            throw new InvalidUserDataException("Username-ul nu poate fi null sau să conțină mai puțin de 3 caractere");
        }

        if (user.getAge() < 0) {
            throw new InvalidUserDataException("Vârsta nu poate fi negativă");
        }
        users.add(user);
    }

    // Metodă care returnează lista de utilizatori 
    public List<User> getUsers() {
        return users;
    }
}