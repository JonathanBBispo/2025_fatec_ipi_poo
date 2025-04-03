package colecoes;

public class BasicoDeVetores {
    public static void main(String[] args) {
        //declaração de vetores
        int [] v1 = {5, 7, 2, 2}; //substitui o new se souber os valores antes
        System.out.println(v1.length);
        var media = 0d; // 0 double
        for(int i = 0; i < v1.length; i++){
            // System.out.println(v1[i]);
            media+=v1[i];
        } media /= v1.length;
        System.out.println(media);
    }
}
