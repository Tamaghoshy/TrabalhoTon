import javax.swing.*;


public class Exer6
{
    public static void main(String[] Args)
    {
        // Imposto e porcetagem s�o numeros de percentual.
        int valorCusto;
        int valorTotal;
        int imposto=45;
        int porcetagem=28;

        valorCusto = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de custo do carro"));
        valorTotal = (valorCusto*porcetagem/100)+(valorCusto*imposto/100)+valorCusto;
        JOptionPane.showMessageDialog(null,"O carro custar�: "+valorTotal+"R$ para o consumidor final");

    }


}
