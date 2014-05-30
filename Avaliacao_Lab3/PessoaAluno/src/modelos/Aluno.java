package modelos;
import javax.swing.JOptionPane;

public class Aluno extends Pessoa {

    private String nomeCurso;
    private String nome;
    
    public String getNomeCurso() {
        nomeCurso = JOptionPane.showInputDialog("Nome do Curso");
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    
      public String getDataNascimento() {
        
        dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Mês")); 
        ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Ano"));
               
        this.setDataNascimento(dia,mes,ano);
        return null;
    }
      
      public String getNomeAluno() {
        
        nome = JOptionPane.showInputDialog("Nome do Aluno");
        this.getNome(nome);
        return null;
    }

       public void mostraDados(){
        
        String nomeAluno = getNomeAluno();
        String dataNascimento = getDataNascimento();
                
        System.out.println("Nome do aluno: "+this.getNome());
        System.out.println("Idade do aluno: "+this.getIdade());
        System.out.println("Curso: "+this.getNomeCurso());

    }

  
}
