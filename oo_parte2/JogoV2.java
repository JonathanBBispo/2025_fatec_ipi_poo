import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var ng = new Personagem(); 
        ng.nome = "Curry";
        while (true) {
            // 1. Caçar
            // 2. Comer
            // 3. Dormir
            var oQueFazer = 1 + gerador.nextInt(3);
            switch(oQueFazer){
                case 1:
                    ng.cacar();
                    break;
                case 2:
                    ng.comer();
                    break;
                case 3:
                    ng.dormir();
                    break;
            }
        System.out.println(ng);
        System.out.println("***********");
        Thread.sleep(8000);     
        }
    }
}