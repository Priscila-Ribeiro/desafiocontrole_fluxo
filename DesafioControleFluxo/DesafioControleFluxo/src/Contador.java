import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int parametro1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int parametro2 = scanner.nextInt();

            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Os parâmetros devem ser números inteiros.");
        } finally {
            scanner.close();
        }
    }

    public static void contar(int inicio, int fim) throws ParametrosInvalidosException {
        if (inicio > fim) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        for (int i = inicio; i <= fim; i++) {
            System.out.println("Número: " + i);
        }
    }
}
