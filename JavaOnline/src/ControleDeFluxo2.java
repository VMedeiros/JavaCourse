public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 17;
        String status;

        //if e else tradicional
        if (idade < 18) {
            status = "Não é adulto";

        } else {
            status = "Adulto";
        }

        //operador ternario
        status = idade < 18 ? "Não adulto" : "Adulto";
        System.out.println(status);
    }
}
