import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaUsuario extends JFrame{
    public VentanaUsuario(){
        setSize(1300,500);
        setTitle("Usuarios");
        //setLocation(600,200);
        //setBounds(600,200,500,500);
        setLocationRelativeTo(null);
        iniciarComponente();
        tabla();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponente(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        this.getContentPane().add(panel);
    }

    private void tabla(){
        JTable tabla;
        JScrollPane panel;

        ArrayList<Usuario> user;
        UsuarioPeriodico myUsuarioPeriodico = new UsuarioPeriodico();
        user = Db4o.mostrarUsuario(myUsuarioPeriodico);

        String[] columnas = {"ID","NOMBRE","APELLIDO PATERNO","APELLIDO MATERNO","CORREO","CONTRASEÑA","TIPO USUARIO","ADSCRIPCION"};
        Object[][] objData = new Object[user.size()][8];

        for (int i=0; i< user.size();i++){
            Usuario usuario = user.get(i);
            String[] u = {String.valueOf(usuario.getIdUsuario()), usuario.getNombre(), usuario.getApPaterno(), usuario.getApMaterno(), usuario.getCorreo(), usuario.getContrasenia(), usuario.getTipoUsuario(),usuario.getAdscripcion()};
            objData[i] = u;
        }

        tabla = new JTable(objData,columnas);
        tabla.setShowHorizontalLines( false );
        tabla.setRowSelectionAllowed( true );
        tabla.setColumnSelectionAllowed( true );
        // Cambiamos el color de la zona seleccionada (rojo/blanco)
        tabla.setSelectionForeground( Color.white );
        tabla.setSelectionBackground( Color.red );
        panel = new JScrollPane( tabla );
        add( panel, BorderLayout.CENTER );

    }


}
