public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 15;

        float maiorQue = numero1;
        float menorQue = numero2;

        boolean validade = maiorQue >= menorQue;
        boolean validade2 = maiorQue <= menorQue;

        boolean verifica = maiorQue % 2 == 0;
        boolean verifica2 = menorQue % 2 == 0;

        int soma = numero1 + numero2;

        System.out.println("A some é " + (numero1 + numero2) + " outra " + soma);
        System.out.println("Teste 1" + validade);
        System.out.println("Teste 2" + validade2);
        System.out.println("Teste 3" + verifica);
        System.out.println("Teste 4" + verifica2);

    }
}
