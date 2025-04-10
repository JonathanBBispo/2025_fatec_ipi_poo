package colecoes;
import java.util.Random;
public class TesteVetorDinamicoV1 {
    public static void main(String[] args) throws Exception{
        var gerador = new Random();
        var v = new VetorDinamico();
        while(true){
            var oQueFazer = gerador.nextDouble();
            if(oQueFazer <= 0.5){
                var num = gerador.nextInt(1, 7); // (vai do 1ao 6, 7 não é incluído)
                v.adicionar(num);
            }
            else{
                v.remover();
            }
            System.out.println(v);
            System.out.println("************************************");
            Thread.sleep(5000);
        }
    }
}