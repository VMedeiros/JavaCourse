public class ExercicioControleDeFluxo3 {
    public static void main(String[] args) {
        int par = 10000;
        for (int i = 0; i <= par; i++) {
            if (i % 2 == 0) {
                System.out.println("Par " + i);
            } else {
                System.out.println("Ímpar " + i);
            }
        }
    }
}
