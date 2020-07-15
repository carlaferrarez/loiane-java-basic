import java.util.Scanner;

public class entreUmeDez {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma nota entre 1 e 10");
        double nota = scan.nextDouble();

        while(nota > 10 || nota < 1){
            System.out.println("Valor inválido. Digite uma nota entre 1 e 10");
            double notaux = scan.nextDouble();
            nota = notaux;
        }

        System.out.println("O valor digitado é "+ nota);
        scan.close();
    }
}
