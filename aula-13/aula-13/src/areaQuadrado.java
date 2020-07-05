import java.util.Scanner;

public class areaQuadrado {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o comprimento do quadrado: ");
        double medidaQuadrado = scan.nextDouble();

        System.out.println("Área do quadrado em dobro "+ ((Math.pow(medidaQuadrado, 2))* 2)+ " m²");
    }
}
