import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Eduardo";
        String tipoConta = "Corrente";

        double saldo = 1200;
        int escolha = 0;

        String menu = """
                Operações
                
                1 - Consultar saldos"
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        while (escolha != 4) {
            System.out.println(" ");

            System.out.println(menu);

            System.out.print("Digite a opção desejada: ");
            escolha = leitura.nextInt();

            if (escolha == 1) {
                System.out.println("Seu saldo atual é R$" + saldo + " e o tipo de conta é " + tipoConta);
            } else if (escolha == 2) {
                System.out.print("Informe o valor que está recebendo: ");
                double recebendo = leitura.nextDouble();
                saldo += recebendo;
                System.out.println("Saldo atualizado para R$" + saldo);
            } else if (escolha == 3) {
                System.out.print("Informe o valor que deseja transferir: ");
                double transferencia = leitura.nextDouble();

                if (transferencia > saldo) {
                    System.out.println("Não há saldo suficiente para fazer esse transferência.");
                } else {
                    saldo -= transferencia;
                    System.out.println("Saldo atualizado para R$" + saldo);
                }
            } else if (escolha != 4) {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("Obrigado por confiar na EDU Bank, " + nome + "! Volte sempre!");

    }
}
