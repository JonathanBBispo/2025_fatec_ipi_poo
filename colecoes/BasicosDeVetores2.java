package colecoes;

public class BasicosDeVetores2 {
    public static void main(String[] args) {
        int [] v = {1, 2};
        manipulaVetor(v);
        System.out.println(v[0]);
        System.out.println(v[1]);
        //passagem de parametros por valor e por referência
        // int b = 3;
        // manipulaValor(b);
        // System.out.println(b);
    }

    static void manipulaVetor(int [] x){
        x[0] = 10;
        x[1] = 20;
    }
    //passagem por cópia
    static void manipulaValor(int a){
        a = 2;
    }
}
