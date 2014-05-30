package modelos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Pessoa {

    //private String nome;
    public int dataNascimento;
    private int idade;
    public int dia, mes, ano;

    public void calculaIdade() {
        Calendar dtHoje = new GregorianCalendar();
        this.idade = dtHoje.get(Calendar.YEAR) - this.dataNascimento;
    }

    public int getIdade() {
        return this.idade;
    }

    public void getNome(String nome) {
    }

    public void setDataNascimento(int dia, int mes, int ano) {
        Calendar dtHojeDia = Calendar.getInstance();
        Calendar dtHojeMes = Calendar.getInstance();
        
        if dtHojeMes.get(Calendar.MONTH) > mes  
        {
            this.dataNascimento = ano-1;
        }    
        if dtHojeMes.get(Calendar.MONTH) <= mes && dtHojeDia.get(Calendar.DAY_OF_MONTH) < dia
            {
            this.dataNascimento = ano+1;
            } else{    
                   this.dataNascimento = ano; 
                  }
        
        calculaIdade();
    }


}