import java.util.Scanner;

public class requestNumber {
    public static void main(String[] args) throws Exception {

        System.out.println("Digite um número: ");
        Scanner scan = new Scanner(System.in);

        System.out.println("O número informado foi: "+ scan.nextLine());

        if(scan!=null)
            scan.close();
    }
}
