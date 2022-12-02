import java.io.File;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;

public class Db4o {
    //METODO PARA ALMACENAR DATOS
    //RECIBE COMO PARAMETRO UN OBJETO DE TIPO UsuarioPeriodico
    //NO RETORNA NINGUN VALOR
    public static void almacenar(UsuarioPeriodico usuarioPeriodico) {
        ObjectContainer db = Db4oEmbedded.openFile(crearArchivo());
        boolean ok;
        try {
            //ALMACENAR USUARIOPERIODICO
            db.store(usuarioPeriodico);
            System.out.println("Datos almacenados.....");
        } finally {
            // CERRAR
            ok = db.close();
            System.out.println("Cerrado.....");
        }
    }

    //METODO PARA CREAR UN ARCHIVO .DB4O
    //SI EL ARCHIVO NO EXISTE LO CREA, DE LO CONTRARIO MANDA UN MENSAJE
    //RETORNA LA RUTAl
    private static String crearArchivo() {
        final String NOMBRE_ARCHIVO = "hemeroteca.db4o";
        boolean ok;
        String rutaAbsoluta = " ";
        try {
            File miArchivo = new File(NOMBRE_ARCHIVO);
            rutaAbsoluta = miArchivo.getAbsolutePath();
            if (miArchivo.exists()) {
                System.out.println("El archivo ya existe..");
            } else {
                ok = miArchivo.createNewFile();
                System.out.println("Archivo creado");
            }
        } catch (Exception ex) {
            System.out.println("NO se pudo crear el archivo" + ex.getMessage());
        }
        return rutaAbsoluta;
    }

    //METODO PARA OBTENER LA LISTA DE USUARIOS
    //RECIBE COMO PARAMETRO UN OBJETO DE TIPO UsuarioPeriodico
    // RETORNA UN ARRAYLIST DE TIPO Usuario
    public static ArrayList<Usuario> mostrarUsuario(UsuarioPeriodico usuarioPeriodico) {
        ObjectContainer db = Db4oEmbedded.openFile(crearArchivo());
        ObjectSet<UsuarioPeriodico> resultado = db.queryByExample(usuarioPeriodico);
        ArrayList<Usuario> user = new ArrayList<>();
        Usuario usuario;
        UsuarioPeriodico up;
        while (resultado.hasNext()) {
            up = resultado.next();
            usuario = up.getUsuario();
            user.add(usuario);
        }
        return user;
    }

    //METODO PARA OBTENER LA LISTA DE PERIODICOS
    //RECIBE COMO PARAMETRO UN OBJETO DE TIPO UsuarioPeriodico
    // RETORNA UN ARRAYLIST DE TIPO Periodico
    public static ArrayList<Periodico> mostrarPeriodico(UsuarioPeriodico usuarioPeriodico) {
        ObjectContainer db = Db4oEmbedded.openFile(crearArchivo());
        ObjectSet<UsuarioPeriodico> resultado = db.queryByExample(usuarioPeriodico);
        ArrayList<Periodico> periodicos = new ArrayList<>();
        Periodico periodico;
        UsuarioPeriodico up;
        while (resultado.hasNext()) {
            up = resultado.next();
            periodico = up.getPeriodico();
            periodicos.add(periodico);
        }
        return periodicos;
    }

    //METODO PARA OBTENER LA LISTA DE CATEGORIAS
    //RECIBE COMO PARAMETRO UN OBJETO DE TIPO UsuarioPeriodico
    // RETORNA UN ARRAYLIST DE TIPO Categoria
    public static ArrayList<Categoria> mostrarCategoria(UsuarioPeriodico usuarioPeriodico){
        ObjectContainer db = Db4oEmbedded.openFile(crearArchivo());
        ObjectSet<UsuarioPeriodico> resultado  = db.queryByExample(usuarioPeriodico);
        ArrayList<Categoria> categorias = new ArrayList<>();
        Periodico periodico;
        Categoria categoria;
        UsuarioPeriodico up;
        while (resultado.hasNext()){
            up = resultado.next();
            periodico = up.getPeriodico();
            categoria = periodico.getCategoria();
            categorias.add(categoria);
        }
        return categorias;
    }

    //METODO PARA OBTENER LA LISTA DE USUARIOSPERIODICOS
    //RECIBE COMO PARAMETRO UN OBJETO DE TIPO UsuarioPeriodico
    // RETORNA UN ARRAYLIST DE TIPO UsuarioPeriodico
    public static ArrayList<UsuarioPeriodico> mostrarTodo(UsuarioPeriodico usuarioPeriodico){
        ObjectContainer db = Db4oEmbedded.openFile(crearArchivo());
        ObjectSet<UsuarioPeriodico> resultado  = db.queryByExample(usuarioPeriodico);
        ArrayList<UsuarioPeriodico> usuariosPeriodicos = new ArrayList<>();
        UsuarioPeriodico up;
        while (resultado.hasNext()){
            up = resultado.next();
            usuariosPeriodicos.add(up);
        }
        return usuariosPeriodicos;
    }
}
