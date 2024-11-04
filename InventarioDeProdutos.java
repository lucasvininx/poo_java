import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class InventarioDeProdutos {
    public static void main(String[] args) {
        Map<String, Double> precos = new HashMap<>();
        Map<String, Integer> quantidades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Atualizar Preço");
            System.out.println("3 - Atualizar Quantidade");
            System.out.println("4 - Pesquisar Produto");
            System.out.println("5 - Exibir Inventário");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número
            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto a ser adicionado: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Preço do produto: ");
                    double precoAdicionar = scanner.nextDouble();
                    System.out.print("Quantidade do produto: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    precos.put(nomeAdicionar, precoAdicionar);
                    quantidades.put(nomeAdicionar, quantidadeAdicionar);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do produto a ter o preço atualizado: ");
                    String nomePreco = scanner.nextLine();
                    if (precos.containsKey(nomePreco)) {
                        System.out.print("Novo preço do produto: ");
                        double novoPreco = scanner.nextDouble();
                        precos.put(nomePreco, novoPreco);
                        System.out.println("Preço do produto atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 3:
                    System.out.print("Nome do produto a ter a quantidade atualizada: ");
                    String nomeQuantidade = scanner.nextLine();
                    if (quantidades.containsKey(nomeQuantidade)) {
                        System.out.print("Nova quantidade do produto: ");
                        int novaQuantidade = scanner.nextInt();
                        quantidades.put(nomeQuantidade, novaQuantidade);
                        System.out.println("Quantidade do produto atualizada com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 4:
                    System.out.print("Nome do produto a ser pesquisado: ");
                    String nomePesquisa = scanner.nextLine();
                    if (precos.containsKey(nomePesquisa)) {
                        System.out.println("Preço: " + precos.get(nomePesquisa));
                        System.out.println("Quantidade: " + quantidades.get(nomePesquisa));
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 5:
                    System.out.println("Inventário de Produtos:");
                    for (Map.Entry<String, Double> entry : precos.entrySet()) {
                        System.out.println(entry.getKey() + ": Preço: " + entry.getValue() +
                                ", Quantidade: " + quantidades.get(entry.getKey()));
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}