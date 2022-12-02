import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaPeriodico extends JFrame{
    public VentanaPeriodico(){
        //CREAR VENTANA
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1300,500);
        setTitle("Periodicos");
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

        ArrayList<Periodico> periodicos;
        UsuarioPeriodico myUsuarioPeriodico = new UsuarioPeriodico();
        periodicos = Db4o.mostrarPeriodico(myUsuarioPeriodico);

        String[] columnas = {"ID","NOMBRE DEL PERIODICO","TITULO","AUTOR","AÑO","TOMO","FECHA DE PULICACIÓN","RUTA DE ARCHIVO"};
        Object[][] objData = new Object[periodicos.size()][2];

        for (int i=0; i< periodicos.size();i++){
            Periodico periodico = periodicos.get(i);
            String[] p = {String.valueOf(periodico.getIdPeriodico()),periodico.getNombrePeriodico(),periodico.getTitulo(),periodico.getAutor(),periodico.getAnio(),String.valueOf(periodico.getTomo()),String.valueOf(periodico.getFechaPublicacion()),periodico.getRutaArchivo()};
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
