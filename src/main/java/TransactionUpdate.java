import java.util.Scanner;

public class TransactionUpdate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj id transakcji którą chcesz zaktualizować");
        long id = scan.nextLong();
        scan.nextLine();

        System.out.println("Podaj typ");
        String type1 = scan.nextLine();

        System.out.println("Podaj opis");
        String description1 = scan.nextLine();

        System.out.println("Podaj cene");
        double amount1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Podaj rok");
        String date1 = scan.nextLine();

        Transaction transaction1 = new Transaction(id, type1, description1, amount1, date1);

        TransAdd transAdd1 = new TransAdd();
        transAdd1.update(transaction1);
    }
}
