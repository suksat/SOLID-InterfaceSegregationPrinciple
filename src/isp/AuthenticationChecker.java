package isp;

// Interface for authentication checks
interface AuthenticationChecker {
    boolean authenticate(String username, String password);
}
