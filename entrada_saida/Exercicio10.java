import java.util.Scanner;
public class Exercicio10{
    public static void main(String[] args){
        //declaração de variávies
        Scanner leitor = new Scanner(System.in);
        double valorCarro, distribuidora, imposto, total;
        //entrada de dados
        System.out.println("Digite o custo de fábrica do carro: ");
        valorCarro = leitor.nextDouble();
        //processamento
        distribuidora = valorCarro * 0.28;
        imposto = valorCarro * 0.45;
        total = valorCarro + imposto + distribuidora;
        //saída
        System.out.printf("Valor do Carro no total: %.2f\n", total);
    }
}