package controle;

import interfaces.IntUsuario;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

public class ControleRelogio implements Runnable {

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void exibirRelogio(IntUsuario u){
        
        JLabel jData = null;
        JLabel jHora = null;
        
        for(int i=0;i<u.getContentPane().getComponentCount();i++){
            
            if(u.getContentPane().getComponent(i).getName().equals("jData")){
                jData = (JLabel) u.getContentPane().getComponent(i);
            }
            if(u.getContentPane().getComponent(i).getName().equals("jHora")){
                jHora = (JLabel) u.getContentPane().getComponent(i);
            }
        }
        
        SimpleDateFormat hFormato = null;
        SimpleDateFormat dFormato = new SimpleDateFormat("dd/MM/Y");
        
        hFormato = new SimpleDateFormat("H");
        String hora = acertaDigito(hFormato.format(new Date()),2);
        hFormato = new SimpleDateFormat("m");
        String minuto = acertaDigito(hFormato.format(new Date()),2);
        hFormato = new SimpleDateFormat("s");
        String segundo = acertaDigito(hFormato.format(new Date()),2);
        
        Calendar calend = Calendar.getInstance();
        dFormato.setCalendar(calend);
        
        jData.setText(dFormato.format(new Date()));
        jHora.setText(hora+":"+minuto+":"+segundo);
        
    }
    
    private static String acertaDigito(String digito, int tamanho) {
        String retorno = digito;
        for(int i=digito.length();i<tamanho;i++) {
            retorno="0"+retorno;
        }
        return retorno;
    }
    
}

