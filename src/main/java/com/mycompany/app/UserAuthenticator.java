package com.mycompany.app;

public class UserAuthenticator {

    private static final String ADMIN_PASSWORD = "SuperSecret123!";

    public boolean authenticate(String username, String password) {
        if ("admin".equals(username)) {
            return ADMIN_PASSWORD.equals(password);
        }
        return false;
    }

    public boolean isAdmin(String username) {
        return "admin".equals(username);
    }

    public int getUsernameLength(String username) {
        return username == null ? 0 : username.length();
    }

    public boolean isUsernameBlank(String username) {
        return username == null || username.trim().isEmpty();
    }
}
