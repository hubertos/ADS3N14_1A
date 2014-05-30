package visualizacao;

import controle.ControleRelogio;
import interfaces.IntUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Relogio {

    public static void main(String[] args) {
        try {
            IntUsuario u = new IntUsuario();
            u.show();
            while (true) {
                ControleRelogio cr = new ControleRelogio();
                cr.exibirRelogio(u);
                Thread tr = new Thread(cr);
                tr.sleep(1000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Relogio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
