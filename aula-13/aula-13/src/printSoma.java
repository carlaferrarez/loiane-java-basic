import java.util.Scanner;

public class printSoma {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroUm = scan.nextInt();

        System.out.println("Digite outro número: ");
        int numeroDois = scan.nextInt();

        System.out.println("A soma é: "+ (numeroDois + numeroUm));
    }
}
