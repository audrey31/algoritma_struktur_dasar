package ValidatingUsernamePassword;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> accounts = new HashMap<>();
        // exercise using a hashmap

        boolean check = true;
        while (check) {
            System.out.println("1. Register" + "\n" +
                    "2. Login" + "\n" +
                    "3. Check all accounts registered" + "\n" +
                    "0. Log out" + "\n" +
                    "====================================");
            System.out.print("Answer: ");
            String num = in.nextLine();

            switch (num) {
                case "1":
                    System.out.print("Username: ");
                    String usernameReg = in.nextLine();
                    System.out.print("Password: ");
                    String passwordReg = in.nextLine();
                    accounts.put(usernameReg.toLowerCase(), passwordReg);
                    System.out.println();
                    break;
                case "2":
                    System.out.print("Username: ");
                    String usernameLog = in.nextLine();
                    System.out.print("Password: ");
                    String passwordLog = in.nextLine();
                    if (accounts.containsKey(usernameLog.toLowerCase()) && accounts.containsValue(passwordLog)){
                        System.out.println("Login Successful");
                    }else{
                        System.out.println("Login Failed");
                    }
                    System.out.println();
                    break;
                case "3":
                    for (String x : accounts.keySet()) {
                        String value = accounts.get(x);
                        System.out.println("Username: " + x + "\t\t" + "Password: " + value);
                    }
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    check = false;
                    break;
                default:
                    System.out.println("Insert a valid number" + "\n");
                    break;
            }
        }
    }
}