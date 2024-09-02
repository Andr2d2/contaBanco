import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String clientName = "MARIO ANDRADE";
        double balance = 237.48;

        System.out.println("Insira o número da agência:");
        String agency = scanner.next();

        System.out.println("Insira o número da conta:");
        int account = scanner.nextInt();

        System.out.println("Olá " + clientName
                + " obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + account + " e seu saldo " + balance + " já está disponível para saque");
    }
}
