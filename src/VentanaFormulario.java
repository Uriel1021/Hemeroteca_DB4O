import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Date;


public class VentanaFormulario extends JFrame{
    public VentanaFormulario(){
        //CREAR VENTANA
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1200,950);
        setTitle("Formulario");
        setLocationRelativeTo(null);
        setVisible(true);

        //CREA PANELES
        JPanel titulo = new JPanel();
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        //CREAR CUADRO DE TEXTO
        JLabel label = new JLabel();
        //CREAR CAMPOS DE TEXTO
        JTextField textField = new JTextField();
        //CREAR BOTONES
        JButton jButton = new JButton();
        //CONFIGURAR LOS PANELES
        //panel
        titulo.setBackground(Color.green);
        titulo.setBounds(20,0,1140,50);
        this.getContentPane().add(titulo);
        //panel
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(20,50,1140,250);
        this.getContentPane().add(panel);
        //panel
        panel1.setBackground(Color.YELLOW);
        panel1.setBounds(20,300,1140,250);
        this.getContentPane().add(panel1);
        //panel
        panel2.setBackground(Color.WHITE);
        panel2.setBounds(20,550,1140,250);
        //panel
        this.getContentPane().add(panel2);
        panel3.setBackground(Color.RED);
        panel3.setBounds(20,800,1140,50);
        this.getContentPane().add(panel3);

        //ASIGNAR VALORES AL CUADRO DE TEXTO
        label.setText("MENU");
        //ASIGNAR VALORES A LOS BOTONES
        jButton.setText("AGREGAR");
        //CREAR ACTIONLISTERNER PARA DARLE ACCION AL BOTON
        ActionListener al = e -> {
            agregar();;
        };

        //AÑADIR LA ACCION
        jButton.addActionListener(al);

        //AÑADIR EL LABEL AL PANEL
        titulo.add(label);
        //AÑADIR LOS BOTONES A LOS PANELES
        panel.add(textField);
        panel3.add(jButton);
        //AÑADIR LOS PANELES A LA VENTANA
        add(titulo);
        add(panel);
        add(panel1);
        add(panel2);
        add(panel3);

    }
    public void agregar(){
        Categoria categoria = new Categoria(2,"Terror");
        Periodico periodico = new Periodico(1,"La maldicion","La cucaracha","Trevor","2001",2,1,new Date(),12,"la cucaracha no puede caminar","cucaracha,guitarra,fiesta","https://cucaracha.com",categoria,true,"C:/home/archivos","Trillas");
        Usuario usuario = new Usuario(2,"Magdiel","Mendez","Garcia","Ranix23@gmail.com","12345","Usuario",1,"Tamazulapam");
        UsuarioPeriodico usuarioPeriodico = new UsuarioPeriodico(periodico,usuario,new Date(),1);
        Db4o.almacenar(usuarioPeriodico);
        JOptionPane.showMessageDialog(null,"Se agrego exitosamente");
    }
}
