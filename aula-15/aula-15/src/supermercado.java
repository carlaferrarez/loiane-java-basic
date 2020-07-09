import java.util.Scanner;

public class supermercado {
    public static void main(final String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Selecione qual carne deseja:");
        System.out.println("F - File Duplo / A - Alcatra / P - Picanha");
        char carne = scan.next().charAt(0);

        System.out.println("Quantos kg deseja?");
        int quilos = scan.nextInt();

        double total = 0;

        System.out.println("A compra será no cartão Tabajara?");
        System.out.println("S - Sim / N - Não");
        String cartao = scan.next();

        scan.close();

        switch (carne){
            case 'F': total = ((quilos <= 5) ? (4.9*quilos) : (5.8*quilos)); break;
            case 'A': total = ((quilos <= 5) ? (5.9*quilos) : (6.8*quilos)); break;
            case 'P': total = ((quilos <= 5) ? (6.9*quilos) : (7.8*quilos)); break;
            default: System.out.println("Favor selecionar alguma das opções: F - File Duplo / A - Alcatra / P - Picanha"); System.exit(1);
        }

        System.out.println("CUPOM FISCAL");
        System.out.println("Tipo de carne: "+ carne);
        System.out.println("Quantidade de carne: " + quilos + " kg");
        System.out.println("Preço total: R$ " + total);
        System.out.println("Tipo de pagamento: " + ((cartao.equals("S") ? "Cartão Tabajara" : "Não informado")));
        System.out.println("Valor do desconto: R$ " + ((cartao.equals("S") ? (total*0.05) : "0.00")));
        System.out.println("Valor a pagar: R$ " + ((cartao.equals("S") ? (total*0.95) : total)));
    }
}
