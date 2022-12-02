import java.util.Date;
public class Periodico {
    private int idPeriodico;
    private String nombrePeriodico;
    private String titulo;
    private String autor;
    private String anio;
    private int tomo;
    private int volumen;
    private Date fechaPublicacion;
    private int paginas;
    private String contenido;
    private String palabrasClave;
    private String enlaceExterno;
    private Categoria categoria;
    private boolean estatus;
    private String rutaArchivo;
    private String coleccion;

    public Periodico() {
    }

    public int getIdPeriodico() {return idPeriodico;}
    public String getNombrePeriodico() {return nombrePeriodico;}
    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public String getAnio() {return anio;}
    public int getTomo() {return tomo;}

    public int getVolumen() {return volumen;}
    public Date getFechaPublicacion() {return fechaPublicacion;}

    public int getPaginas() {return paginas;}

    public String getContenido() {return contenido;}

    public String getPalabrasClave() {return palabrasClave;}

    public String getEnlaceExterno() {return enlaceExterno;}
    public Categoria getCategoria() {return categoria;}

    public boolean isEstatus() {return estatus;}
    public String getRutaArchivo() {return rutaArchivo;}

    public String getColeccion() {return coleccion;}
    public Periodico(int idPeriodico, String nombrePeriodico, String titulo, String autor, String anio, int tomo, int volumen, Date fechaPublicacion, int paginas, String contenido, String palabrasClave, String enlaceExterno, Categoria categoria, boolean estatus, String rutaArchivo, String coleccion) {
        this.idPeriodico = idPeriodico;
        this.nombrePeriodico = nombrePeriodico;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.tomo = tomo;
        this.volumen = volumen;
        this.fechaPublicacion = fechaPublicacion;
        this.paginas = paginas;
        this.contenido = contenido;
        this.palabrasClave = palabrasClave;
        this.enlaceExterno = enlaceExterno;
        this.categoria = categoria;
        this.estatus = estatus;
        this.rutaArchivo = rutaArchivo;
        this.coleccion = coleccion;
    }
}
