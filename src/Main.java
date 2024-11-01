//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é a Netflix");
        String sinopse;
        int ano = 2022;

        sinopse = """
                Filme: Top Gun: Maverick
                Filme de aventura com galâ dos anos 80
                Muito bom!
                Ano de lançamento
                """ + ano;
        System.out.println(sinopse);

        boolean incluidoNoPlano = true;
        System.out.println("Incluido no Plano? " + incluidoNoPlano);

        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0)/ 3;

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);




    }
}