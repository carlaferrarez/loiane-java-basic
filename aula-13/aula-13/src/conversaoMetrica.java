import java.util.Scanner;

public class conversaoMetrica {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma medição em metros: ");
        double numeroMetro = scan.nextDouble();

        System.out.println("Medição em centímetros "+ (numeroMetro * 100)+ " cm");
    }
}
