
package paquete1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Conexion cn = new Conexion();

        if (cn.conectar() != null) {
            Tabla tb = new Tabla();
            tb.setVisible(true);
            tb.setTitle("Menu");
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos, no se pudo conectar con la base de datos. "
                    +"\nRevise que su computador este conectado a una \nred wifi o al cable LAN", "Problema de conexion", 0);
        }
    }
}
