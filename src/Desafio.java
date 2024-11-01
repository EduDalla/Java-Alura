import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldo = 1200;
        int escolha = 0;

        while (escolha != 4) {
            System.out.println(" ");

            System.out.println("Operações");

            System.out.println(" ");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println(" ");

            System.out.print("Digite a opção desejada: ");
            escolha = leitura.nextInt();

            if (escolha == 1) {
                System.out.println("Seu saldo atual é R$" + saldo);
            }
            if (escolha == 2) {
                System.out.print("Informe o valor que está recebendo: ");
                double recebendo = leitura.nextDouble();
                saldo += recebendo;
                System.out.println("Saldo atualizado para R$" + saldo);
            }
            if (escolha == 3) {
                System.out.print("Informe o valor que deseja transferir: ");
                double transferencia = leitura.nextDouble();

                if (transferencia > saldo) {
                    System.out.print("Não há saldo suficiente para fazer esse transferência.");
                    System.out.println(" ");
                } else {
                    saldo -= transferencia;
                    System.out.println("Saldo atualizado para R$" + saldo);
                }
            }
            if (escolha > 4 || escolha < 0) {
                System.out.println("Opção inválida!");

            }
        }

        System.out.println("Obrigado por confiar na EDU Bank! Volte sempre!");

    }
}
