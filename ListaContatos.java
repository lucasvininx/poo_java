import java.util.Scanner;
import java.util.ArrayList;

public class ListaContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nome = new ArrayList<>();

        for(int x=0; x<=2;x++){
            System.out.println("Digite um contato");
            String contato = sc.next();
            nome.add(contato);
        } for (int i=1; i<=1; i++){
            System.out.println("Deseja remover algum contato? True = (Sim) Or False = (Não)");
            boolean yesOrno = sc.nextBoolean();
            if(yesOrno == true){
                System.out.println("Quais nomes desejam retirar?");
                String remove = sc.next();
                nome.remove(remove);
                System.out.println("Nome: "+remove+" foi removido.");
                System.out.println("Sua lista atualizada:\n "+nome);//UPDATE CONTACT;
            } else {
                System.out.println("Sua lista continua a mesma\n "+nome);//ADD CONTACT;
                break;
            }

        }




    }
}