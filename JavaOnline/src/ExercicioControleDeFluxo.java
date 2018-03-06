public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
        double salario = 2000;
        double imposto = 0;

        if (salario < 1000) {
            imposto = salario *= 0.05;
        } else if (salario >= 1000 && salario <= 2000) {
            imposto = salario *= 0.1;
        } else if (salario >= 1000 && salario <= 4000) {
            imposto = salario *= 0.15;
        } else {
            imposto = salario *= 0.2;
        }

        System.out.println("O valor do imposto é: " + imposto);
    }
}
