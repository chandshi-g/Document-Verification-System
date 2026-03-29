import model.document;
import service.verificationService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Document ID:");
        String id = sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Type:");
        String type = sc.nextLine();

        document doc = new document(id, name, type);

        verificationService.verify(doc);
    }
}