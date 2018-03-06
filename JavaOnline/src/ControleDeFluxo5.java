public class ControleDeFluxo5 {
    public static void main(String[] args) {
        double valor = 30000;
        for (int parcela = 1; parcela <= valor; parcela++) {
            double valorParcela = valor / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela é " + parcela + " R$: " + valorParcela);
        }
    }
}
