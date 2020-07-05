import java.util.Scanner;

public class conversaoTemp {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a temperatura em Farenheit?");
        double tempF = scan.nextDouble();

        System.out.println("Temperatura em Celsius: "+ (5 * (tempF - 32)/9) + "°C");

        if(scan!=null)
            scan.close();
    }
}
