import javax.swing.*;

public class Exer13
{
    public static void main(String args[])
    {
        Integer tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos numeros vc deseja armazenar"));

        int[] vetor = new int[tamanho];
        int aux = 0;


        for (int i = 0; i<tamanho; i++)
        {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        }
        int cont = tamanho - 1;
        for(int i = 0; i<tamanho; i++)
        {

            for(int j = 0; j<cont; j++)
            {
                if(vetor[j] > vetor[j + 1])
                {
                    aux = vetor[j]; vetor[j] = vetor[j+1]; vetor[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado em Ordem Crescente:");
        for(int i = 0; i<tamanho; i++)
        {
            System.out.println(" "+vetor[i]);
        }
    }

}
