package org.example;

import java.util.Random;
import java.util.Scanner;

public class CaesarCipherDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get plaintext input
        System.out.print("Enter a string of exactly seven characters: ");
        String plaintext = scanner.nextLine();

        if (plaintext.length() != 12) {
            System.out.println("Please read directions and rerun it again!");
            return;
        }
    }
}
