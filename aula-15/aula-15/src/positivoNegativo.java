import java.util.Scanner;

public class positivoNegativo {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        String letra = scan.next();

        System.out.println(((letra.equals("F")) ? "F - Feminino" : ((letra.equals("M")) ? "M - Masculino" : "Sexo inválido")));

        scan.close();
    }
}
