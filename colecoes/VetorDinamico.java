package colecoes;

//generics(desde o Java 5)
//poliformismo paramétrico
public class VetorDinamico<T>{
    private static final int LIMIAR_INFERIOR = 4; //define do java
    private T [] elementos;
    private int quantidade;
    private int capacidade;

    VetorDinamico(){
        quantidade = 0;
        capacidade = LIMIAR_INFERIOR;
        //intuição
        //elementos = new T[capacidade];
        elementos = (T[]) new Object[capacidade];
    }

    public boolean estaVazio(){
        return quantidade == 0;
    }

    private void redimensionar(double fator){
        //1. alocar um vetor com a capacidade apropriada
        T[] aux = (T[]) new Object[(int)(capacidade * fator)];
        //2. copiar todo mundo
        for(int i=0; i < quantidade; i++)
            aux[i] = elementos[i];
        //3. ajustar a capacidade
        capacidade = (int)(capacidade * fator);
        //4. ajustar a variavel elementos 
        elementos = aux;
    }

    public void remover(){
        if (!estaVazio()){
            quantidade--;
            if(capacidade > LIMIAR_INFERIOR && quantidade == capacidade / 4){
                redimensionar(0.5); 
            }
        }
    } 

    public boolean estaCheio(){
        return (quantidade == capacidade);
    }

    public void adicionar(T e){
        //se esta cheio, redireciona
        if(estaCheio())
            redimensionar(2);
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