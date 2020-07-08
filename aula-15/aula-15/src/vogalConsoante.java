import java.util.Scanner;

public class vogalConsoante {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        char letra = scan.next().charAt(0);

        if (Character.isLetter(letra)){

            switch(Character.toLowerCase(letra)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': System.out.println("É uma vogal"); break;
                default: System.out.println("É uma consoante");
            }
        }

        else {
            System.out.println("Esse caracter não é uma letra");
        }
        scan.close();
    }
}
