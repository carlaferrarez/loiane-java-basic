import java.util.Scanner;

public class pesoIdeal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a sua altura?");
        double altura = scan.nextDouble();

        System.out.println("O peso ideal é: "+ ((72.7 * altura) - 58) + "kg");

        if(scan!=null)
            scan.close();
    }
}
