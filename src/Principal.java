import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos carros deseja cadastrar (máximo 50)? ");
        int quantidade = leitor.nextInt();
        leitor.nextLine();

        while (quantidade > 50 || quantidade <=0) {
            System.out.println("Quantidade inválida! O número deve estar entre 1 e 50.");
            System.out.println("Por favor, digite novamente: ");
            quantidade = leitor.nextInt();
            leitor.nextLine();
        }

        Carro[] listaDeCarros = new Carro[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nCadastro do Carro " + (i + 1));
            System.out.print("Nome do Carro: ");
            String nome = leitor.nextLine();

            System.out.print("Preço do carro: ");
            double preco = leitor.nextDouble();
            leitor.nextLine();

            listaDeCarros[i] = new Carro(nome, preco);
        }

        double somaPrecos = 0;

        System.out.println("\nRESULTADOS");
        System.out.println("Quantidade de carros criados: " + quantidade);
        System.out.print("Carros cadastrados: ");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(listaDeCarros[i]);

            if (i < quantidade - 1) {
                System.out.print(", ");
            }

            somaPrecos += listaDeCarros[i].preco;
        }

        System.out.println("\nSoma total dos preços: R$ " + somaPrecos);

        leitor.close();
    }
}
