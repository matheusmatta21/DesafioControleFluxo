import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        int parametroUm;
        int parametroDois;

        System.out.println("Digite o primeiro parâmetro do for:");
        parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro do for:");
        parametroDois = terminal.nextInt();

        terminal.close();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int inicio, int fim) throws ParametrosInvalidosException {
        if (inicio > fim) {
            throw new ParametrosInvalidosException();
        }

        for (int i = inicio; i < fim; i++) {
            System.out.println("Imprimindo o numero: " + i);
        }

    }
}
