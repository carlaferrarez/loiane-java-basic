import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raioCirculo = scan.nextDouble();

        System.out.println("Área do circulo "+ ((Math.pow(raioCirculo, 2))* Math.PI)+ " m²");

        if(scan!=null)
            scan.close();
    }
}
