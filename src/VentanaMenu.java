import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class VentanaMenu extends JFrame{
    public VentanaMenu(){
        //CREAR VENTANA
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(400,350);
        setTitle("Opciones");
        setLocationRelativeTo(null);
        setVisible(true);

        //CREA PANELES
        JPanel titulo = new JPanel();
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        //CREAR CUADRO DE TEXTO
        JLabel label = new JLabel();
        //CREAR BOTONES
        JButton jButton = new JButton();
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        JButton jButton3 = new JButton();
        JButton jButton4 = new JButton();
        //CONFIGURAR LOS PANELES
        //panel
        titulo.setBackground(Color.green);
        titulo.setBounds(20,0,340,50);
        this.getContentPane().add(titulo);
        //panel
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(20,50,340,50);
        this.getContentPane().add(panel);
        //panel
        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setBounds(20,100,340,50);
        this.getContentPane().add(panel1);
        //panel
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setBounds(20,150,340,50);
        //panel
        this.getContentPane().add(panel2);
        panel3.setBackground(Color.LIGHT_GRAY);
        panel3.setBounds(20,200,340,50);
        this.getContentPane().add(panel3);
        //panel
        panel4.setBackground(Color.LIGHT_GRAY);
        panel4.setBounds(20,250,340,50);
        this.getContentPane().add(panel4);
        //ASIGNAR VALORES AL CUADRO DE TEXTO
        label.setText("MENU");
        //ASIGNAR VALORES A LOS BOTONES
        jButton.setText("MOSTRAR USUARIO_PERIODICO");
        jButton1.setText("MOSTRAR PERIODICO");
        jButton2.setText("MOSTRAR USUARIOS");
        jButton3.setText("MOSTRAR CATEGORIAS");
        jButton4.setText("AGREGAR NUEVO");
        //CREAR ACTIONLISTERNER PARA DARLE ACCION AL BOTON
        ActionListener al = e -> {
            VentanaUsuarioPeriodico ventanaUsuarioPeriodico = new VentanaUsuarioPeriodico();
            ventanaUsuarioPeriodico.setVisible(true);
        };
        ActionListener al1 = e -> {
            VentanaPeriodico ventanaPeriodico = new VentanaPeriodico();
            ventanaPeriodico.setVisible(true);
        };
        ActionListener al2 = e -> {
            VentanaUsuario ventanaUsuario = new VentanaUsuario();
            ventanaUsuario.setVisible(true);
        };
        ActionListener al3 = e -> {
            VentanaCategoria ventanaCategoria = new VentanaCategoria();
            ventanaCategoria.setVisible(true);
        };
        ActionListener al4 = e -> {
            VentanaFormulario ventanaFormulario =new VentanaFormulario();
            ventanaFormulario.setVisible(true);
        };

        //AÑADIR LA ACCION
        jButton.addActionListener(al);
        jButton1.addActionListener(al1);
        jButton2.addActionListener(al2);
        jButton3.addActionListener(al3);
        jButton4.addActionListener(al4);

        //AÑADIR EL LABEL AL PANEL
        titulo.add(label);
        //AÑADIR LOS BOTONES A LOS PANELES
        panel.add(jButton);
        panel1.add(jButton1);
        panel2.add(jButton2);
        panel3.add(jButton3);
        panel4.add(jButton4);
        //AÑADIR LOS PANELES A LA VENTANA
        add(titulo);
        add(panel);
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
    }
}
