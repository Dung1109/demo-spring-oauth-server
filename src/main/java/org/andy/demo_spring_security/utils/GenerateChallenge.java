package org.andy.demo_spring_security.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class GenerateChallenge {

    public static void main(String[] args) {
        String verifier = "Mxk_tq3oZn-P-xG96Rw_mnJtqpszSj9OOt_NF9sN0fY";
        System.out.println(generateChallenge(verifier));
    }

    public static String generateChallenge(String verifier) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte [] digested = messageDigest.digest(verifier.getBytes());
            String codeChallenge = Base64.getUrlEncoder()
                    .withoutPadding()
                    .encodeToString(digested);

            return codeChallenge;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}