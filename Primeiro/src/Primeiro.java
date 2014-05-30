import javax.swing.JOptionPane;

public class Primeiro {
	
	
	
	public static void main(String args[])  
    {  
        System.out.println("Hello, World!!!");  

        int soma;
        int num1 = 4;
        int num2 = 0;
        String NomeString; 
        
        NomeString = JOptionPane.showInputDialog("Texto para entrar com teclado String");
        //num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero:"));
        //num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro numero:"));
        
        
        soma =  num1 + num2; 

        //JOptionPane.showMessageDialog(null,"A soma dos numeros e: " + soma);
        
        System.out.println(soma);
        
        int n = 5; 
        while (n>0) 
        System.out.println ("tick "+ n--);
        
        for (int i=1; i<=5; i++) { 
        	if (i == 2)  
        	System.out.println ("i = "+i);
        	 
        }
        
        
        System.exit(0);
        
    }  

}
	