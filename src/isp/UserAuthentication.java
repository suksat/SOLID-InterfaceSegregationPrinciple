package isp;

import java.util.Arrays;
import java.util.List;

// Client implementing both the authentication and password policy interfaces
public class UserAuthentication implements AuthenticationChecker, PasswordPolicyChecker {

    // List of authorized usernames
    List<String> authorizedUsernames = Arrays.asList("sukumarsatyen", "sukumarsatyen123", "sukumarsatyen456");

    // Method to authenticate the user
    public boolean authenticate(String username, String password) {
        // Here, we would implement the code that checks if the provided username and password match the ones in the database and return true, otherwise false.
        return authorizedUsernames.contains(username) && checkPassword(password);
    }

    // Check the password for enforcing password policies
    public boolean checkPassword(String password) {
        // Here, we would implement the code that checks if the provided password meets certain criteria such as length, complexity, etc. and return true if it passes, otherwise false.
        return password != null && password.length() >= 8 && !password.equals(password.toLowerCase()) && !password.equals(password.toUpperCase()) && password.matches(".*\\d.*");
    }


}
