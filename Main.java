

public class Main {
    public static void main(String[] args) {
        double pequeno = 13.5;
        byte medio = 15;
        double grande = 17.5;

        var qtdPequenos = pequeno*4;
        var qtdMedio = medio*4;
        var qtdgrande = grande*4;

        var somaFinal = qtdPequenos+ qtdMedio+ qtdgrande;

        System.out.println("a soma final é de: " +somaFinal);

    }
}