import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Informer seu nome!");

    System.out.println("Informe o número de sua conta!");

    System.out.println("Qual o número de sua agencia? Ex.: 000-0");

    System.out.println("Quantos você tem de saldo?");

    // TODO: Receber os dados pelo scanner

    // TODO: Imprimir resultado dos dados da conta ao usuário

    scanner.close();
  }

}