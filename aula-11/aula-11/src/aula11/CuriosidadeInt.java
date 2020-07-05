package aula11;

public class CuriosidadeInt {

    public static void main (String[] args){

        // Os números no java são como uma roleta

        int var1  = 2147483647;
        int var2 = 2147483647;

        long var3  = 2147483648l;
        long var4 = 2147483648l;

        long cpf = 101_12_31; //entre os números, não pode ser usado no final e nem no comeco

        System.out.println(var1 + var2);
        System.out.println(var3 + var4);
        System.out.println(cpf);
    }
    
}