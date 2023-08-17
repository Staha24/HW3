package HW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PasswordVerifier passwordVerifier = new PasswordVerifier();


        try {
            passwordVerifier.verifyPassword("123456");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            passwordVerifier.verifyPassword("password");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            passwordVerifier.verifyPassword("Password");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            passwordVerifier.verifyPassword("Password1");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
