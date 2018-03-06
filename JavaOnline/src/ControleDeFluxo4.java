public class ControleDeFluxo4 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }
        do {
            System.out.println("Entrou no Do_While");
        } while (contador < 10);
        System.out.println(contador);
        contador++;

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + (i));
            if (i == 5) {
                break;
            }
        }
    }
}
