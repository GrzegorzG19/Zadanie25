import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("1 - dodaj \n2 - aktualizuj \n3 - usuń \n4");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();
        switch (a) {
            case 1:
                TransactionADD.main(new String[0]);
                break;

            case 2:
                TransactionUpdate.main(new String[0]);
                break;

            case 3:
                TransactionDelete.main(new String[0]);
                break;
        }


    }
}
