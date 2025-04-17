package colecoes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;
class Trakz implements Comparable <Trakz>{
    private String titulo;
    private int avaliacao;

    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Trakz(String titulo, int avaliacao){
        this.titulo = titulo;
        this.avaliacao = avaliacao;
    }
    public Trakz(String titulo){
        this.titulo = titulo;
    }
    public String toString(){
        return String.format("Título: %s, Avaliação: %d", titulo, avaliacao);
    }

    @Override
    public int compareTo(Trakz o){
        //se a this for menor, então devolvemos -1
        //se for igual à 0, devolve 0
        //senão, devolvemos 1
        return this.titulo.compareTo(o.titulo);
    }

    @Override
    public boolean equals(Object obj){
        var outra = (Trakz)obj;
        return this.titulo.equals(outra.titulo);
    }
}

class AvaliaçãoComparetor implements Comparator <Trakz>{
    @Override
    public int compare(Trakz t1, Trakz t2){
        //se a avaliação de t1 for maior, devolve -1
        //se a avaliação for igual, devolve 0
        //se a avaliação de t1 for menor, devolve 1
        if(t1.getAvaliacao() < t2.getAvaliacao())  
            return -1;
        if(t1.getAvaliacao() == t2.getAvaliacao()) 
            return t1.compareTo(t2);
        return 1;

    }
}

public class MyTrakz {
    public static void main(String[] args) {
        //var minhasTrakz = new VetorDinamico<Trakz>();
        var minhasTrakz = new ArrayList<Trakz>();
        var menu = "1-Cadastrar\n2-Remover\n3-Atualzar\n4-Listar ordenado por nome\n5-Listar ordenado por avaliação\n6-Avaliar\n0-Sair";
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:{
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    var trakz = new Trakz(titulo);
                    minhasTrakz.add(trakz);
                    JOptionPane.showMessageDialog(null, "Trak adicionada!");
                    break;
                }
                case 2:{
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    var trakz = new Trakz(titulo);
                    if(minhasTrakz.contains(trakz)){
                        minhasTrakz.remove(trakz);
                        JOptionPane.showMessageDialog(null, "Musica removida");
                    }else JOptionPane.showMessageDialog(null, "Música não encontrada");
                    break;
                }
                case 3:{
                    var titulo = JOptionPane.showInputDialog(null, "Titulo?");
                    var trakz = new Trakz(titulo);
                    var indice = minhasTrakz.indexOf(trakz);
                    if(indice >= 0){
                        var novotitulo = JOptionPane.showInputDialog("Novo título:");
                        minhasTrakz.get(indice).setTitulo(novotitulo);
                        JOptionPane.showMessageDialog(null, "Música atualizada!");
                    }else JOptionPane.showMessageDialog(null,"Música não encontrada");
                    break;
                }
                case 4:{
                    if(minhasTrakz.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Lista vazia");
                    }
                    else{
                        //opera in-place: altera a lista
                        Collections.sort(minhasTrakz);
                        //[]
                        JOptionPane.showMessageDialog(null, minhasTrakz);
                    }
                    break;
                }
                case 5:{
                    if(minhasTrakz.isEmpty()) JOptionPane.showMessageDialog(null,"Está vazia");
                    else Collections.sort(minhasTrakz, new AvaliaçãoComparetor());
                    break;
                }
                case 6:{
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    var trakz = new Trakz(titulo);
                    var indice = minhasTrakz.indexOf(trakz);
                    if(indice != -1){
                        var avaliacao = Integer.parseInt(JOptionPane.showInputDialog("Avaliação?"));
                        minhasTrakz.get(indice).setAvaliacao(avaliacao);
                        JOptionPane.showMessageDialog(null, "Música avaliada");
                    }else JOptionPane.showMessageDialog(null, "Musica não encontrada");
                    break;
                }
                case 0:{
                    JOptionPane.showMessageDialog(null, "Até logo");
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
                }
            }
        }while(op != 0);
    }
}