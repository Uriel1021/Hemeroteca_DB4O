import java.util.Date;

public class UsuarioPeriodico {
    private Periodico periodico;
    private Usuario usuario;
    private Date fecha;
    private int tipoOperacion;
    public UsuarioPeriodico() {
    }
    public Periodico getPeriodico() {return periodico;}
    public Usuario getUsuario() {return usuario;}

    public Date getFecha() {return fecha;}
    public int getTipoOperacion() {return tipoOperacion;}
    public UsuarioPeriodico(Periodico periodico, Usuario usuario, Date fecha, int tipoOperacion) {
        this.periodico = periodico;
        this.usuario = usuario;
        this.fecha = fecha;
        this.tipoOperacion = tipoOperacion;
    }
}
