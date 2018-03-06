public class OperadoresDeAtribuicao {
    public static void main(String[] args) {

        int salario = 1800;
        int numero = 11;


        //soma salario + 1000
        salario += 1000;
        //subtrai salario - 1000
        salario -= 1000;
        //10% de salario
        salario *= 0.1;

        // verifica o resto da divisão por 2
        numero %= 2;

        System.out.println(salario);
        System.out.println(numero);
    }
}
