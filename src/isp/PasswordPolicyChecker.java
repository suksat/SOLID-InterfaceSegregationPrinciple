package isp;

// Interface for password policy checks
interface PasswordPolicyChecker {
    boolean checkPassword(String password);
}
