import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean validUsername;

        do {
            System.out.print("Introduceți username: ");
            username = scanner.nextLine();
            validUsername = true;

            // Verificare dacă are spații
            if (username.contains(" ")) {
                System.out.println("Eroare: Username-ul nu trebuie să conțină spații!");
                validUsername = false;
                continue;
            }

            // Verificare lungime: Trebuie să fie între 6 și 12 caractere, inclusiv
            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Lungimea trebuie să fie între 6 și 12 caractere!");
                validUsername = false;
            }

            // Verificare trebuie sa contina cel puțin o cifră
            boolean contineCifra = false;
            for (int i = 0; i < username.length(); i++) {
                if (Character.isDigit(username.charAt(i))) {
                    contineCifra = true;
                    break;
                }
            }

            if (!contineCifra) {
                System.out.println("Eroare: Username-ul trebuie să conțină cel puțin o cifră (0-9)!");
                validUsername = false;
            }

        } while (!validUsername);

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}
