// Cream o excepție proprie (Checked Exception), care moștenește Exception
public class InvalidUserDataException extends Exception {
    public InvalidUserDataException(String message) {
        super(message); // Apelăm constructorul clasei părinte (Exception)
    }
}