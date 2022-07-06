package Banking;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class bank {
    public static void main(String args[]) //main class of bank
        throws IOException
    {
 
        BufferedReader sc = new BufferedReader(
            new InputStreamReader(System.in));
        String name = "";
        int pass_code;
        int ac_no;
        int ch;
 
        while (true) {
            System.out.println(
                "\n ->||    Welcome to Capgemini Bank    ||<- \n");
            System.out.println("1)Create Account");
            System.out.println("2)Login Account");
            System.out.println("3)Logout");
 
            try {
                 //user input
                System.out.println("----If you want to create the Account Type 1---");
                System.out.println("--If the account is already exist and want to Login type 2--");
                System.out.println("\n    Enter Input:");
                ch = Integer.parseInt(sc.readLine());
 
                switch (ch) {
                case 1:
                    try {
                        System.out.print(
                            "Enter Unique UserName:");
                        name = sc.readLine();
                        System.out.print(
                            "Enter New Password(only numbers should be used):");
                        pass_code = Integer.parseInt(
                            sc.readLine());
 
                        if (bankManagement.createAccount(
                                name, pass_code)) {
                            System.out.println(
                                "MSG : Account Created Successfully!\n");
                        }
                        else {
                            System.out.println(
                                "ERR : Account Creation Failed!\n");
                        }
                    }
                    catch (Exception e) {
                    	System.out.println(e);
                    	System.out.println(
                            " ERR : Enter Valid Data::Insertion Failed!\n");
                    }
                    break;
 
                case 2:
                    try {
                        System.out.print(
                            "Enter  UserName:");
                        name = sc.readLine();
                        System.out.print(
                            "Enter  Password:");
                        pass_code = Integer.parseInt(
                            sc.readLine());
 
                        if (bankManagement.loginAccount(
                                name, pass_code)) {
                            System.out.println(
                                "MSG : Logout Successfully!\n");
                        }
                        else {
                            System.out.println(
                                "ERR : login Failed!\n");
                        }
                    }
                    catch (Exception e) {
                        System.out.println(
                            " ERR : Enter Valid Data::Login Failed!\n");
                    }
 
                    break;
                case 3:
                	System.out.println("Logged out Sucessfully..!");
                	System.exit(1);
                	break;
                default:
                    System.out.println("Invalid Entry!\n");
                }
 
                if (ch == 5) {
                    System.out.println(
                        "Exited Successfully!\n\n Thank You :)");
                    break;
                }
            }
            catch (Exception e) {
                System.out.println("Enter Valid Entry!");
            }
        }
        sc.close();
    }
}