import javax.swing.*;

public class Exer2{
	
	
      public static void main(String[] Args){
    	  
    	  
         Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
           if (numero %2 == 0 ){
        	    
             JOptionPane.showMessageDialog(null,"o numero: "+numero+" � Par");
           }
           
            else{
            	
            JOptionPane.showMessageDialog(null,"o numero: "+numero+" N�o � Par");
     }
   }
}
