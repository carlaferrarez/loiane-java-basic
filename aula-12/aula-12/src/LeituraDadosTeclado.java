import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        String primeiroNome[] = nomeCompleto.split(" ");

        System.out.println("Seu nome completo: " + nomeCompleto);
        System.out.println("Seu primeiro nome é: " + primeiroNome[0]);
    }
}
