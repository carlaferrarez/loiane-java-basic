import java.util.Scanner;

public class comparacaoProduto {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço de um produto:");
        int primeiroProduto = scan.nextInt();

        System.out.println("Digite o preço de um segundo produto:");
        int segundoProduto = scan.nextInt();

        System.out.println("Digite o preço de um terceiro produto:");
        int terceiroProduto = scan.nextInt();

        System.out.println("O produto mais barato é: " + ((primeiroProduto > segundoProduto) ? ((segundoProduto > terceiroProduto) ? terceiroProduto : segundoProduto ): ((terceiroProduto > primeiroProduto) ? primeiroProduto : terceiroProduto)));

        scan.close();
    }
}
