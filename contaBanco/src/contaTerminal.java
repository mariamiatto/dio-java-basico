
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome completo.");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência.");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta.");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo disponível na conta.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque");
    }
}