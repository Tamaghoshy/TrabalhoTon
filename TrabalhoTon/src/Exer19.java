import javax.swing.*;


public class Exer19{
	
	
    public static void main(String[] Args){
    	
    	
        Integer numeros[] = new Integer[10];
        Integer numerosolic;

        for (int i = 0; i < 10; i++){
        	
        	
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para ser gravado"));
        }
        
        numerosolic = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja pesquisar"));
        for (int i = 0; i < 10; i++)
        	
        {
            if (numerosolic.equals(numeros[i]))
            	
            {
                JOptionPane.showMessageDialog(null,"Achei");

            }
        }
        JOptionPane.showMessageDialog(null,"não achei");

    }
}
