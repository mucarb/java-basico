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

    System.out.println("Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo R$")
        .concat(String.valueOf(saldo)).concat(" já está disponível para saque."));

    scanner.close();
  }

}