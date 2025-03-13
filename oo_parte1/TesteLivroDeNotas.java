public class TesteLivroDeNotas{
    public static void main(String...args){
        //1. Construir o livro de notas
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        LivroDeNotas livro2 = new LivroDeNotas();
        //livroDeNotas.nomeDaDisciplina = "POO";
        livroDeNotas.setNomeDaDisciplina = ("POO");
        livro2.nomeDaDisciplina = "BD";

        //2. Acionar o comportamento dele de exibir a mensagem de boas vindas
        livroDeNotas.exibirMensagem();
        livro2.exibirMensagem();
    }
}

