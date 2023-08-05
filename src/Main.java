import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Welcome to library:");
        System.out.println("1.Add Member\n2.View All Members\n3.View Members by address\n4.Exit");
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Choose an option: ");
            int option = sc.nextInt();
            switch (option) {
            case 1 -> {
                System.out.println("Enter member id:");
                int id = sc.nextInt();
                System.out.println("Enter member name:");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter the number of addresses of a member: ");
                int n = sc.nextInt();
                System.out.println("Enter " + n + " addresses: ");
                sc.nextLine();
                List<String> address = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    address.add(sc.nextLine());
                }
                Member m = new Member(id, name, address);
                library.addMember(m);
            }
            case 2 -> {
                for (Member m : library.viewAllMembers()) {
                    System.out.println(m);
                }
            }
            case 3 -> {
                System.out.println("Enter the address to view all members at that address: ");
                sc.nextLine();
                String address = sc.nextLine();
                for (Member m : library.viewMembersByAddress(address)) {
                    System.out.println(m);
                }
            }
            case 4 -> System.exit(0);
        }
    }
    }
}