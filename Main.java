import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Username: ");
            String user = sc.nextLine();

            System.out.print("Password: ");
            String pass = sc.nextLine();

            if (!LoginSystem.login(user, pass)) {
                System.out.println("Invalid login!");
                return;
            }

            BugService service = new BugService();

            while (true) {
                System.out.println("\n1.Add Bug  2.View  3.Update  4.Exit");
                int ch = sc.nextInt();
                sc.nextLine();

                switch (ch) {
                    case 1:
                        System.out.print("Title: ");
                        String t = sc.nextLine();

                        System.out.print("Priority: ");
                        String p = sc.nextLine();

                        System.out.print("Assign To: ");
                        String a = sc.nextLine();

                        service.addBug(t, p, a);
                        break;

                    case 2:
                        service.viewBugs();
                        break;

                    case 3:
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Status: ");
                        String s = sc.nextLine();

                        service.updateStatus(id, s);
                        break;

                    case 4:
                        return;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        }
    }
}