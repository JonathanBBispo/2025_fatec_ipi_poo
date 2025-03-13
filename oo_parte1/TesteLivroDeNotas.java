public class TesteLivroDeNotas{
    public static void main(String...args){
        //1. Construir o livro de notas
        LivroDeNotas livroDeNotas = new LivroDeNotas("POO");

        System.out.println(livroDeNotas.getNomeDaDisciplina());

        //2. Acionar o comportamento dele de exibir a mensagem de boas vindas
        livroDeNotas.exibirMensagem();
    }
}

