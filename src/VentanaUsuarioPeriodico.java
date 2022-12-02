import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaUsuarioPeriodico extends JFrame{
    public VentanaUsuarioPeriodico(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1300,500);
        setTitle("UsuariosPeriodicos");
        setLocationRelativeTo(null);
        iniciarComponente();
        tabla();

    }
    private void iniciarComponente(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        this.getContentPane().add(panel);
    }

    private void tabla(){
        JTable tabla;
        JScrollPane panel;
        ArrayList<UsuarioPeriodico> usuarioPeriodicos;

        UsuarioPeriodico myUsuarioPeriodico = new UsuarioPeriodico();
        usuarioPeriodicos = Db4o.mostrarTodo(myUsuarioPeriodico);



        String[] columnas = {"ID PERIODICO","TITULO","AUTOR","FECHA DE PUBLICACION","ID CATEGORIA","TEMA","ID USUARIO","NOMBRE","APELLIDO PATERNO","APELLIDO MATERNO"};
        Object[][] objData = new Object[usuarioPeriodicos.size()][10];

        for (int i=0; i< usuarioPeriodicos.size();i++){
            UsuarioPeriodico usuarioPeriodico = usuarioPeriodicos.get(i);
            Usuario usuario = usuarioPeriodico.getUsuario();
            Periodico periodico = usuarioPeriodico.getPeriodico();
            Categoria categoria = periodico.getCategoria();

            String[] p = {String.valueOf(periodico.getIdPeriodico()),periodico.getTitulo(),periodico.getAutor(),String.valueOf(periodico.getFechaPublicacion()),String.valueOf(categoria.getIdTema()),categoria.getTema(),String.valueOf(usuario.getIdUsuario()),usuario.getNombre(), usuario.getApPaterno(),usuario.getApMaterno()};
            objData[i] = p;
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
