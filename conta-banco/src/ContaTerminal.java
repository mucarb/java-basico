import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Informer seu nome!");
    String nome = scanner.nextLine();

    System.out.println("Informe o número de sua conta!");
    int numero = scanner.nextInt();

    System.out.println("Qual o número de sua agencia? Ex.: 000-0");
    String agencia = scanner.next();

    System.out.println("Quantos você tem de saldo?");
    Double saldo = scanner.nextDouble();

    // TODO: Imprimir resultado dos dados da conta ao usuário

    scanner.close();
  }

}