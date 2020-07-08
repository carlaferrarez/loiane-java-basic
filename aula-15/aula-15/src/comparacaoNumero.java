import java.util.Scanner;

public class comparacaoNumero {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int primeiroNumero = scan.nextInt();

        System.out.println("Digite outro número:");
        int segundoNumero = scan.nextInt();

        System.out.println("O maior número é: " + ((primeiroNumero > segundoNumero) ? primeiroNumero : segundoNumero));

        scan.close();
    }
}
