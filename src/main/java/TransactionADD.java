import java.util.Scanner;

public class TransactionADD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj cos do dodania");
        String type = scan.nextLine();

        System.out.println("podaj opis");
        String description = scan.nextLine();

        System.out.println("podaj ilosc");
        double amount = scan.nextDouble();
        scan.nextLine();

        System.out.println("podaj date");
        String date = scan.nextLine();

        Transaction transaction = new Transaction(type, description, amount, date);

        TransAdd transAdd = new TransAdd();
        transAdd.add(transaction);

    }
}
