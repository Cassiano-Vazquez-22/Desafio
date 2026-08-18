import java.util.Scanner;

public class CalculoMediaTechStart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;
        double media;
        boolean aprovado;

        System.out.print("Digite a 1ª nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Digite a 4ª nota: ");
        nota4 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        aprovado = (media >= 7.0);

        System.out.println("\n--- RELATÓRIO DO ESTAGIÁRIO (TECHSTART) ---");
        System.out.printf("Média Final: %.2f\n", media);
        System.out.println("Aprovado (true = Sim / false = Não): " + aprovado);

        scanner.close();
    }
}
