public class ControleDeFluxo6 {
    public static void main(String[] args) {
        double valor = 30000;
        for (int parcela = (int) valor; parcela >= 1; parcela--) {
            double valorParcela = valor / parcela;
            if (valorParcela <= 1000) {
             continue;}
                System.out.println("Parcela é " + parcela + " R$: " + valorParcela);

        }

    }
}
