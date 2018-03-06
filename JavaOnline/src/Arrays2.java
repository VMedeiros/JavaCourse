public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "José";
        int tamanhoArray = nomes.length;
        for (int i = 0; i <= 2; i++)
            System.out.println((i + 1) + " Nome: " + nomes[i]);
        System.out.println("Tamanho da lista: " + tamanhoArray);
    }
}
