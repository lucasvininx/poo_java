import java.util.ArrayList;
import java.util.Scanner;
public class BibliotecaDeMusica {
    public static void main(String[] args) {
        ArrayList<String> titulos = new ArrayList<>();
        ArrayList<String> artistas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar música");
            System.out.println("2. Remover música");
            System.out.println("3. Pesquisar música por título ou artista");
            System.out.println("4. Exibir biblioteca de músicas");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner
            switch (opcao) {
                case 1:
                    System.out.println("Digite o título da música:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o nome do artista:");
                    String artista = scanner.nextLine();
                    titulos.add(titulo);
                    artistas.add(artista);
                    System.out.println("Música adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o título da música que deseja remover:");
                    String tituloRemover = scanner.nextLine();
                    for (int i = 0; i < titulos.size(); i++) {
                        if (titulos.get(i).equalsIgnoreCase(tituloRemover)) {
                            titulos.remove(i);
                            artistas.remove(i);
                            System.out.println("Música removida com sucesso!");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o título ou o artista da música que deseja pesquisar:");
                    String termoPesquisa = scanner.nextLine();
                    System.out.println("Resultados da pesquisa:");
                    for (int i = 0; i < titulos.size(); i++) {
                        if (titulos.get(i).contains(termoPesquisa) || artistas.get(i).contains(termoPesquisa)) {
                            System.out.println("Título: " + titulos.get(i) + ", Artista: " + artistas.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Biblioteca de Música:");
                    for (int i = 0; i < titulos.size(); i++) {
                        System.out.println("Título: " + titulos.get(i) + ", Artista: " + artistas.get(i));
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
}