import java.util.Scanner;

public class salarioMensal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double precoHora = scan.nextDouble();

        
        System.out.println("Quantas horas você trabalhou por mês?");
        double horaMes = scan.nextDouble();

        System.out.println("Salario do mês: R$ "+ (precoHora*horaMes));
    }
}
