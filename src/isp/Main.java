package isp;

public class Main {
    // Main method to test the implementation
    public static void main(String[] args) {
        UserAuthentication userAuth = new UserAuthentication();

        // Test authentication
        boolean isAuthentic = userAuth.authenticate("invalid-username", "ValidPassword123");
        System.out.println("User authentication: " + isAuthentic);

        // Test password policy check
        boolean isPasswordValid = userAuth.checkPassword("this-is-an-invalid-password123");
        System.out.println("Password validity check: " + isPasswordValid);
    }
}
/*
This is a Java program that demonstrates the Interface Segregation Principle.
The interface segregation principle states that
a client should not be forced to implement an interface that it does not use completely.

By separating the required functionality into separate interfaces,
the ISP promotes flexible, modular code that is easy to maintain.
Here, we will create two distinct interfaces for password policies and authentication checks.

By breaking out the functionality of the authentication system into two separate interfaces
for authentication and password policies,
we are able to simplify code and make implementation and refactoring simpler.

Promoting independence between the two interacting functionalities
promotes code that is flexible, modular and easier to maintain.
*/