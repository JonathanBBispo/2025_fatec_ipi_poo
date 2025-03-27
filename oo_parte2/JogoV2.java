import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var ng = new Personagem();
        var ng2 = new Personagem("Lebron", 10, 10, 0);
        var ng3 = new Personagem("Soneca", 4, 4, 10);
        Personagem [] personagens = {ng, ng2, ng3};
        while (true) {
            var quemVaiJogar = gerador.nextInt(personagens.length);
            // 1. Caçar
            // 2. Comer
            // 3. Dormir
            //Descobrir quantos metodos a classe personagem possui
            // var qtosMetodos = personagem.getMetodos().length; 
            var oQueFazer = 1 + gerador.nextInt(3);
            switch(oQueFazer){
                case 1:
                    personagens[quemVaiJogar].cacar();
                    break;
                case 2:
                    personagens[quemVaiJogar].comer();
                    break;
                case 3:
                    personagens[quemVaiJogar].dormir();
                    break;
            }
        System.out.println(personagens[quemVaiJogar]);
        System.out.println("***********");
        Thread.sleep(8000);
        }
    }
}