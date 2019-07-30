import java.util.Scanner;

public class TransactionDelete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj typ");
        String type3 = scan.nextLine();

        TransAdd transAdd2 = new TransAdd();
        transAdd2.deleteByType(type3);
        System.out.println("Usunięto!");
    }
}
