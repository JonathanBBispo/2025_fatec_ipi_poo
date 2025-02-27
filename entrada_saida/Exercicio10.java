import javax.swing.JOptionPane;
public class Exercicio10{
    public static void main(String[] args){
        //declaração de variávies
        double valorCarro, distribuidora, imposto, total;
        //entrada de dados
        valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fábrica do carro: "));
        //processamento
        distribuidora = valorCarro * 0.28;
        imposto = valorCarro * 0.45;
        total = valorCarro + imposto + distribuidora;
        //saída
        JOptionPane.showMessageDialog(null, "Valor do Carro no total: " + total);
    }
}