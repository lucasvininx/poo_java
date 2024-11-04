import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AvaliacoesDeFilmes {
   Map<String, Double> avaliacoes = new HashMap<>();
   Scanner scanner = new Scanner(System.in);

   public void adicionarAvaliacao(String filme, double avaliacao) {
       avaliacoes.put(filme, avaliacao);
   }

   public void atualizarAvaliacao(String filme, double novaAvaliacao) {
       if (avaliacoes.containsKey(filme)) {
           avaliacoes.put(filme, novaAvaliacao);
           System.out.println("Avaliação do filme atualizada com sucesso!");
       } else {
           System.out.println("Filme não encontrado!");
       }
   }

   public double calcularMediaAvaliacoes() {
       if (avaliacoes.isEmpty()) {
           return 0.0;
       }
       double soma = 0;
       for (double avaliacao : avaliacoes.values()) {
           soma += avaliacao;
       }
       return soma / avaliacoes.size();
   }

   public void exibirFilmesMaisBemAvaliados() {
       double melhorAvaliacao = Double.MIN_VALUE;
       String melhorFilme = null;
       for (Map.Entry<String, Double> entry : avaliacoes.entrySet()) {
           if (entry.getValue() > melhorAvaliacao) {
               melhorAvaliacao = entry.getValue();
               melhorFilme = entry.getKey();
           }
       }
       if (melhorFilme != null) {
           System.out.println("Filme mais bem avaliado: " + melhorFilme + " (Avaliação: " + melhorAvaliacao + ")");
       } else {
           System.out.println("Nenhum filme avaliado ainda.");
       }
   }

   public static void main(String[] args) {
       AvaliacoesDeFilmes avaliacoesDeFilmes = new AvaliacoesDeFilmes();
       Scanner scanner = new Scanner(System.in);

       avaliacoesDeFilmes.adicionarAvaliacao("Matrix", 4.5);
       avaliacoesDeFilmes.adicionarAvaliacao("Interestelar", 4.7);
       avaliacoesDeFilmes.adicionarAvaliacao("O Poderoso Chefão", 4.8);

       while (true) {
           System.out.println("\nMenu:");
           System.out.println("1 - Adicionar Avaliação");
           System.out.println("2 - Atualizar Avaliação");
           System.out.println("3 - Calcular Avaliação Média");
           System.out.println("4 - Exibir Filme Mais Bem Avaliado");
           System.out.println("5 - Sair");

           System.out.print("Escolha uma opção: ");
           int opcao = scanner.nextInt();
           scanner.nextLine(); // Consumir a quebra de linha após o número

           switch (opcao) {
               case 1:
                   System.out.print("Escolha um filme (Matrix, Interestelar, O Poderoso Chefão): ");
                   String filmeAdicionar = scanner.nextLine();
                   if (avaliacoesDeFilmes.avaliacoes.containsKey(filmeAdicionar)) {
                       System.out.print("Avaliação do filme: ");
                       double avaliacaoAdicionar = scanner.nextDouble();
                       avaliacoesDeFilmes.adicionarAvaliacao(filmeAdicionar, avaliacaoAdicionar);
                       System.out.println("Avaliação adicionada com sucesso!");
                   } else {
                       System.out.println("Filme não reconhecido.");
                   }
                   break;
               case 2:
                   System.out.print("Escolha um filme (Matrix, Interestelar, O Poderoso Chefão): ");
                   String filmeAtualizar = scanner.nextLine();
                   if (avaliacoesDeFilmes.avaliacoes.containsKey(filmeAtualizar)) {
                       System.out.print("Nova avaliação do filme: ");
                       double novaAvaliacao = scanner.nextDouble();
                       avaliacoesDeFilmes.atualizarAvaliacao(filmeAtualizar, novaAvaliacao);
                   } else {
                       System.out.println("Filme não encontrado!");
                   }
                   break;
               case 3:
                   System.out.println("Avaliação Média: " + avaliacoesDeFilmes.calcularMediaAvaliacoes());
                   break;
               case 4:
                   avaliacoesDeFilmes.exibirFilmesMaisBemAvaliados();
                   break;
               case 5:
                   System.out.println("Saindo...");
                   System.exit(0);
               default:
                   System.out.println("Opção inválida!");
           }
       }
   }
}