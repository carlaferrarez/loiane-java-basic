import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double notaUm = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double notaDois = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double notaTres = scan.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double notaQuatro = scan.nextDouble();

        System.out.println("A média das notas é: "+ ((notaUm + notaDois + notaTres + notaQuatro)/4));

        if(scan!=null)
            scan.close();
    }
}
