package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public  static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        String[] nameParts = input.split("\\s+");

        String firstName, middleName, lastName;

        if (nameParts.length == 2) {
            firstName = nameParts[0];
            middleName = "(none)";
            lastName = nameParts[1];

        } else {
            System.out.println("enter valid name");
            return;


        }

        System.out.println("First name:" + firstName);
        System.out.println("Middle name:" + middleName);
        System.out.println("lass name:" + lastName);
    }
}
