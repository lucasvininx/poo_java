import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaSeguidores {
    static Set<String> seguidores = new HashSet<>();
    static Scanner scanner = new Scanner(System.in);

    public static void
    adicionarSeguidor(String seguidor)
    {
        seguidores.add(seguidor);
    }
    public static void
    removerSeguidor(String seguidor)
    {
        seguidores.remove(seguidor);
    }

    public static boolean
    verificarSeguidor(String seguidor)
    {
        return
        seguidores.contains(seguidor);
    }

    public static int
    numeroTotalSeguidores(){
        return seguidores.size();
    }

    public static void main (String[] args){
        while (true){
            System.out.println("\nMenu:");
            System.out.println("1- Adicionar Seguidor");
            System.out.println("2- Remover Seguidor");
            System.out.println("3- Verificar Seguidor");
            System.out.println("4- Número Total de Seguidores");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Nome do seguidor para ser adicionado: ");
                    String seguidorAdicionar = scanner.nextLine();

                    adicionarSeguidor(seguidorAdicionar);
                    System.out.println("Seguidor adicionado com sucesso");
                    break;

                case 2:
                    System.out.print("Nome do seguidor para ser removido: ");
                    String seguidorRemover = scanner.nextLine();

                    removerSeguidor(seguidorRemover);
                    System.out.println("Seguidor removido com sucesso");
                    break;

                case 3:
                    System.out.print("Nome do seguidor para ser verificado: ");
                    String seguidorVerificar = scanner.nextLine();

                    if (verificarSeguidor(seguidorVerificar)){
                        System.out.println("O seguidor existe");
                    } else{
                        System.out.println("O seguidor não existe");
                    }
                    break;

                case 4:
                    System.out.print("Número total de seguidores: " + numeroTotalSeguidores());
                    break;


            }
        }
    }

}
