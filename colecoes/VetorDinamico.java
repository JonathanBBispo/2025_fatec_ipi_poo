package colecoes;
public class VetorDinamico {
    private static final int LIMIAR_INFERIOR = 4; //define do java
    private int [] elementos;
    private int quantidade;
    private int capacidade;

    VetorDinamico(){
        quantidade = 0;
        capacidade = LIMIAR_INFERIOR;
        elementos = new int[capacidade];
    }

    public boolean estaVazio(){
        return quantidade == 0;
    }

    public void remover(){
        if (!estaVazio()){
            quantidade--;
            if(capacidade > LIMIAR_INFERIOR && quantidade == capacidade / 4){
                //1. alocar um novo vetor com a metade da capacidade
                var aux = new int[capacidade / 2];
                //2. copiar todo mundo do elementos
                for(int i=0; i < quantidade; i++)
                    aux[i] = elementos[i];
                //3. atualizar o valor da capacidade
                capacidade /= 2;
                //4. apontar o vetor elementos para o novo vetor
                elementos = aux;
            }
        }
    } 

    public boolean estaCheio(){
        return (quantidade == capacidade);
    }

    public void adicionar(int e){
        //se esta cheio, redireciona
        if(estaCheio()){
            //redireciona
            //1. alocar um novo vetor com o dobro da capacidade
            var aux = new int[capacidade * 2];
            //2. copiar todo mundo do elementos
            for(int i=0; i < capacidade; i++)
                aux[i] = elementos[i];
            //3. atualizar o valor da capacidade
            capacidade *= 2;
            //4. apontar o vetor elementos para o novo vetor
            elementos = aux;
        }
        elementos[quantidade++] = e;
    }

    public String toString(){
        var sb = new StringBuilder("");
        sb.append("Quantidade: ").append(quantidade).append("\n");
        sb.append("Capacidade: ").append(capacidade).append("\n");
        for(int i = 0; i < quantidade; i++){
            sb.append(elementos[i]).append(i != quantidade - 1 ? " " : "");
        }
        return sb.toString();
    }
}