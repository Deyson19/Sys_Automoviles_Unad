package sys_automoviles_unad;

import Forms.frmLogin;
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
            login.setLocationRelativeTo(null);
            login.setVisible(true);
        }else{
            System.exit(1);
        }

    }

}
