/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailappl;

import java.util.Scanner;

/**
 *
 * @author Elvin Aliyev
 */
public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String email;
    private String companySuffix = "aeycompany.com";

    public Email(String name, String surname) {
        this.firstName = name;
        this.lastName = surname;

        this.department = setDepartment();

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase()
                + "@" + department + "." + companySuffix;
    }

    private String setDepartment() {
        System.out.println("New worker: "+firstName+
                ",DEPARTMENT CODES\n1 for Sales"
                + "\n2 for Development"
                + "\n3 for Accounting"
                + "\n0 for none"
                + "\nEnter department code: ");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUXYZ0123456789@$";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return this.mailboxCapacity;
    }

    public String getAlternateEmail() {
        return this.alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: "
                + firstName + " " + lastName
                + "\nCOMPANY EMAIL: " + email
                + "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
