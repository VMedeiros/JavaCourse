public class ExercicioControleDeFluxo2 {
    public static void main(String[] args) {
        char dia = 7;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia Inválido");
        }
        if (dia >= 2 && dia < 7) {
            System.out.println("Dia de semana");
        } else if (dia == 1 || dia == 7) {
            System.out.println("Final de semana");
        }
    }
}
