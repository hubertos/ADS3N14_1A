import javax.swing.JOptionPane;  
  
public class NewClass {  
    public static void main(String[] args) {  
    String idadeStrin;  
    int idadeInt;  
      
      
    idadeStrin = JOptionPane.showInputDialog("Texto para entrar com teclado String");  
          
//   converte a String em int  
     idadeInt = intparseDouble(idadeStrin);  
}  
  
    private static int intparseDouble(String idade) {  
        // TODO Auto-generated method stub  
        return 0;  
    }  
}  