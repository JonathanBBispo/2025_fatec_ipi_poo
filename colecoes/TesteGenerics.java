package colecoes;
class Musica(){

}
public class TesteGenerics {
    public static void main(String[] args) {
        VetorDinamico<Integer> ints = new VetorDinamico<>();
        //var ints = new VetorDivetornamico<Integer>(); exemplo usando var
        var minhasMusicas = new VetorDinamico<Musica>();
        minhasMusicas.adicionar(new Musica());
        var meusInteiros = new VetorDinamico<Integer>();
        meusInteiros.adicionar(1);
    }
    
}
