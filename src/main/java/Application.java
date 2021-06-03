import org.mindrot.jbcrypt.BCrypt;

public class Application {
    public static void main(String[] args) {
        String password = "123password";
        System.out.println(password = "password");
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println("hash = " + hash);

        boolean passwordsMatch = BCrypt.checkpw(password, hash);
        System.out.println("passwordsMatch = " + passwordsMatch);
    }
}
