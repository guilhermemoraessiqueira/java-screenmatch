public class Filme {
    String nome;
    int anoDeLancamento;
    boolean inclidoNoPlano;
    double somaDasAvaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exbibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Está incluso no plano: " + inclidoNoPlano);
        System.out.println("Avaliação: " + somaDasAvaliacao);
        System.out.println("Quantidade de avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração: " + duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDasAvaliacao += nota;
        totalDeAvaliacoes ++;
    }

    double pegaMedia(){
        return somaDasAvaliacao/totalDeAvaliacoes;
    }
}
