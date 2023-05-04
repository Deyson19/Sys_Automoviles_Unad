package sys_automoviles_unad;

import Forms.frmLogin;
import Forms.frmNuevoAdmin;
import Helpers.ComprobadorServidor;

/**
 *
 * @author Deyson Vente
 */
public class Sys_Automoviles_Unad {

    public static void main(String[] args) {
        ComprobadorServidor c = new ComprobadorServidor();
        // TODO code application logic here
        if (c.comprobarConexion()) {
            frmLogin login = new frmLogin();
            //frmNuevoAdmin login = new frmNuevoAdmin();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
        }else{
            System.exit(1);
        }

    }

}
