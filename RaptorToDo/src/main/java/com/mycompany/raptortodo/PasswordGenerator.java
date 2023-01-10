package com.mycompany.raptortodo;

import java.security.SecureRandom;

public class PasswordGenerator {
    // Zeichen, die für das Passwort verwendet werden sollen

    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String OTHER_CHAR = "!@#$%&*()_+-=[]?";

    // Verwenden Sie SecureRandom, um sicherzustellen, dass das Passwort sicher ist
    private static final SecureRandom RANDOM = new SecureRandom();

    public String generatePassword(int length, boolean useLower, boolean useUpper, boolean useNumber, boolean useOther) {
        String password = "";
        String passwordAllow = "";
        if (useLower) {
            passwordAllow += CHAR_LOWER;
        }
        if (useUpper) {
            passwordAllow += CHAR_UPPER;
        }
        if (useNumber) {
            passwordAllow += NUMBER;
        }
        if (useOther) {
            passwordAllow += OTHER_CHAR;
        }

        int passwordAllowLen = passwordAllow.length();
        for (int i = 0; i < length; i++) {
            password += passwordAllow.charAt(RANDOM.nextInt(passwordAllowLen));
        }
        return password;
    }
}
