public class Personagem {
    String nome = null;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " caçando");
            energia -=2;    
        }
        else{
            System.out.println(nome + " Sem energia para caçar");
        }
        fome = fome < 10 ? fome + 1 : fome;
        sono = Math.min(sono + 1,10);
    }
    void comer(){
        if (fome >= 1){
            System.out.print(nome + " comendo\n");
            fome--;
            energia = energia < 10 ? energia + 1 : energia;
        }  
        else{
            System.out.println(nome + " Sem fome para comer");
        }
    }
    void dormir(){
        if(sono >= 1){
            System.out.printf("%s dormindo\n", nome);
            sono--;
            switch(energia){
                case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9:
                    energia++;
                break;
            }
        }
        else{
            System.out.println(nome + " Sem sono para dormir");
        }
    }

    @Override
    public String toString(){
        return String.format(
            "%s: E:%d F:%d S:%d"
            ,nome, energia, fome, sono);
    }
}
