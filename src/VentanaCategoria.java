import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaCategoria extends JFrame{
    public VentanaCategoria(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(600,500);
        setTitle("Categorias");
        setLocationRelativeTo(null);
        tabla();
    }

    private void tabla(){
        JTable tabla;
        JScrollPane panel;
        JPanel pane = new JPanel();

        //panel
        pane.setBackground(Color.GRAY);
        pane.setBounds(50,10,500,450);
        this.getContentPane().add(pane);


        ArrayList<Categoria> categorias;
        UsuarioPeriodico myUsuarioPeriodico = new UsuarioPeriodico();
        categorias = Db4o.mostrarCategoria(myUsuarioPeriodico);
        String[] columnas = {"ID","TEMA"};
        Object[][] objData = new Object[categorias.size()][2];
        for (int i=0; i< categorias.size();i++){
            Categoria categoria = categorias.get(i);
            String[] u = {String.valueOf(categoria.getIdTema()),categoria.getTema()};
            objData[i] = u;
        }

        tabla = new JTable(objData,columnas);
        tabla.setShowHorizontalLines( false );
        tabla.setRowSelectionAllowed( true );
        tabla.setColumnSelectionAllowed( true );
        // Cambiamos el color de la zona seleccionada (rojo/blanco)
        tabla.setSelectionForeground( Color.white );
        tabla.setSelectionBackground( Color.red );
        panel = new JScrollPane(tabla);
        pane.add(panel);
        add( pane, BorderLayout.CENTER );
    }


}
