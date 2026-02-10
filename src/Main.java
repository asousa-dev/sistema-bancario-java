import java.util.Scanner;
import java.util.Locale;
import entities.ContaBanco;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();
        int option;

        do {
            System.out.println("""
            
            O que deseja fazer agora?

            1 - Abrir conta
            2 - Fechar conta
            3 - Sacar
            4 - Depositar
            5 - Pagar mensalidade
            6 - Detalhes da conta
            0 - Sair
            """);
            option = sc.nextInt();

            switch (option){
                case 1:
                    sc.nextLine();

                    System.out.println("Digite seu nome completo: ");
                    String nome = sc.nextLine();
                    conta.setDono(nome);

                    System.out.println("Você deseja abrir uma conta corrente (Digite 'cc') ou uma conta poupança (Digite 'cp')?");
                    conta.setTipo(sc.nextLine());

                    conta.abrirConta();

                    System.out.printf("Detalhes da conta: \n NOME: " + conta.getDono() + "\n SALDO: R$ " + conta.getSaldo() +"\n TIPO DA CONTA: " + conta.getTipo());
                    break;

                case 2:
                    conta.fecharConta();
                    break;

                case 3:
                    System.out.println("Quanto você deseja sacar? ");
                    double remSaldo = sc.nextDouble();
                    conta.sacar(remSaldo);

                    System.out.println("Saldo atualizado: "+ conta.getSaldo());
                    break;

                case 4:
                    System.out.println("Quanto você deseja depositar?");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);

                    System.out.println("Saldo atualizado: "+ conta.getSaldo());
                    break;

                case 5:
                    conta.pagarMensal();
                    System.out.println("Saldo atualizado: "+ conta.getSaldo());
                    break;

                case 6:
                    System.out.printf("Detalhes da conta: \n NOME: " + conta.getDono() + "\n SALDO: R$ " + conta.getSaldo() +"\n TIPO DA CONTA: " + conta.getTipo() + "\n STATUS DA CONTA: " + conta.isStatus());
                    break;

                case 0: return;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 0);


    }
}